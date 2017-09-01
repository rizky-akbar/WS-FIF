/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.dto.order.InvoiceDetailDto;
import com.fif.ws.model.dto.order.InvoiceHeaderDto;
import com.fif.ws.model.master.dto.ResponseMessage;
import com.fif.ws.util.CommonUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class InvoiceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String generateInvoiceNo(String branchId) {
        String applicationNo = null;

        try {
            String sql = "{ ? = call AP.GET_INVOICE_NO(?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1, OracleTypes.VARCHAR);
            cst.setString(2, branchId);
            cst.execute();
            applicationNo = (String) cst.getObject(1);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return applicationNo;
    }

    public ResponseMessage orderInvoice(InvoiceHeaderDto i) {

        String _sql_ = "SELECT d.INV_NO, d.PO_NO, d.APPL_NO from ordmgmt.OM_TRN_INV_HDR h, ordmgmt.OM_TRN_INV_dtl d "
                + " where h.INV_NO = d.INV_NO "
                + " and  d.appl_no = ? "
                + " and h.inv_status <> 'C' ";
        List<Map> lSql = new ArrayList<Map>();
        try {
            lSql = jdbcTemplate.query(_sql_, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map h = new HashMap();
                    h.put("applNo", rs.getString("APPL_NO"));
                    h.put("PO_NO", rs.getString("PO_NO"));
                    h.put("INV_NO", rs.getString("INV_NO"));
                    return h;
                }
            }, new Object[]{i.getInvoiceDetail().get(0).getApplicationNo()});
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        if (!lSql.isEmpty()) {
            return new ResponseMessage("00", "Success", lSql.get(0).get("INV_NO").toString());
        } else {

            //get Branch ID
            String _sql = "SELECT BRANCH_ID FROM ORDMGMT.OM_TRN_APPL_HDR WHERE APPL_NO = ?";
            List<Map> lMap = new ArrayList<Map>();
            try {
                lMap = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                    public Map mapRow(ResultSet rs, int i) throws SQLException {
                        Map m = new HashMap();
                        m.put("branch_id", rs.getString("branch_id"));
                        return m;
                    }
                }, new Object[]{i.getInvoiceDetail().get(0).getApplicationNo()});
                if (lMap.isEmpty()) {
                    return new ResponseMessage("31", "Appl No tidak ditemukan", "");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessage("31", "Appl No tidak ditemukan, " + e.getMessage(), "");
            }

            //Generate No Invoice
            i.setInvNo(generateInvoiceNo(lMap.get(0).get("branch_id").toString()));
            if (i.getInvNo().isEmpty()) {
                return new ResponseMessage("32", "Error generate Invoice Nomor", "");
            }

            //Insert Header
            _sql = "INSERT INTO ORDMGMT.OM_TRN_INV_HDR"
                    + "(INV_NO,BRANCH_ID,INV_DATE,INV_SUPPLIER,"
                    + "COY_ID,PAID_BY_HO,VIA_BANK,BUSS_UNIT,SUPP_CODE,BANK_ID,BANK_NAME,"
                    + "BANK_ACCNT,ACCNT_NAME,CURRENCY,RATE,TOTAL_OBJ,INV_STATUS,CREATE_BY,"
                    + "CREATE_DATE,INV_DEALER_DATE) ";

            _sql += "SELECT ?, A.BRANCH_ID, SYSDATE, ?,A.COY_ID,'Y','Y', "
                    + "A.BUSS_UNIT, A.SUPP_CODE,B.SUPL_BANK_ID, B.SUPL_BANK_NAME, B.SUPL_ACCOUNT_NO, "
                    + "B.SUPL_ACCOUNT_NAME,A.CURRENCY, A.RATE, A.TOTAL_OBJ,'N' INV_STATUS, 'SYSTEM', "
                    + "SYSDATE, ? INV_DEALER_DATE"
                    + " FROM ORDMGMT.OM_TRN_APPL_HDR A, FIFAPPS.FS_MST_SUPPLIER_ACCT B "
                    + " WHERE A.appl_no = ? AND ROWNUM < 2"
                    + " AND A.SUPP_CODE = B.SUPL_CODE AND B.SUPL_ACC_STATUS = 'AC'";
            try {
                jdbcTemplate.update(_sql,
                        new Object[]{i.getInvNo(),
                            i.getInvoiceNoSupplier(), CommonUtil.parseStringToDate(i.getInvoiceDealerDate()),
                            i.getInvoiceDetail().get(0).getApplicationNo()});

            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessage("33", "Error Save OM_TRN_INV_HDR, " + e.getMessage(), "");
            }

            return new ResponseMessage("01", "Success", i.getInvNo());
        }
    }

    public ResponseMessage invoiceDetailOrder(InvoiceHeaderDto i) {

        //Insert Detail
        String _sql = "INSERT INTO ORDMGMT.OM_TRN_INV_DTL(SEQ_NO,BRANCH_ID,PO_NO,PO_SEQ_NO,APPL_NO,APPL_SEQ_NO,CREATE_BY,CREATE_DATE,INV_NO) ";

        _sql += "select rownum SEQ_NO, a.BRANCH_ID, a.po_no, a.seq_no PO_SEQ_NO, a.APPL_NO,a.appl_seq_no, 'SYSTEM', SYSDATE, ? "
                + " from ORDMGMT.om_trn_po_dtl a "
                + " where a.appl_no = ? ";
        try {
            jdbcTemplate.update(_sql,
                    new Object[]{i.getInvNo(),
                        i.getInvoiceDetail().get(0).getApplicationNo()});
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("34", "Error Save OM_TRN_INV_DTL, " + e.getMessage(), "");
        }

        //Update Appl Hdr
        _sql = "UPDATE ORDMGMT.OM_TRN_APPL_HDR Set INV_FLAG = 'Y' where APPL_NO = ?";
        try {
            jdbcTemplate.update(_sql,
                    new Object[]{i.getInvoiceDetail().get(0).getApplicationNo()});
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("35", "Error Update OM_TRN_APPL_HDR, " + e.getMessage(), "");
        }
        for (InvoiceDetailDto iD : i.getInvoiceDetail()) {
            //Update Appl Object
            _sql = "UPDATE ORDMGMT.OM_TRN_APPL_OBJECT set BAST_DATE = ?, BAST_NO = ?, INV_DATE=SYSDATE, INV_FLAG = 'Y', INV_NO = ? "
                    + "where APPL_NO=? and SEQ_NO=?";

            try {
                jdbcTemplate.update(_sql, new Object[]{
                    CommonUtil.parseStringToDate(iD.getBast_date()),
                    iD.getBast_no(),
                    i.getInvNo(),
                    iD.getApplicationNo(),
                iD.getApplicationSequenceNo()});
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessage("35", "Error Save OM_TRN_APPL_OBJECT, " + e.getMessage(), "");
            }
        };

        //Update PO Dtl
        _sql = "UPDATE ORDMGMT.OM_TRN_PO_DTL Set RCV_INV_DATE = SYSDATE, INV_NO = ?, INV_FLAG = 'Y', INV_DATE = SYSDATE where APPL_NO = ?";
        try {
            jdbcTemplate.update(_sql,
                    new Object[]{i.getInvNo(), i.getInvoiceDetail().get(0).getApplicationNo()});
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("35", "Error Update OM_TRN_PO_DTL, " + e.getMessage(), "");
        }

        return new ResponseMessage("00", "Success", i.getInvNo());
    }

}
