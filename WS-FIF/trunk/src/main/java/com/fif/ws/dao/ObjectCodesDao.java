/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.ObjectCodesModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class ObjectCodesDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ObjectCodesModel> getObjectCodesByObjGrp(String obj_grp) {
        return sessionFactory.getCurrentSession()
                .createQuery("from ObjectCodesModel where OBJ_GRP=?")
                .setParameter(0, obj_grp)
                .list();
    }
    

    public List<Map> getObjectCodesMpf() {
        String _sql = "select distinct nvl2(b.obj_code,'Y','N')insurance, a.obj_code, a.obj_grp, nvl(a.obj_descr,'null')obj_descr, nvl(a.obj_brand,'null')obj_brand, "
                + "a.obj_model, nvl(a.obj_type,'null')obj_type, nvl(a.obj_size,0)obj_size, nvl(a.obj_make,'null')obj_make  " +
"   from ordmgmt.OM_MST_OBJ_CODE a, insc.INSC_MST_PRODUCT_OBJ b " +
"   where a.OBJ_CODE = b.OBJ_CODE (+) and (a.IS_VEHICLE = 'N' and a.VISIBLE='Y')";
                       
        return jdbcTemplate.query(_sql, new RowMapper<Map>() {

            public Map mapRow(ResultSet rs, int i) throws SQLException {
                Map h = new HashMap();
                h.put("insurance", rs.getString("insurance"));
                h.put("objectCode", rs.getString("obj_code"));
                h.put("objectGroup", rs.getString("obj_grp"));
                h.put("objectDescription", rs.getString("obj_descr"));
                h.put("objectBrand", rs.getString("obj_brand"));
                h.put("objectModel", rs.getString("obj_model"));
                h.put("objectType", rs.getString("obj_type"));
                h.put("objectSize", rs.getString("obj_size"));
                h.put("objectMake", rs.getString("obj_make"));
                return h;
        }
    },new Object[]{});
        
    
    }
    
     public List<Map> getObjectCodesMpfByDate(Date sinceDate) {
        String _sql = "select distinct nvl2(b.obj_code,'Y','N')insurance, a.obj_code, a.obj_grp, nvl(a.obj_descr,'null')obj_descr, nvl(a.obj_brand,'null')obj_brand, "
                + "a.obj_model, nvl(a.obj_type,'null')obj_type, nvl(a.obj_size,0)obj_size, nvl(a.obj_make,'null')obj_make  " +
"   from ordmgmt.OM_MST_OBJ_CODE a, insc.INSC_MST_PRODUCT_OBJ b " +
"   where a.OBJ_CODE = b.OBJ_CODE (+) and (a.IS_VEHICLE = 'N' and a.VISIBLE='Y')"
                + "(a.CREATE_DATE>=? or a.UPDATE_DATE>=?)";
        return jdbcTemplate.query(_sql, new RowMapper<Map>() {

            public Map mapRow(ResultSet rs, int i) throws SQLException {
                Map h = new HashMap();
                h.put("insurance", rs.getString("insurance"));
                h.put("objectCode", rs.getString("obj_code"));
                h.put("objectGroup", rs.getString("obj_grp"));
                h.put("objectDescription", rs.getString("obj_descr"));
                h.put("objectBrand", rs.getString("obj_brand"));
                h.put("objectModel", rs.getString("obj_model"));
                h.put("objectType", rs.getString("obj_type"));
                h.put("objectSize", rs.getString("obj_size"));
                h.put("objectMake", rs.getString("obj_make"));
                return h;
        }
    },new Object[]{sinceDate});
    }
     
     public String getInsurance(String objectCode){
         String _sql = "select OBJ_CODE from INSC.INSC_MST_PRODUCT_OBJ where OBJ_CODE = ?";
         List<String> list = jdbcTemplate.query(_sql, new RowMapper<String>() {

             public String mapRow(ResultSet rs, int i) throws SQLException {
                 return rs.getString("OBJ_CODE");
             }
         },new Object[]{objectCode});
         if(list == null || list.equals("") || list.isEmpty()){
             return "N";
         }else{
             return "Y";
         }
     }
}
