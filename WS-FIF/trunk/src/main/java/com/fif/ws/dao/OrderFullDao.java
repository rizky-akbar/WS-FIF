/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.dto.order.ObjectPembiayaanSchemeObject;
import com.fif.ws.model.master.dto.ResponseMessage;
import com.fif.ws.model.dto.order.OrderFullDocuments;
import com.fif.ws.model.dto.order.OrderFullHeaderDto;
import com.fif.ws.model.dto.order.OrderFullObjectPembiayaan;
import com.fif.ws.model.master.dto.ResponseMessageMap;
import com.fif.ws.util.CommonUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class OrderFullDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String genApplicationNo(String branchId) {
        String applicationNo = null;
        try {
            String sql = "{ ? = call ORDMGMT.OM_F_GEN_APPLNO(?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1, OracleTypes.VARCHAR);
            cst.setString(2, branchId);
            cst.registerOutParameter(3, OracleTypes.VARCHAR);
            cst.execute();
            applicationNo = (String) cst.getObject(1);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return applicationNo;
    }

    public ResponseMessageMap insertFullOrder(OrderFullHeaderDto o) {
        ResponseMessageMap resp = new ResponseMessageMap();
        List<Map> lRespRef = new ArrayList<Map>();

        try {
            o.setApplNo(genApplicationNo(o.getOfficeCode()));
            if (o.getApplNo().equals("")) {
                resp = new ResponseMessageMap("12", "Error Generate Appl No", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("12", "Error Generate Appl No, " + e.getMessage(), null);
        }

        String _sql = "select 'I' CUST_TYPE, a.KTP_CUST_NAME, a.cust_name, a.birth_date,"
                + " a.birth_place, a.cust_title, a.mothers_name,"
                + "a.CUST_ADDR, a.CUST_RT, a.CUST_RW, a.CUST_KEL_CODE, a.CUST_KEL, a.CUST_KEC_CODE ,"
                + "a.CUST_KEC, a.CUST_CITY_CODE, a.CUST_CITY , a.CUST_ZIP , a.CUST_PROV_CODE ,"
                + "a.CUST_SUB_ZIP , a.CUST_PROV , a.CUST_FIXPH_AREA , a.CUST_FIXPHONE ,"
                + "a.CUST_FAX_AREA, a.CUST_FAXIMILE, a.CUST_MOBPHONE, a.CUST_EMAIL,"
                + "a.HOUSE_STAT, a.OCPT_CODE, a.SALARY, a.CUST_MOBPHONE_2, a.CUST_CATEGORY,"
                + "a.CUST_TYPE_ID, a.EMP_LOAN, a.MARITAL_STAT, a.MARRIED_DATE, a.CUST_SEX,"
                + " a.NO_OF_DEPEND, a.SERVICE_YEAR, a.OCPT_TYPE,"
                + "a.OCPT_SUB_CODE, a.SPOUSE_SALARY, a.OTHER_SALARY, a.MONTH_EXP,"
                + " a.EDU_TYPE, a.RELG_ID, b.ocpt_on_id"
                + " from fifapps.fs_mst_cust_ind a, fifapps.fs_mst_cust b "
                + "where a.cust_no=b.cust_no and a.cust_no = ?";
        List<Map> lMapCust = new ArrayList<Map>();
        try {
            lMapCust = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map m = new HashMap();
                    m.put("cust_type", rs.getString("cust_type"));
                    m.put("ktp_cust_name", rs.getString("ktp_cust_name"));
                    m.put("cust_name", rs.getString("cust_name"));
                    m.put("birth_date", rs.getDate("birth_date"));
                    m.put("birth_place", rs.getString("birth_place"));
                    m.put("cust_title", rs.getString("cust_title"));
                    m.put("mothers_name", rs.getString("mothers_name"));
                    m.put("CUST_ADDR", rs.getString("CUST_ADDR"));
                    m.put("CUST_RT", rs.getString("CUST_RT"));
                    m.put("CUST_RW", rs.getString("CUST_RW"));
                    m.put("CUST_KEL_CODE", rs.getString("CUST_KEL_CODE"));
                    m.put("CUST_KEL", rs.getString("CUST_KEL"));
                    m.put("CUST_KEC_CODE", rs.getString("CUST_KEC_CODE"));
                    m.put("CUST_KEC", rs.getString("CUST_KEC"));
                    m.put("CUST_CITY_CODE", rs.getString("CUST_CITY_CODE"));
                    m.put("CUST_CITY", rs.getString("CUST_CITY"));
                    m.put("CUST_ZIP", rs.getString("CUST_ZIP"));
                    m.put("CUST_PROV_CODE", rs.getString("CUST_PROV_CODE"));
                    m.put("CUST_SUB_ZIP", rs.getString("CUST_SUB_ZIP"));
                    m.put("CUST_PROV", rs.getString("CUST_PROV"));
                    m.put("CUST_FIXPH_AREA", rs.getString("CUST_FIXPH_AREA"));
                    m.put("CUST_FIXPHONE", rs.getString("CUST_FIXPHONE"));
                    m.put("CUST_FAX_AREA", rs.getString("CUST_FAX_AREA"));
                    m.put("CUST_FAXIMILE", rs.getString("CUST_FAXIMILE"));
                    m.put("CUST_MOBPHONE", rs.getString("CUST_MOBPHONE"));
                    m.put("CUST_EMAIL", rs.getString("CUST_EMAIL"));
                    m.put("HOUSE_STAT", rs.getString("HOUSE_STAT"));
                    m.put("OCPT_CODE", rs.getString("OCPT_CODE"));
                    m.put("SALARY", rs.getString("SALARY"));
                    m.put("CUST_MOBPHONE_2", rs.getString("CUST_MOBPHONE_2"));
                    m.put("CUST_CATEGORY", rs.getString("CUST_CATEGORY"));
                    m.put("CUST_TYPE_ID", rs.getString("CUST_TYPE_ID"));
                    m.put("EMP_LOAN", rs.getString("EMP_LOAN"));
                    m.put("MARITAL_STAT", rs.getString("MARITAL_STAT"));
                    m.put("MARRIED_DATE", rs.getDate("MARRIED_DATE"));
                    m.put("CUST_SEX", rs.getString("CUST_SEX"));
                    m.put("NO_OF_DEPEND", rs.getDouble("NO_OF_DEPEND"));
                    m.put("SERVICE_YEAR", rs.getDouble("SERVICE_YEAR"));
                    m.put("OCPT_TYPE", rs.getString("OCPT_TYPE"));
                    m.put("OCPT_SUB_CODE", rs.getString("OCPT_SUB_CODE"));
                    m.put("SPOUSE_SALARY", rs.getDouble("SPOUSE_SALARY"));
                    m.put("OTHER_SALARY", rs.getDouble("OTHER_SALARY"));
                    m.put("MONTH_EXP", rs.getDouble("MONTH_EXP"));
                    m.put("EDU_TYPE", rs.getString("EDU_TYPE"));
                    m.put("RELG_ID", rs.getString("RELG_ID"));
                    m.put("ocpt_on_id", rs.getString("ocpt_on_id"));
                    return m;
                }
            }, new Object[]{o.getCustomerNo()});
            if (lMapCust.isEmpty()) {
                return new ResponseMessageMap("13", "Customer No tidak ditemukan", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("13", "Customer No tidak ditemukan, " + e.getMessage(), null);
        }

        //select empl_code
        String _sqS = "select e.empl_code, s.koor_surv_id from fifapps.fs_mst_employees e, ordmgmt.om_mst_koor_surveyor s "
                + "where "
                + "(e.empl_secujob='G00038' and e.empl_status='PM' and s.nik(+) = e.empl_code and s.branch_id(+) = e.empl_branch) and empl_branch=?";
        List<Map> lMapCust1 = new ArrayList<Map>();
        try {
            lMapCust1 = jdbcTemplate.query(_sqS, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map ma = new HashMap();
                    ma.put("empl_code", rs.getString("empl_code"));
                    ma.put("koor_surv_id", rs.getString("koor_surv_id"));
                    return ma;
                }
            }, new Object[]{o.getOfficeCode()});
            if (lMapCust1.isEmpty()) {
                return new ResponseMessageMap("14", "data tidak ditemukan, ", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("14", "data tidak ditemukan, " + e.getMessage(), null);
        }

        //Insert Om Trn Appl Header
        _sql = " INSERT INTO ORDMGMT.OM_TRN_APPL_HDR (ORDER_STAT, survey_stat, completeness, POOLING_FLAG, "
                + "COY_ID, BRANCH_ID, APPL_NO, SERV_OFFICE_CODE, "
                + "APPL_DATE, CUST_TYPE, CUST_NO, KTP_CUST_NAME, "
                + "PLATFORM, BUSS_UNIT, PROG_CODE, SUPP_CODE,"
                + " SO_CODE, TOT_PROD_PRICE, TOTAL_DP, TOTAL_OBJ, "
                + "BRANCH_AR, CREATE_BY, CREATE_DATE, KOORD_SURV_NIK, "
                + "CUST_NAME, BIRTH_DATE, BIRTH_PLACE, CUST_TITLE,"
                + " MOTHERS_NAME, BRANCH_DEST, CUST_ADDR, CUST_RT,"
                + " CUST_RW, CUST_KEL_CODE, CUST_KEL, CUST_KEC_CODE, "
                + "CUST_KEC, CUST_CITY_CODE, CUST_CITY, CUST_ZIP, "
                + "CUST_PROV_CODE, CUST_SUB_ZIP, CUST_PROV, CUST_FIXPH_AREA, "
                + "CUST_FIXPHONE, CUST_FAX_AREA, CUST_FAXIMILE, CUST_MOBPHONE, "
                + "CUST_EMAIL, HOUSE_STAT, OCPT_CODE, "
                + "SALARY, CUST_MOBPHONE_2, CUST_CATEGORY,"
                + "OCPT_ON_ID, CUST_TYPE_ID, EMPL_LOAN, MARITAL_STAT, "
                + "MARRIED_DATE, CUST_SEX, NO_OF_DEPEND, SERVICE_YEAR, "
                + "OCPT_TYPE, OCPT_SUB_CODE, SPOUSE_SALARY, "
                + "OTHER_INCOME, MONTHLY_EXPENSE,  "
                + " EDU_TYPE, RELG_ID, "
                + "SCHEME_TYPE, CURRENCY, RATE, SURVEY_COMM, "
                + "SOURCE_INPUT, FLAG_POT_GAJI, INV_FLAG, NEED_ADD_COLL, "
                + "APPR_ID, COLL_RCV_STAT, SURVEY_RESULT, DOC_COMPLETE, "
                + "APPROVE_COMMENT, PPDCF_PAID, PO_PENDING_REASON, "
                + "APPR_ID_OVERRIDE, IA_FLAG, RO_TYPE, PROG_ID, KOOR_SURV_ID) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?, "
                + "?,?,?,?, "
                + "?,?,?,?, "
                + "?,?,?,?, "
                + "?,?,?,?, "
                + "?,?,?,?)";
        try {
            jdbcTemplate.update(_sql,
                    new Object[]{"R", "S", "C", "P",
                        "02", o.getOfficeCode(), o.getApplNo(), o.getServiceOfficeCode(), new Date(),
                        lMapCust.get(0).get("cust_type"), o.getCustomerNo(), lMapCust.get(0).get("ktp_cust_name"), o.getPlatform(),
                        o.getBusinessUnit(), o.getProgramCode(), o.getSupplierCode(), "S14",
                        CommonUtil.parseStringToDouble(o.getTotalProductPrice()), CommonUtil.parseStringToDouble(o.getTotalDp()),
                        CommonUtil.parseStringToDouble(o.getTotalObject()), o.getBranchAR(),
                        "SYSTEM", new Date(), lMapCust1.get(0).get("empl_code"), lMapCust.get(0).get("cust_name"),
                        lMapCust.get(0).get("birth_date"), lMapCust.get(0).get("birth_place"),
                        lMapCust.get(0).get("cust_title"), lMapCust.get(0).get("mothers_name"), o.getBranchDest(),
                        lMapCust.get(0).get("CUST_ADDR"), lMapCust.get(0).get("CUST_RT"),
                        lMapCust.get(0).get("CUST_RW"), lMapCust.get(0).get("CUST_KEL_CODE"),
                        lMapCust.get(0).get("CUST_KEL"), lMapCust.get(0).get("CUST_KEC_CODE"),
                        lMapCust.get(0).get("CUST_KEC"), lMapCust.get(0).get("CUST_CITY_CODE"),
                        lMapCust.get(0).get("CUST_CITY"), lMapCust.get(0).get("CUST_ZIP"),
                        lMapCust.get(0).get("CUST_PROV_CODE"), lMapCust.get(0).get("CUST_SUB_ZIP"),
                        lMapCust.get(0).get("CUST_PROV"),
                        lMapCust.get(0).get("CUST_FIXPH_AREA"), lMapCust.get(0).get("CUST_FIXPHONE"),
                        lMapCust.get(0).get("CUST_FAX_AREA"),
                        lMapCust.get(0).get("CUST_FAXIMILE"), lMapCust.get(0).get("CUST_MOBPHONE"),
                        lMapCust.get(0).get("CUST_EMAIL"), lMapCust.get(0).get("HOUSE_STAT"),
                        lMapCust.get(0).get("OCPT_CODE"),
                        lMapCust.get(0).get("SALARY"),
                        lMapCust.get(0).get("CUST_MOBPHONE_2"),
                        lMapCust.get(0).get("CUST_CATEGORY"),
                        lMapCust.get(0).get("ocpt_on_id"),
                        lMapCust.get(0).get("CUST_TYPE_ID"), lMapCust.get(0).get("EMPL_LOAN"),
                        lMapCust.get(0).get("MARITAL_STAT"), lMapCust.get(0).get("MARRIED_DATE"),
                        lMapCust.get(0).get("CUST_SEX"), lMapCust.get(0).get("NO_OF_DEPEND"),
                        lMapCust.get(0).get("SERVICE_YEAR"),
                        lMapCust.get(0).get("OCPT_TYPE"), lMapCust.get(0).get("OCPT_SUB_CODE"),
                        lMapCust.get(0).get("SPOUSE_SALARY"), lMapCust.get(0).get("OTHER_SALARY"),
                        lMapCust.get(0).get("MONTH_EXP"), lMapCust.get(0).get("EDU_TYPE"),
                        lMapCust.get(0).get("RELG_ID"),
                        "R", "IDR", "1", "PROGRAM KARTU SPEKTRA",
                        "U", "N", "N", "N",
                        "AP01", "N", "PROGRAM KARTU SPEKTRA", "N",
                        "PROGRAM KARTU SPEKTRA ,program spesial bagi pelanggan setia FIFGROUP .inovatif,cepat,dan mudah.", "N", "PO001",
                        "AP01", null, "RO1", "RG",lMapCust1.get(0).get("koor_surv_id")});
            System.out.println("cobaaaa sukes");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("21", "Error Save Appl Header, " + e.getMessage(), null);
        }

        //Insert OM_TRN_APPL_ADDR
        _sql = "insert into ORDMGMT.OM_TRN_APPL_ADDR (APPL_NO,IDENTITY_NO,IDENT_TYPE,"
                + "ID_CUST_ADDR,ID_CUST_CITY,ID_CUST_CITY_CODE,ID_CUST_KEC,ID_CUST_KEC_CODE,"
                + "ID_CUST_KEL,ID_CUST_KEL_CODE,ID_CUST_PROV,ID_CUST_PROV_CODE,ID_CUST_RT,"
                + "ID_CUST_RW,ID_CUST_SUB_ZIP,ID_CUST_ZIP,CREATE_BY,CREATE_DATE,"
                + "EMER_NAME,EMER_ADDR,EMER_RT,EMER_RW,EMER_KEL_CODE,"//batas coba
                + "EMER_KEL,EMER_KEC_CODE,EMER_KEC,EMER_CITY_CODE,EMER_CITY,"
                + "EMER_ZIP,EMER_PROV_CODE,EMER_PROV,EMER_FIXPH_AREA,EMER_FIXPHONE,"
                + "EMER_FAX_AREA,EMER_FAXIMILE,EMER_MOBPHONE,EMER_MOBPHONE_2,EMER_EMAIL,"
                + "OFFICE_NAME,OFF_ADDR,OFF_RT,OFF_RW,OFF_KEL_CODE,"
                + "OFF_KEL,OFF_KEC_CODE,OFF_KEC,OFF_CITY_CODE,OFF_CITY,"
                + "OFF_ZIP,OFF_PROV_CODE,OFF_PROV,OFF_FIXPH_AREA,OFF_FIXPHONE,"
                + "OFF_FAX_AREA,OFF_FAXIMILE,OFF_MOBPHONE,OFF_MOBPHONE_2,OFF_EMAIL,"
                + "MAIL_NAME,MAIL_ADDR,MAIL_RT,MAIL_RW,MAIL_KEC,"
                + "MAIL_CITY,MAIL_ZIP,MAIL_PROV,MAIL_FIXPHONE,MAIL_FAX_AREA,"
                + "MAIL_FAXIMILE,MAIL_MOBPHONE,MAIL_MOBPHONE_2,MAIL_KEL_CODE,MAIL_KEC_CODE,"
                + "MAIL_CITY_CODE,MAIL_PROV_CODE,EMER_HUB,OFF_TITLE) "//batas coba
                + " select ?,IDENTITY_NO,IDENT_TYPE,ID_CUST_ADDR,ID_CUST_CITY,"
                + "ID_CUST_CITY_CODE,ID_CUST_KEC,ID_CUST_KEC_CODE,ID_CUST_KEL,ID_CUST_KEL_CODE,"
                + "ID_CUST_PROV,ID_CUST_PROV_CODE,ID_CUST_RT,ID_CUST_RW,ID_CUST_SUB_ZIP,"
                + "ID_CUST_ZIP,'SYSTEM',SYSDATE,"
                + " b.EMER_NAME,b.EMER_ADDR,b.EMER_RT,b.EMER_RW,b.EMER_KEL_CODE,"
                + "b.EMER_KEL,b.EMER_KEC_CODE,b.EMER_KEC,b.EMER_CITY_CODE,b.EMER_CITY,"
                + "b.EMER_ZIP,b.EMER_PROV_CODE,b.EMER_PROV,b.EMER_FIXPH_AREA,b.EMER_FIXPHONE,"
                + "b.EMER_FAX_AREA,b.EMER_FAXIMILE,b.EMER_MOBPHONE,b.EMER_MOBPHONE_2,b.EMER_EMAIL,"
                + "b.OFFICE_NAME,b.OFF_ADDR,b.OFF_RT,b.OFF_RW,b.OFF_KEL_CODE,"
                + "b.OFF_KEL,b.OFF_KEC_CODE,b.OFF_KEC,b.OFF_CITY_CODE,b.OFF_CITY,"
                + "b.OFF_ZIP,b.OFF_PROV_CODE,b.OFF_PROV,b.OFF_FIXPH_AREA,b.OFF_FIXPHONE,"
                + "b.OFF_FAX_AREA,b.OFF_FAXIMILE,b.OFF_MOBPHONE,b.OFF_MOBPHONE_2,b.OFF_EMAIL,"
                + "a.MAIL_NAME,a.MAIL_ADDR,a.MAIL_RT,a.MAIL_RW,a.MAIL_KEC,"
                + "a.MAIL_CITY,a.MAIL_ZIP,a.MAIL_PROV,a.MAIL_FIXPHONE,a.MAIL_FAX_AREA,"
                + "a.MAIL_FAXIMILE,a.MAIL_MOBPHONE,a.MAIL_MOBPHONE_2,a.MAIL_KEL_CODE,a.MAIL_KEC_CODE,"
                + "a.MAIL_CITY_CODE,a.MAIL_PROV_CODE,b.EMER_HUB,b.OFF_TITLE"
                + " from FS_MST_CUST a, FS_MST_CUST_IND b where a.CUST_NO = b.CUST_NO and a.CUST_NO=?";

        try {
            jdbcTemplate.update(_sql,
                    new Object[]{o.getApplNo(), o.getCustomerNo()});
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("21", "Error Save OM_TRN_APPL_ADDR, " + e.getMessage(), null);
        }

        //Insert Appl OM_TRN_APPL_OBJECT
        try {
            int seqObj = 0;
            for (OrderFullObjectPembiayaan oO : o.getObjectPembiayaan()) {
                seqObj++;
                _sql = "SELECT OBJ_GRP, OBJ_DESCR FROM ORDMGMT.OM_MST_OBJ_CODE WHERE OBJ_CODE = ?";
                List<Map> lMapObj = new ArrayList<Map>();
                try {
                    lMapObj = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                        public Map mapRow(ResultSet rs, int i) throws SQLException {
                            Map m = new HashMap();
                            m.put("obj_grp", rs.getString("obj_grp"));
                            m.put("OBJ_DESCR", rs.getString("OBJ_DESCR"));
                            return m;
                        }
                    }, new Object[]{oO.getObjectCode()});
                    if (lMapObj.isEmpty()) {
                        return new ResponseMessageMap("14", "Object Group tidak ditemukan", null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return new ResponseMessageMap("14", "Object Group tidak ditemukan, " + e.getMessage(), null);
                }

                _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_OBJECT (SUPP_CODE,trf_dealer,po_flag, APPL_NO, BRANCH_ID, SEQ_NO, OBJ_GRP, OBJ_CODE, NEW_USED,"
                        + " OBJ_BRAND, OBJ_MODEL, OBJ_TYPE, OBJ_SIZE, OBJ_TAHUN, OBJ_PRICE,"
                        + " QTY, CUST_DP, MONTH_INST, INS_PRODUCT, RATE_NO, SERIAL_NO,"
                        + " NOSIN, NOKA, NO_POLISI, WARNA, STNK_DATE, CREATE_BY, CREATE_DATE,DP_RECBY,DP_RECV_DLR,DP_RECV_FIF,TOTAL_AMOUNT,ADM_DLL,GRS_DP,"
                        + "COLL_KIND,BPKB_SAME_NAME,INS_INCL_CRDT,OBJ_DESC,INS_FLAG) "
                        + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                        + "?,?,?,?,?)";

                jdbcTemplate.update(_sql,
                        new Object[]{o.getSupplierCode(), CommonUtil.parseStringToDouble(oO.getObjectPrice()) - CommonUtil.parseStringToDouble(oO.getCustomerDp()), "N", o.getApplNo(), o.getOfficeCode(),
                            seqObj, lMapObj.get(0).get("obj_grp"),
                            oO.getObjectCode(), oO.getNewUsed(), oO.getObjectBrand(), oO.getObjectModel(),
                            oO.getObjectType(), oO.getObjectSize(), CommonUtil.parseStringToDouble(oO.getObjectYear()),
                            CommonUtil.parseStringToDouble(oO.getObjectPrice()),
                            CommonUtil.parseStringToDouble(oO.getQuantity()), CommonUtil.parseStringToDouble(oO.getCustomerDp()),
                            CommonUtil.parseStringToDouble(oO.getMonthInstallment()), null,
                            null, oO.getSerialNo(), oO.getNomerMesin(), oO.getNomerRangka(),
                            oO.getNomerPolisi(), oO.getWarna(), CommonUtil.parseStringToDate(oO.getStnkDate()),
                            "SYSTEM", new Date(), "D", CommonUtil.parseStringToDouble(oO.getCustomerDp()), 0, CommonUtil.parseStringToDouble(oO.getObjectPrice()),
                            CommonUtil.parseStringToDouble(o.getStrukturKredit().getAdmin()), CommonUtil.parseStringToDouble(oO.getCustomerDp()),
                            "1", "S", "N", lMapObj.get(0).get("OBJ_DESCR").toString(), "N"});

                Map m = new HashMap();
                m.put("applNo", o.getApplNo());
                m.put("objSeqNo", seqObj);
                m.put("objCode", oO.getObjectCode());
                m.put("poNo", "92900020700012");

                lRespRef.add(m);

                //hitung asuransi
                if (!oO.getInsuranceProduct().isEmpty()) {
                    String VPRODUCTNO;
                    String VRATENO;
                    String VINSCCOYID;
                    String VTYPEID;
                    String INS_INCL_CRDT;

                    try {
                        _sql = "{call ORDMGMT.OM_CHECK_INSURANCE_PREMI(?,?,?,?,?,?,?,?,?,?)}";
                        Connection con = jdbcTemplate.getDataSource().getConnection();
                        CallableStatement cst = con.prepareCall(_sql);
                        cst.setString(1, "02");
                        cst.setString(2, o.getPlatform());
                        cst.setString(3, o.getOfficeCode());
                        cst.setString(4, lMapObj.get(0).get("obj_grp").toString());
                        cst.setString(5, oO.getObjectCode());
                        cst.setDouble(6, CommonUtil.parseStringToDouble(o.getStrukturKredit().getTop()));
                        cst.registerOutParameter(7, OracleTypes.VARCHAR);
                        cst.registerOutParameter(8, OracleTypes.VARCHAR);
                        cst.registerOutParameter(9, OracleTypes.VARCHAR);
                        cst.registerOutParameter(10, OracleTypes.VARCHAR);

                        cst.execute();
                        VPRODUCTNO = (String) cst.getObject(7);
                        VRATENO = (String) cst.getObject(8);
                        VINSCCOYID = (String) cst.getObject(9);
                        VTYPEID = (String) cst.getObject(10);

                        con.close();
                        if (VINSCCOYID.isEmpty()) {
                            return new ResponseMessageMap("43", "gagal hitung premi, ", null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new ResponseMessageMap("44", "Gagal hitung premi, " + e.getMessage(), null);
                    }

                    if (o.getStrukturKredit().getAdvArrear() == "AD" || o.getStrukturKredit().getAdvArrear().equalsIgnoreCase("AD")) {
                        INS_INCL_CRDT = "N";
                    } else {
                        INS_INCL_CRDT = "Y";
                    }
                    if (!VINSCCOYID.isEmpty()) {
                        //update insurance product
                        _sql = "UPDATE ORDMGMT.OM_TRN_APPL_OBJECT Set INS_FLAG = 'Y', "
                                + "BASE_PREMI=?, INS_TOP=?, INS_PRODUCT=?, RATE_NO=?, INS_COY=?, TYPE_ID=?, INS_INCL_CRDT = ?"
                                + " where APPL_NO = ? and OBJ_CODE = ?";
                        jdbcTemplate.update(_sql, new Object[]{oO.getObjectPrice(), CommonUtil.parseStringToDouble(o.getStrukturKredit().getTop()),
                            VPRODUCTNO, VRATENO, VINSCCOYID, VTYPEID, INS_INCL_CRDT, o.getApplNo(), oO.getObjectCode()});

                    }

                }

                //Insert
                for (ObjectPembiayaanSchemeObject objectPembiayaan : oO.getSchemeObject()) {
                    if (!objectPembiayaan.getMsCode().isEmpty()) {
                        _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_MS_LVL_OBJECT (MS_CODE, MS_AMT, APPL_NO, SEQ_NO, MS_SEQ_NO, BRANCH_ID, CREATE_BY, CREATE_DATE) "
                                + " VALUES(?,?,?,?,?,?,?,?)";
                        jdbcTemplate.update(_sql,
                                new Object[]{objectPembiayaan.getMsCode(), CommonUtil.parseStringToDouble(objectPembiayaan.getAmount()),
                                    o.getApplNo(), seqObj, 1, o.getOfficeCode(),
                                    "SYSTEM", new Date()});
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("22", "Error Save Appl Object, " + e.getMessage(), null);
        }

        //insert om_trn_appl_hdr_tmps
        _sql = "insert into ordmgmt.om_trn_appl_hdr_tmps (appl_no, branch_id, appl_date)"
                + "select appl_no, branch_id, appl_date from ordmgmt.om_trn_appl_hdr where appl_no = ? ";
        jdbcTemplate.update(_sql, new Object[]{o.getApplNo()});

        //insert OM_TRN_APPL_SC1 
        _sql = "insert into ORDMGMT.OM_TRN_APPL_SC1 (APPL_NO, OBJ_CODE, TOP, CUST_OFFPH_AREA, "
                + "CUST_OFFPHONE, SIP_GRADE, DOUBLE_POOLING, FLAG_VISIT, PROMISE_TO_VISIT, CREATE_BY, CREATE_DATE)"
                + "SELECT b.APPL_NO , b.OBJ_CODE, ?, a.OFF_FIXPH_AREA , a.OFF_FIXPHONE , 'PLATINUM', 'N', 'N', SYSDATE, 'SYSTEM', SYSDATE "
                + "FROM FIFAPPS.FS_MST_CUST_IND a, ORDMGMT.OM_TRN_APPL_OBJECT b where a.CUST_NO= ? and (b.APPL_NO=? and b.SEQ_NO=?)";
        jdbcTemplate.update(_sql, new Object[]{o.getStrukturKredit().getTop(), o.getCustomerNo(), o.getApplNo(), 1});

        //insert OM_TRN_APPL_MS_LVL_KONTRAK
        _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_MS_LVL_KONTRAK(APPL_NO, BRANCH_ID, DEFF_AMOUNT, MS_CODE, CREATE_BY, CREATE_DATE) "
                + " values (?,?,?,?,?,?)";
        try {
            if (!o.getMarketingSchemeContract().getMsCode().isEmpty()) {
                jdbcTemplate.update(_sql,
                        new Object[]{o.getApplNo(), o.getOfficeCode(), CommonUtil.parseStringToDouble(o.getMarketingSchemeContract().getAmount()),
                            o.getMarketingSchemeContract().getMsCode(),
                            "SYSTEM", new Date()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("23", "Error Save marketingSchemeContract, " + e.getMessage(), null);
        }

        //select desckripsi
        _sql = "SELECT DESCRIPTION FROM ORDMGMT.OM_MST_DOCUMENTS WHERE DOC_CODE = ?";
        List<Map> lDocs = new ArrayList<Map>();
        try {
            lDocs = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map d = new HashMap();
                    d.put("DESCRIPTION", rs.getString("DESCRIPTION"));
                    return d;
                }
            }, new Object[]{o.getDocuments().get(0).getDocumentCode()});
//            System.out.println(lDocs.get(0).get("DESCRIPTION").toString());
            if (lDocs.isEmpty()) {
                return new ResponseMessageMap("24", "doc deskripsi tidak ditemukan", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            for (OrderFullDocuments oD : o.getDocuments()) {

                //insert OM_TRN_APPL_DOC
                _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_DOC(BRANCH_ID, APPL_NO, DOC_CODE, REQUIRED, CREATE_BY, CREATE_DATE,"
                        + "DESCRIPTION) "
                        + " VALUES(?,?,?,?,?,?,?)";
                jdbcTemplate.update(_sql,
                        new Object[]{o.getOfficeCode(), o.getApplNo(), oD.getDocumentCode(),
                            oD.getRequired(),
                            "SYSTEM", new Date(), lDocs.get(0).get("DESCRIPTION").toString()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("24", "Error Save Documents, " + e.getMessage(), null);
        } 
        //jumlah total angsuran bulanan
        String _sQl_ = "  select appl_no, sum(month_inst) totalbulan from ordmgmt.om_trn_appl_object "
                + "where appl_no=? group by appl_no";
        List<Map> _lMapSum = new ArrayList<Map>();
        try {
            _lMapSum = jdbcTemplate.query(_sQl_, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map has = new HashMap();
                    has.put("month_inst", rs.getString("totalbulan"));
                    return has;
                }
            }, new Object[]{o.getApplNo()});
            if (_lMapSum.isEmpty()) {
                return new ResponseMessageMap("26", "error hitung" + "|" + "asdasdasd", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("26", "error hitung, hey" + e.getMessage(), null);
        }

        //insert OM_TRN_APPL_STRUCRDT
        _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_STRUCRDT(VERSION_NO, APPL_NO, INTEREST_TYPE, TENOR, "
                + "PERIODE, PERIODE_TYPE, ADV_ARREAR,ADMIN, CHOICE_INST_RATE, ACTUAL_PCT_FLAT, TOP, "
                + "PCT_RESIDU, AMT_RESIDU, CREATE_BY, CREATE_DATE,PROMO_FEE,DP_RECBY,INTR_RL_METH,"
                + "month_inst,LAST_INST,GRS_DP,OBJ_PRICE,INS_INCL_CRDT,CUST_DP,DP_RECV_DLR,DP_RECV_FIF,ADM_DLL) "
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            jdbcTemplate.update(_sql,
                    new Object[]{0, o.getApplNo(), o.getStrukturKredit().getInterestType(),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getTenor()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getPeriode()),
                        o.getStrukturKredit().getPeriodeType(), o.getStrukturKredit().getAdvArrear(),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getAdmin()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getChoiceInstallmentRate()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getPercentFlat()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getTop()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getPercentResidu()),
                        CommonUtil.parseStringToDouble(o.getStrukturKredit().getAmountResidu()),
                        "SYSTEM", new Date(), 5000, "D", "02", _lMapSum.get(0).get("month_inst"),
                        _lMapSum.get(0).get("month_inst"), CommonUtil.parseStringToDouble(o.getTotalDp()),
                        CommonUtil.parseStringToDouble(o.getTotalProductPrice()), "N", CommonUtil.parseStringToDouble(o.getTotalDp()),
                        CommonUtil.parseStringToDouble(o.getTotalDp()), 0, CommonUtil.parseStringToDouble(o.getStrukturKredit().getAdmin())});
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("25", "Error Save OM_TRN_APPL_STRUCRDT, " + e.getMessage(), null);
        }

        if (!o.getPromotions().getPromoMasterCode().isEmpty()) {
            //insert OM_TRN_APPL_PROMO_LIST
            _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_PROMO_LIST(BRANCH_ID, APPL_NO, PROMO_MST_CODE, PROMO_DTL_ID, CREATE_BY, CREATE_DATE,PROMO_FLAG) "
                    + " VALUES(?,?,?,?,?,?,?)";
            try {
                jdbcTemplate.update(_sql,
                        new Object[]{o.getOfficeCode(), o.getApplNo(), o.getPromotions().getPromoMasterCode(),
                            o.getPromotions().getPromoDetailCode(),
                            "SYSTEM", new Date(), "Y"});
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessageMap("26", "Error Save OM_TRN_APPL_PROMO_LIST, " + e.getMessage(), null);
            }
        }else{
             _sql = "INSERT INTO ORDMGMT.OM_TRN_APPL_PROMO_LIST(BRANCH_ID, APPL_NO, PROMO_MST_CODE, PROMO_DTL_ID, CREATE_BY, CREATE_DATE,PROMO_FLAG) "
                    + " VALUES(?,?,?,?,?,?,?)";
            try {
                jdbcTemplate.update(_sql,
                        new Object[]{o.getOfficeCode(), o.getApplNo(), "MRP",
                            "NMRP004",
                            "SYSTEM", new Date(), "Y"});
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessageMap("26", "Error Save OM_TRN_APPL_PROMO_LIST, " + e.getMessage(), null);
            }
        }

        //Call Calculate.item_object
//        try {
//            String sql = "{ call ORDMGMT.CALCULATE.item_object(?,?,?)}";
//            Connection con = jdbcTemplate.getDataSource().getConnection();
//            CallableStatement cst = con.prepareCall(sql);
//            cst.registerOutParameter(2, OracleTypes.NUMBER);
//            cst.setString(1, o.getApplNo());
//            cst.registerOutParameter(3, OracleTypes.VARCHAR);
//            cst.execute();
//
//            System.out.println("item_object # " + cst.getInt(2) + " : " + cst.getString(3));
//            if (cst.getInt(2) > 0) {
//                return new ResponseMessageMap("27", "Error Calculate Item Object, " + cst.getString(3), null);
//            }
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseMessageMap("27", "Error Calculate Item Object, " + e.getMessage(), null);
//        }
//        
//        //Call Calculate.Struc credit
//        try {
//            String sql = "{ call ORDMGMT.CALCULATE.struc_crdt(?,?,?,?,?,?,?,?)}";
//            Connection con = jdbcTemplate.getDataSource().getConnection();
//            CallableStatement cst = con.prepareCall(sql);
//            cst.setString(1, o.getApplNo());
//            cst.registerOutParameter(2, OracleTypes.NUMBER);
//            cst.registerOutParameter(3, OracleTypes.VARCHAR);
//            cst.setDouble(4, 2);
//            cst.registerOutParameter(5, OracleTypes.VARCHAR);
//            cst.registerOutParameter(6, OracleTypes.NUMBER);
//            cst.registerOutParameter(7, OracleTypes.NUMBER);
//            cst.setString(8, "0");
//            cst.execute();
//            System.out.println("struc_crdt # " + cst.getInt(2) + " : " + cst.getString(3));
//
//            if (cst.getInt(2) > 0) {
//                return new ResponseMessageMap("28", "Error Calculate struc_crdt, " + cst.getString(3), null);
//            }
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseMessageMap("28", "Error Calculate struc_crdt, " + e.getMessage(), null);
//        }
        return new ResponseMessageMap("00", "Success", lRespRef);
    }

    public ResponseMessageMap approvePO(String applNo) {
        ResponseMessageMap resp = new ResponseMessageMap();
        List<Map> lRespRef = new ArrayList<Map>();

        String _sql_ = "select cust_no from ordmgmt.om_trn_appl_hdr where appl_no=?";
        List<Map> lCust = new ArrayList<Map>();
        try {
            lCust = jdbcTemplate.query(_sql_, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map m = new HashMap();
                    m.put("custNo", rs.getString("cust_no"));
                    return m;
                }
            }, new Object[]{applNo});
            if (lCust.isEmpty()) {
                return new ResponseMessageMap("26", "custNo tidak ditemukan", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //  update collect appl_addr
        try {
            String sql = "{ call ORDMGMT.OM_P_UPD_COLL_ADDR(?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.setString(1, applNo);
            cst.setString(2, lCust.get(0).get("custNo").toString());
            cst.execute();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("28", "Error update addr coll, " + e.getMessage(), null);
        }

        //calculate object
        try {
            String sql = "{ call ORDMGMT.CALCULATE.item_object(?,?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(2, OracleTypes.NUMBER);
            cst.setString(1, applNo);
            cst.registerOutParameter(3, OracleTypes.VARCHAR);
            cst.execute();

            System.out.println("item_object # " + cst.getInt(2) + " : " + cst.getString(3));
            if (cst.getInt(2) > 0) {
                return new ResponseMessageMap("27", "Error Calculate Item Object, " + cst.getString(3), null);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("27", "Error Calculate Item Object, " + e.getMessage(), null);
        }

        //Call Calculate.item_object
        try {
            String sql = "{ call ORDMGMT.CALCULATE.struc_crdt(?,?,?,?,?,?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.setString(1, applNo);
            cst.registerOutParameter(2, OracleTypes.NUMBER);
            cst.registerOutParameter(3, OracleTypes.VARCHAR);
            cst.setDouble(4, 2);
            cst.registerOutParameter(5, OracleTypes.VARCHAR);
            cst.registerOutParameter(6, OracleTypes.NUMBER);
            cst.registerOutParameter(7, OracleTypes.NUMBER);

            //cst.setString(8, "0");

            
           cst.execute();
            System.out.println("struc_crdt # " + cst.getInt(2) + " : " + cst.getString(3));

            if (cst.getInt(2) > 0) {
                sql = "UPDATE ORDMGMT.OM_TRN_APPL_HDR set ORDER_STAT = 'C', SURVEY_STAT = 'C', "
                        + "CANCEL_REASON = 'CANCEL OLEH FIF', CANCEL_SUB_REASON = 'Cancel - Order Spam UVP'"
                        + "where appl_no = ?";
                jdbcTemplate.update(sql, new Object[]{applNo});
                return new ResponseMessageMap("28", "Error Calculate struc_crdt, " + cst.getString(3), null);

            }
            con.close();
        } catch (Exception e) {
            try {
                e.printStackTrace();
                String sql_ = "UPDATE ORDMGMT.OM_TRN_APPL_HDR set ORDER_STAT = 'C', SURVEY_STAT = 'C', "
                        + "CANCEL_REASON = 'CANCEL OLEH FIF', CANCEL_SUB_REASON = 'Cancel - Order Spam UVP'"
                        + "where appl_no = ?";
                jdbcTemplate.update(sql_, new Object[]{applNo});
                String _sQl_ = "{call ORDMGMT.OM_P_LOG_ERR_WS (?,?,?)}";

                Connection con = jdbcTemplate.getDataSource().getConnection();
                CallableStatement cst = con.prepareCall(_sQl_);
                cst.setString(1, applNo);
                cst.setString(2, e.getMessage());
                cst.setString(3, "X");
                cst.execute();

                con.close();
                return new ResponseMessageMap("28", "Error Calculate struc_crdt, " + e.getMessage(), null);
            } catch (SQLException ex) {
                Logger.getLogger(OrderFullDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return new ResponseMessageMap("28", "Error Calculate struc_crdt, " + e.getMessage(), null);

        }
        try {
            String sql = "{ ? = call ORDMGMT.PKG_PO.approve_order(?,?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1, OracleTypes.VARCHAR);
            cst.setString(2, applNo);
            cst.setString(3, "SYSTEM");
            cst.execute();
            System.out.println("approve_order # " + cst.getString(1));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("29", "Error Approval Order, " + e.getMessage(), null);
        }

        //score meter
        try {
            String sql = "{call ORDMGMT.OM_SCORE_METER_PKG.forcecountscoremeter(?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.setString(1, applNo);
            cst.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("29", "score meter, " + e.getMessage(), null);
        }

        String _sql = " select distinct(a.po_no), a.appl_no, c.seq_no, c.obj_grp, c.obj_code from ordmgmt.om_trn_po_dtl a, ordmgmt.om_trn_po_hdr b, ordmgmt.om_trn_appl_object c"
                + " where a.appl_no = ? and (a.po_no = b.po_no "
                + "and a.po_no = c.po_no) ";
        List<Map> lMapObj = new ArrayList<Map>();
        try {
            lMapObj = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map a = new HashMap();
                    a.put("poNo", rs.getString("po_no"));
                    a.put("applicationNo", rs.getString("appl_no"));
                    a.put("noSeqObj", rs.getString("seq_no"));
                    a.put("objectGroup", rs.getString("obj_grp"));
                    a.put("objectCode", rs.getString("obj_code"));
                    return a;
                }
            }, new Object[]{applNo});
            if (lMapObj.isEmpty()) {
                return new ResponseMessageMap("14", "Nomor PO tidak ditemukan", lMapObj);
            } else {

                return new ResponseMessageMap("00", "Success", lMapObj);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("14", "Nomor PO tidak ditemukan, " + e.getMessage(), null);
        }
    }

    public ResponseMessageMap scoreMeter(String applNo) {
        ResponseMessageMap resp = new ResponseMessageMap();
        List<Map> lRespRef = new ArrayList<Map>();

        //score meter
        try {
            String sql = "{call ORDMGMT.OM_SCORE_METER_PKG.forcecountscoremeter(?)}";
            Connection con = jdbcTemplate.getDataSource().getConnection();
            CallableStatement cst = con.prepareCall(sql);
            cst.setString(1, applNo);
            cst.execute();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("29", "score meter, " + e.getMessage(), null);
        }

        String _sql = " select distinct(a.po_no), a.appl_no, c.seq_no, c.obj_grp, c.obj_code from ordmgmt.om_trn_po_dtl a, ordmgmt.om_trn_po_hdr b, ordmgmt.om_trn_appl_object c where a.appl_no = ? and (a.po_no = b.po_no \n"
                + "and a.po_no = c.po_no) ";
        List<Map> lMapObj = new ArrayList<Map>();
        try {
            lMapObj = jdbcTemplate.query(_sql, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map a = new HashMap();
                    a.put("poNo", rs.getString("po_no"));
                    a.put("applicationNo", rs.getString("appl_no"));
                    a.put("noSeqObj", rs.getString("seq_no"));
                    a.put("objectGroup", rs.getString("obj_grp"));
                    a.put("objectCode", rs.getString("obj_code"));
                    return a;
                }
            }, new Object[]{applNo});
            if (lMapObj.isEmpty()) {
                return new ResponseMessageMap("14", "Nomor PO tidak ditemukan", null);
            } else {
                return new ResponseMessageMap("00", "Success", lMapObj);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("14", "Nomor PO tidak ditemukan, " + e.getMessage(), null);
        }

    }

}
