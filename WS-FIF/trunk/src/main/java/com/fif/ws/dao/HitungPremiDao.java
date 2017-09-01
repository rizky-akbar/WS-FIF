/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.dto.ResponseMessage;
import com.fif.ws.model.master.dto.ResponseMessageMap;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class HitungPremiDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Double hitungPremiOra(String productNo, String branchId, int top, double totalAmount) {

        Double premi = null;
        try {
            String sql = "{ ? = call ORDMGMT.om_other_schema_pkg.f_get_ins_premi(?,?,?,?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1, OracleTypes.NUMBER);
            cst.setString(2, productNo);
            cst.setString(3, branchId);
            cst.setInt(4, top);
            cst.setDouble(5, totalAmount);
            cst.registerOutParameter(6, OracleTypes.VARCHAR);
            cst.execute();
            System.out.println("premi # " + cst.getDouble(1));
            premi = (Double) cst.getObject(1);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fuckyeah");
        }
        return ((Double)premi);
    }

   
    public ResponseMessage premiRate(String productNo, String branchId, int top, double totalAmount) {

        BigDecimal premi = null;
        try {
            String sql = "{ ? = call ORDMGMT.om_other_schema_pkg.f_get_ins_premi(?,?,?,?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1, OracleTypes.DECIMAL);
            cst.setString(2, productNo);
            cst.setString(3, branchId);
            cst.setInt(4, top);
            cst.setDouble(5, totalAmount);
            cst.registerOutParameter(6, OracleTypes.VARCHAR);
            cst.execute();
            System.out.println("premi # " + cst.getBigDecimal(1));
            premi = (BigDecimal) cst.getObject(1);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("gagal");
        }

        String _sql = "select RATE_NO from INSC.INSC_MST_PRODUCT_BRANCH "
                + "where PRODUCT_NO=? and BRANCH_ID=?";
        List<Map> lMapObj = new ArrayList<Map>();
        try {
            lMapObj = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {

                    Map m = new HashMap();
                    m.put("rateNo", rs.getString("RATE_NO"));
                    return m;
                }
            },new Object[]{productNo,branchId});
            if(lMapObj.isEmpty()){
                return new ResponseMessage("29", "error hitung premi", "");
            }else{
                return new ResponseMessage
        ("00", "Success",String.valueOf(premi)+"|"+lMapObj.get(0).get("rateNo"));
            }
        } catch (Exception e) {
            return new ResponseMessage("29", "error hitung premi, " +e.getMessage(), "");
        }
    }

//          public ResponseMessage approvePO(String applNo){
//        try {
//            String sql = "{ ? = call ORDMGMT.PKG_PO.approve_order(?,?)}";
//            Connection con = jdbcTemplate.getDataSource().getConnection();
//            CallableStatement cst = con.prepareCall(sql);
//            cst.registerOutParameter(1, OracleTypes.VARCHAR);
//            cst.setString(2, applNo);
//            cst.setString(3, "10283");
//            cst.execute();
//            System.out.println("approve_order # " + cst.getString(1));
//            
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseMessage("29", "Error Approval Order, " + e.getMessage(), "");
//        }
//        
//        String _sql = "select distinct a.po_no from om_trn_po_dtl a, om_trn_po_hdr b where a.appl_no = ? and a.po_no = b.po_no";
//        List<Map> lMapObj = new ArrayList<Map>();
//        try{
//            lMapObj = jdbcTemplate.query(_sql, new RowMapper<Map>() {
//
//                public Map mapRow(ResultSet rs, int i) throws SQLException {
//                    Map m = new HashMap();
//                    m.put("po_no", rs.getString("po_no"));
//                    return m;
//                }
//            }, new Object[]{applNo});
//            if(lMapObj.isEmpty()){
//                return new ResponseMessage("14", "Nomor PO tidak ditemukan", "");
//            }else{
//                lMapObj.get(0).put("appl_no", applNo);
//                return new ResponseMessage("00", "Success", applNo + "|" + lMapObj.get(0).get("po_no"));
//            }
//            
//            
//        }catch(Exception e){
//            e.printStackTrace();
//            return new ResponseMessage("14", "Nomor PO tidak ditemukan, " + e.getMessage(), "");
//        }
//        //return new ResponseMessage("00", "Success", applNo);
//    }
}

