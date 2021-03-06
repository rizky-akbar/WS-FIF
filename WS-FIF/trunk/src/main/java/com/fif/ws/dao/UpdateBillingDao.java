/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.dto.ResponseMessage;
import com.fif.ws.model.master.dto.UpdateBillingDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class UpdateBillingDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ResponseMessage updateBilling(UpdateBillingDto u) {
//        if(!u.getApplNo().isEmpty()){
//            return new ResponseMessage("","",u.getApplNo());
//        }
        
        String _sql_ = "select b.ID_CUST_ADDR,b.ID_CUST_CITY,b.ID_CUST_CITY_CODE,b.ID_CUST_KEC,b.ID_CUST_KEC_CODE,"
                + "b.ID_CUST_KEL,b.ID_CUST_KEL_CODE,b.ID_CUST_PROV,"
                + "b.ID_CUST_PROV_CODE,b.ID_CUST_RT,b.ID_CUST_RW,b.ID_CUST_SUB_ZIP,b.ID_CUST_ZIP,b.MAIL_ADDR,"
                + "b.MAIL_CITY,b.MAIL_CITY_CODE,b.MAIL_EMAIL,"
                + "b.MAIL_FAXIMILE,b.MAIL_FAX_AREA,b.MAIL_FIXPHONE,b.MAIL_FIXPH_AREA,b.MAIL_KEC,b.MAIL_KEC_CODE,"
                + "b.MAIL_KEL,b.MAIL_KEL_CODE,b.MAIL_MOBPHONE,"
                + "b.MAIL_MOBPHONE_2,b.MAIL_NAME,b.MAIL_PROV,b.MAIL_PROV_CODE,b.MAIL_RT,b.MAIL_RW,"
                + "b.MAIL_ZIP,a.CUST_ADDR,a.CUST_CATEGORY,a.CUST_CITY,a.CUST_CITY_CODE,"
                + "a.CUST_EMAIL,a.CUST_FAXIMILE,a.CUST_FAX_AREA,a.CUST_FIXPHONE,a.CUST_FIXPH_AREA,"
                + "a.CUST_KEC,a.CUST_KEC_CODE,a.CUST_KEL,a.CUST_KEL_CODE,a.CUST_MOBPHONE,a.CUST_MOBPHONE_2,a.CUST_NAME,"
                + "a.CUST_NO,a.CUST_PROV,a.CUST_PROV_CODE,"
                + "a.CUST_RT,a.CUST_RW,a.CUST_SEX,a.CUST_SUB_ZIP,a.CUST_TITLE,"
                + "a.CUST_TYPE_ID,a.CUST_ZIP,a.OFF_ADDR, a.OFF_CITY, a.OFF_CITY_CODE,a.OFF_EMAIL,"
                + "a.OFF_FAXIMILE,a.OFF_FAX_AREA,a.OFF_FIXPHONE,a.OFF_FIXPH_AREA,a.OFF_FIXPH_EXT,a.OFF_KEC,a.OFF_KEC_CODE,a.OFF_KEL,"
                + "a.OFF_KEL_CODE,a.OFF_MOBPHONE,a.OFF_MOBPHONE_2,a.OFF_PROV,a.OFF_PROV_CODE,a.OFF_RT,a.OFF_RW,a.OFF_TITLE,a.OFF_ZIP "
                + "  from fifapps.fs_mst_cust_ind a, fifapps.fs_mst_cust b, ordmgmt.om_trn_appl_hdr c where c.appl_no=? and (a.cust_no=b.cust_no and a.cust_no=c.cust_no) ";
        List<Map> lAddr = new ArrayList<Map>();
        try {
           lAddr= jdbcTemplate.query(_sql_, new RowMapper<Map>() {

                public Map mapRow(ResultSet rs, int i) throws SQLException {
                    Map d = new HashMap();
                    
                    d.put("ID_CUST_CITY", rs.getString("ID_CUST_CITY"));
                    d.put("ID_CUST_CITY_CODE", rs.getString("ID_CUST_CITY_CODE"));
                    d.put("ID_CUST_KEC", rs.getString("ID_CUST_KEC"));
                    d.put("ID_CUST_KEC_CODE", rs.getString("ID_CUST_KEC_CODE"));
                    d.put("ID_CUST_KEL", rs.getString("ID_CUST_KEL"));
                    d.put("ID_CUST_KEL_CODE", rs.getString("ID_CUST_KEL_CODE"));
                    d.put("ID_CUST_PROV", rs.getString("ID_CUST_PROV"));
                    d.put("ID_CUST_PROV_CODE", rs.getString("ID_CUST_PROV_CODE"));
                    d.put("ID_CUST_RT", rs.getString("ID_CUST_RT"));
                    d.put("ID_CUST_RW", rs.getString("ID_CUST_RW"));
                    d.put("ID_CUST_SUB_ZIP", rs.getString("ID_CUST_SUB_ZIP"));
                    d.put("ID_CUST_ZIP", rs.getString("ID_CUST_ZIP"));
                    d.put("MAIL_ADDR", rs.getString("MAIL_ADDR"));
                    d.put("MAIL_CITY", rs.getString("MAIL_CITY"));
                    d.put("MAIL_CITY_CODE", rs.getString("MAIL_CITY_CODE"));
                    d.put("MAIL_EMAIL", rs.getString("MAIL_EMAIL"));
                    d.put("MAIL_FAXIMILE", rs.getString("MAIL_FAXIMILE"));
                    //d.put("CUST_FAXIMILE", rs.getString("CUST_FAXIMILE"));
                    d.put("MAIL_FAX_AREA", rs.getString("MAIL_FAX_AREA"));
                    d.put("MAIL_FIXPHONE", rs.getString("MAIL_FIXPHONE"));
                    d.put("MAIL_FIXPH_AREA", rs.getString("MAIL_FIXPH_AREA"));
                    d.put("MAIL_KEC", rs.getString("MAIL_KEC"));
                    d.put("MAIL_KEC_CODE", rs.getString("MAIL_KEC_CODE"));
                    d.put("MAIL_KEL", rs.getString("MAIL_KEL"));
                    d.put("MAIL_KEL_CODE", rs.getString("MAIL_KEL_CODE"));
                    d.put("MAIL_MOBPHONE", rs.getString("MAIL_MOBPHONE"));
                    d.put("MAIL_MOBPHONE_2", rs.getString("MAIL_MOBPHONE_2"));
                    d.put("MAIL_NAME", rs.getString("MAIL_NAME"));
                    d.put("MAIL_PROV", rs.getString("MAIL_PROV"));
                    d.put("MAIL_PROV_CODE", rs.getString("MAIL_PROV_CODE"));
                    d.put("MAIL_RT", rs.getString("MAIL_RT"));
                    d.put("MAIL_RW", rs.getString("MAIL_RW"));
                    d.put("MAIL_ZIP", rs.getString("MAIL_ZIP"));
                    
                    
                   
                    d.put("CUST_ADDR", rs.getString("CUST_ADDR"));
                    d.put("CUST_CITY", rs.getString("CUST_CITY"));
                    d.put("CUST_CITY_CODE", rs.getString("CUST_CITY_CODE"));
                    d.put("CUST_EMAIL", rs.getString("CUST_EMAIL"));
                    d.put("CUST_FAXIMILE", rs.getString("CUST_FAXIMILE"));
                    d.put("CUST_FAX_AREA", rs.getString("CUST_FAX_AREA")); 
                    d.put("CUST_FIXPHONE", rs.getString("CUST_FIXPHONE"));
                    d.put("CUST_FIXPH_AREA", rs.getString("CUST_FIXPH_AREA"));
                    d.put("CUST_KEC", rs.getString("CUST_KEC"));
                    d.put("CUST_KEC_CODE", rs.getString("CUST_KEC_CODE"));
                    d.put("CUST_KEL", rs.getString("CUST_KEL"));
                    d.put("CUST_KEL_CODE", rs.getString("CUST_KEL_CODE"));
                    d.put("CUST_MOBPHONE", rs.getString("CUST_MOBPHONE"));
                    d.put("CUST_MOBPHONE_2", rs.getString("CUST_MOBPHONE_2"));
                    d.put("CUST_NAME", rs.getString("CUST_NAME"));
                    d.put("CUST_NO", rs.getString("CUST_NO"));
                    d.put("CUST_PROV", rs.getString("CUST_PROV"));
                    d.put("CUST_PROV_CODE", rs.getString("CUST_PROV_CODE"));
                    d.put("CUST_RT", rs.getString("CUST_RT"));
                    d.put("CUST_RW", rs.getString("CUST_RW"));
                    d.put("CUST_SEX", rs.getString("CUST_SEX"));
                    d.put("CUST_SUB_ZIP", rs.getString("CUST_SUB_ZIP"));
                    d.put("CUST_TITLE", rs.getString("CUST_TITLE"));
                    d.put("CUST_TYPE_ID", rs.getString("CUST_TYPE_ID"));
                    d.put("CUST_ZIP", rs.getString("CUST_ZIP"));
                   
                    d.put("OFF_FAXIMILE", rs.getString("OFF_FAXIMILE"));
                    d.put("OFF_FAX_AREA", rs.getString("OFF_FAX_AREA"));
                    d.put("OFF_FIXPHONE", rs.getString("OFF_FIXPHONE"));
                    d.put("OFF_FIXPH_AREA", rs.getString("OFF_FIXPH_AREA"));
                    d.put("OFF_FIXPH_EXT", rs.getString("OFF_FIXPH_EXT"));
                    d.put("OFF_KEC", rs.getString("OFF_KEC"));
                    d.put("OFF_KEC_CODE", rs.getString("OFF_KEC_CODE"));
                    d.put("OFF_KEL", rs.getString("OFF_KEL"));
                    d.put("OFF_KEL_CODE", rs.getString("OFF_KEL_CODE"));
                    d.put("OFF_MOBPHONE", rs.getString("OFF_MOBPHONE"));
                    d.put("OFF_MOBPHONE_2", rs.getString("OFF_MOBPHONE_2"));
                    d.put("OFF_PROV", rs.getString("OFF_PROV"));
                    d.put("OFF_PROV_CODE", rs.getString("OFF_PROV_CODE"));
                    d.put("OFF_RT", rs.getString("OFF_RT"));
                    d.put("OFF_RW", rs.getString("OFF_RW"));
                    d.put("OFF_TITLE", rs.getString("OFF_TITLE"));
                    d.put("OFF_ZIP", rs.getString("OFF_ZIP"));
                    d.put("OFF_ADDR", rs.getString("OFF_ADDR"));
                    d.put("OFF_CITY_CODE", rs.getString("OFF_CITY_CODE"));
                    d.put("ID_CUST_ADDR", rs.getString("ID_CUST_ADDR"));
                   
                    return d;
                }
                
            },new Object[]{u.getApplNo()});
            if(lAddr.isEmpty()){
                return new ResponseMessage("20", "ID_CUST_ADDR tidak ada", null);
            }
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseMessage("20", "error select addr", e.getMessage());
        }

         if(u.getBilling()=="ID"||u.getBilling().equalsIgnoreCase("ID")){
            _sql_ = "update ordmgmt.om_trn_appl_addr set COLLEC_ADDR=?,COLLEC_CITY=?,COLLEC_CITY_CODE=?,"
                    + "COLLEC_KEC_CODE=?,COLLEC_KEC=?,COLLEC_KEL=?,"
                    + "COLLEC_KEL_CODE=?,COLLEC_PROV=?,COLLEC_PROV_CODE=?,COLLEC_RT=?,COLLEC_RW=?,"
                    + "COLLEC_SUB_ZIP=?,COLLEC_ZIP=?,"
                    + "COLLEC_FIXPH_AREA=?,COLLEC_FIXPHONE=?,COLLEC_FAX_AREA=?,"
                    + "COLLEC_FAXIMILE=?,COLLEC_MOBPHONE=?,COLLEC_MOBPHONE_2=?,COLLEC_NICKNAME=? ,COLLEC_NAME=?,COLLEC_EMAIL=? "
                    + "where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("ID_CUST_ADDR"),
                    lAddr.get(0).get("ID_CUST_CITY"),
                    lAddr.get(0).get("ID_CUST_CITY_CODE"),
                    lAddr.get(0).get("ID_CUST_KEC_CODE"),
                    lAddr.get(0).get("ID_CUST_KEC"),
                    lAddr.get(0).get("ID_CUST_KEL"), 
                    lAddr.get(0).get("ID_CUST_KEL_CODE"),
                    lAddr.get(0).get("ID_CUST_PROV"),
                    lAddr.get(0).get("ID_CUST_PROV_CODE"),
                    lAddr.get(0).get("ID_CUST_RT"),
                    lAddr.get(0).get("ID_CUST_RW"),
                    u.getSubZipCode(),
                    lAddr.get(0).get("ID_CUST_ZIP"),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    lAddr.get(0).get("CUST_NAME"),
                    null,
                    null,
                    u.getApplNo()});
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("22","error update addr",ex.getMessage());
            }
        }
        
         if(u.getBilling()=="MAIL"||u.getBilling().equalsIgnoreCase("MAIL")){
         _sql_ = "update ordmgmt.om_trn_appl_addr set COLLEC_ADDR=?,COLLEC_CITY=?,COLLEC_CITY_CODE=?,"
                    + "COLLEC_KEC_CODE=?,COLLEC_KEC=?,COLLEC_KEL=?,"
                    + "COLLEC_KEL_CODE=?,COLLEC_PROV=?,COLLEC_PROV_CODE=?,COLLEC_RT=?,COLLEC_RW=?,"
                    + "COLLEC_SUB_ZIP=?,COLLEC_ZIP=?,COLLEC_FIXPH_AREA=?,COLLEC_FIXPHONE=?,COLLEC_FAX_AREA=?,"
                    + "COLLEC_FAXIMILE=?,COLLEC_MOBPHONE=?,COLLEC_MOBPHONE_2=?,COLLEC_NICKNAME=? ,COLLEC_NAME=?,COLLEC_EMAIL=? "
                    + "where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("MAIL_ADDR"),
                    lAddr.get(0).get("MAIL_CITY"),
                    lAddr.get(0).get("MAIL_CITY_CODE"),
                    lAddr.get(0).get("MAIL_KEC_CODE"),
                    lAddr.get(0).get("MAIL_KEC"),
                    lAddr.get(0).get("MAIL_KEL"), 
                    lAddr.get(0).get("MAIL_KEL_CODE"),
                    lAddr.get(0).get("MAIL_PROV"),
                    lAddr.get(0).get("MAIL_PROV_CODE"),
                    lAddr.get(0).get("MAIL_RT"),
                    lAddr.get(0).get("MAIL_RW"),
                    u.getSubZipCode(),
                    lAddr.get(0).get("MAIL_ZIP"),
                    lAddr.get(0).get("MAIL_FIXPH_AREA"),
                    lAddr.get(0).get("MAIL_FIXPHONE"),
                    lAddr.get(0).get("MAIL_FAX_AREA"),
                    lAddr.get(0).get("MAIL_FAXIMILE"),
                    lAddr.get(0).get("MAIL_MOBPHONE"),
                    lAddr.get(0).get("MAIL_MOBPHONE_2"),
                    null,
                    lAddr.get(0).get("MAIL_NAME"),
                    lAddr.get(0).get("MAIL_EMAIL"),
                    u.getApplNo()});

            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("23","error update addr",ex.getMessage());
            }
        }
         
         if(u.getBilling()=="OFFICE"||u.getBilling().equalsIgnoreCase("OFFICE")){
         _sql_ = "update ordmgmt.om_trn_appl_addr set COLLEC_ADDR=?,COLLEC_CITY=?,COLLEC_CITY_CODE=?,"
                    + "COLLEC_KEC_CODE=?,COLLEC_KEC=?,COLLEC_KEL=?,"
                    + "COLLEC_KEL_CODE=?,COLLEC_PROV=?,COLLEC_PROV_CODE=?,COLLEC_RT=?,COLLEC_RW=?,"
                    + "COLLEC_SUB_ZIP=?,COLLEC_ZIP=?,COLLEC_FIXPH_AREA=?,COLLEC_FIXPHONE=?,COLLEC_FAX_AREA=?,"
                    + "COLLEC_FAXIMILE=?,COLLEC_MOBPHONE=?,COLLEC_MOBPHONE_2=?,COLLEC_NICKNAME=? ,COLLEC_NAME=?,COLLEC_EMAIL=? "
                    + "where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("OFF_ADDR"),
                    lAddr.get(0).get("OFF_CITY"),
                    lAddr.get(0).get("OFF_CITY_CODE"),
                    lAddr.get(0).get("OFF_KEC_CODE"),
                    lAddr.get(0).get("OFF_KEC"), 
                    lAddr.get(0).get("OFF_KEL"),
                    lAddr.get(0).get("OFF_KEL_CODE"),
                    lAddr.get(0).get("OFF_PROV"),
                    lAddr.get(0).get("OFF_PROV_CODE"),
                    lAddr.get(0).get("OFF_RT"),
                    lAddr.get(0).get("OFF_RW"),
                    u.getSubZipCode(),
                    lAddr.get(0).get("OFF_ZIP"),
                    lAddr.get(0).get("OFF_FIXPH_AREA"),
                    lAddr.get(0).get("OFF_FIXPHONE"),
                    lAddr.get(0).get("OFF_FAX_AREA"),
                    null,
                    lAddr.get(0).get("OFF_FAXIMILE"),
                    lAddr.get(0).get("OFF_MOBPHONE"),
                    lAddr.get(0).get("OFF_MOBPHONE_2"),
                    null,
                    null,
                    u.getApplNo()});
                
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("24","error update addr",ex.getMessage());
            }
        }
         if(u.getBilling()=="HOME"||u.getBilling().equalsIgnoreCase("HOME")){
          _sql_ = "update ordmgmt.om_trn_appl_addr set COLLEC_ADDR=?,COLLEC_CITY=?,COLLEC_CITY_CODE=?,"
                    + "COLLEC_KEC_CODE=?,COLLEC_KEC=?,COLLEC_KEL=?,"
                    + "COLLEC_KEL_CODE=?,COLLEC_PROV=?,COLLEC_PROV_CODE=?,COLLEC_RT=?,COLLEC_RW=?,"
                    + "COLLEC_SUB_ZIP=?,COLLEC_ZIP=?,COLLEC_FIXPH_AREA=?,COLLEC_FIXPHONE=?,COLLEC_FAX_AREA=?,"
                    + "COLLEC_FAXIMILE=?,COLLEC_MOBPHONE=?,COLLEC_MOBPHONE_2=?,COLLEC_NICKNAME=? ,COLLEC_NAME=?,COLLEC_EMAIL=? "
                    + "where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("CUST_ADDR"),
                    lAddr.get(0).get("CUST_CITY"),
                    lAddr.get(0).get("CUST_CITY_CODE"),
                    lAddr.get(0).get("CUST_KEC_CODE"),
                    lAddr.get(0).get("CUST_KEC"),
                    lAddr.get(0).get("CUST_KEL"),
                    lAddr.get(0).get("CUST_KEL_CODE"),
                    lAddr.get(0).get("CUST_PROV"),
                    lAddr.get(0).get("CUST_PROV_CODE"),
                    lAddr.get(0).get("CUST_RT"),
                    lAddr.get(0).get("CUST_RW"),
                    u.getSubZipCode(),
                    lAddr.get(0).get("CUST_ZIP"),
                    lAddr.get(0).get("CUST_FIXPH_AREA"),
                    lAddr.get(0).get("CUST_FIXPHONE"),
                    lAddr.get(0).get("CUST_FAX_AREA"),
                    lAddr.get(0).get("CUST_FAXIMILE"),
                    lAddr.get(0).get("CUST_MOBPHONE"),
                    lAddr.get(0).get("CUST_MOBPHONE_2"),
                    null,
                    lAddr.get(0).get("CUST_NAME"),
                    lAddr.get(0).get("CUST_EMAIL"),
                    u.getApplNo()});
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("25","error update addr",ex.getMessage());
            }
        }
         
         if(u.getEmer()=="ID"||u.getEmer().equalsIgnoreCase("ID")){
            _sql_ = "update ordmgmt.om_trn_appl_addr set EMER_ADDR=?,EMER_CITY=?,EMER_CITY_CODE=?,"
                    + "EMER_KEC_CODE=?,EMER_KEC=?,EMER_KEL=?,"
                    + "EMER_KEL_CODE=?,EMER_PROV=?,EMER_PROV_CODE=?,EMER_RT=?,EMER_RW=?,"
                    + "EMER_ZIP=?,EMER_NAME=?,EMER_FIXPH_AREA=?,EMER_FIXPHONE=?,EMER_FAX_AREA=?,EMER_FAXIMILE=?,EMER_MOBPHONE=?,"
                    + "EMER_MOBPHONE_2=?,EMER_EMAIL=? where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("ID_CUST_ADDR"),
                    lAddr.get(0).get("ID_CUST_CITY"),
                    lAddr.get(0).get("ID_CUST_CITY_CODE"),
                    lAddr.get(0).get("ID_KEC_CODE"),
                    lAddr.get(0).get("ID_CUST_KEC"),
                    lAddr.get(0).get("ID_CUST_KEL"), 
                    lAddr.get(0).get("ID_CUST_KEL_CODE"),
                    lAddr.get(0).get("ID_CUST_PROV"),
                    lAddr.get(0).get("ID_CUST_PROV_CODE"),
                    lAddr.get(0).get("ID_CUST_RT"),
                    lAddr.get(0).get("ID_CUST_RW"),
                    lAddr.get(0).get("ID_CUST_ZIP"),
                    lAddr.get(0).get("CUST_NAME"),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    lAddr.get(0).get("CUST_EMAIL"),
                    u.getApplNo()});
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("26","error update addr",ex.getMessage());
            }
        }
        
         if(u.getEmer()=="MAIL"||u.getEmer().equalsIgnoreCase("MAIL")){
            _sql_ = "update ordmgmt.om_trn_appl_addr set EMER_ADDR=?,EMER_CITY=?,EMER_CITY_CODE=?,"
                    + "EMER_KEC_CODE=?,EMER_KEC=?,EMER_KEL=?,"
                    + "EMER_KEL_CODE=?,EMER_PROV=?,EMER_PROV_CODE=?,EMER_RT=?,EMER_RW=?,"
                    + "EMER_ZIP=?,EMER_NAME=?,EMER_FIXPH_AREA=?,EMER_FIXPHONE=?,EMER_FAX_AREA=?,EMER_FAXIMILE=?,EMER_MOBPHONE=?,"
                    + "EMER_MOBPHONE_2=?,EMER_EMAIL=? where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("MAIL_ADDR"),
                    lAddr.get(0).get("MAIL_CITY"),
                    lAddr.get(0).get("MAIL_CITY_CODE"),
                    lAddr.get(0).get("MAIL_KEC_CODE"),
                    lAddr.get(0).get("MAIL_KEC"),
                    lAddr.get(0).get("MAIL_KEL"), 
                    lAddr.get(0).get("MAIL_KEL_CODE"),
                    lAddr.get(0).get("MAIL_PROV"),
                    lAddr.get(0).get("MAIL_PROV_CODE"),
                    lAddr.get(0).get("MAIL_RT"),
                    lAddr.get(0).get("MAIL_RW"),
                    lAddr.get(0).get("MAIL_ZIP"),
                    lAddr.get(0).get("CUST_NAME"),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    lAddr.get(0).get("MAIL_EMAIL"),
                    u.getApplNo()});
                   
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("27","error update addr",ex.getMessage());
            }
        }
         
         if(u.getEmer()=="OFFICE"||u.getEmer().equalsIgnoreCase("OFFICE")){
          _sql_ = "update ordmgmt.om_trn_appl_addr set EMER_ADDR=?,EMER_CITY=?,EMER_CITY_CODE=?,"
                    + "EMER_KEC_CODE=?,EMER_KEC=?,EMER_KEL=?,"
                    + "EMER_KEL_CODE=?,EMER_PROV=?,EMER_PROV_CODE=?,EMER_RT=?,EMER_RW=?,"
                    + "EMER_ZIP=?,EMER_NAME=?,EMER_FIXPH_AREA=?,EMER_FIXPHONE=?,EMER_FAX_AREA=?,EMER_FAXIMILE=?,EMER_MOBPHONE=?,"
                    + "EMER_MOBPHONE_2=?,EMER_EMAIL=? where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("OFF_ADDR"),
                    lAddr.get(0).get("OFF_CITY"),
                    lAddr.get(0).get("OFF_CITY_CODE"),
                    lAddr.get(0).get("OFF_KEC_CODE"),
                    lAddr.get(0).get("OFF_KEC"), 
                    lAddr.get(0).get("OFF_KEL"),
                    lAddr.get(0).get("OFF_KEL_CODE"),
                    lAddr.get(0).get("OFF_PROV"),
                    lAddr.get(0).get("OFF_PROV_CODE"),
                    lAddr.get(0).get("OFF_RT"),
                    lAddr.get(0).get("OFF_RW"),
                    lAddr.get(0).get("OFF_ZIP"),
                    lAddr.get(0).get("CUST_NAME"),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    lAddr.get(0).get("CUST_EMAIL"),
                    u.getApplNo()});
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("28","error update addr",ex.getMessage());
            }
        }
         if(u.getEmer()=="HOME"||u.getEmer().equalsIgnoreCase("HOME")){
        _sql_ = "update ordmgmt.om_trn_appl_addr set EMER_ADDR=?,EMER_CITY=?,EMER_CITY_CODE=?,"
                    + "EMER_KEC_CODE=?,EMER_KEC=?,EMER_KEL=?,"
                    + "EMER_KEL_CODE=?,EMER_PROV=?,EMER_PROV_CODE=?,EMER_RT=?,EMER_RW=?,"
                    + "EMER_ZIP=?,EMER_NAME=?,EMER_FIXPH_AREA=?,EMER_FIXPHONE=?,EMER_FAX_AREA=?,EMER_FAXIMILE=?,EMER_MOBPHONE=?,"
                    + "EMER_MOBPHONE_2=?,EMER_EMAIL=? where appl_no=?";
            try{
                jdbcTemplate.update(_sql_, new Object[]{lAddr.get(0).get("CUST_ADDR"),
                    lAddr.get(0).get("CUST_CITY"),
                    lAddr.get(0).get("CUST_CITY_CODE"),
                    lAddr.get(0).get("CUST_KEC_CODE"),
                    lAddr.get(0).get("CUST_KEC"),
                    lAddr.get(0).get("CUST_KEL"),
                    lAddr.get(0).get("CUST_KEL_CODE"),
                    lAddr.get(0).get("CUST_PROV"),
                    lAddr.get(0).get("CUST_PROV_CODE"),
                    lAddr.get(0).get("CUST_RT"),
                    lAddr.get(0).get("CUST_RW"),
                    lAddr.get(0).get("CUST_ZIP"),
                    lAddr.get(0).get("CUST_NAME"),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    lAddr.get(0).get("CUST_EMAIL"),
                    u.getApplNo()});
            }catch(Exception ex){
                ex.printStackTrace();
                return new ResponseMessage("29","error update addr",ex.getMessage());
            }
        }
        return new ResponseMessage("00","success",u.getApplNo());
        
    }
}
