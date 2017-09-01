/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.ZipModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
public class ZipDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
   public List<ZipModel> getZip(){
        return sessionFactory.getCurrentSession()
                .createQuery("from ZipModel")
                .list();
    }
  
    public List<ZipModel> getZipByCityCode(String city_code){
//        return sessionFactory.getCurrentSession()
//                .createQuery("from ZipModel where CITY_CODE=?")
//                .setParameter(0, city_code)
//                .list();
        String _sql = "select ZIP_CODE,SUB_ZIP_CODE,ZIP_DESC,PROV_CODE,CITY_CODE,"
                + "KEC_CODE,KEL_CODE from FS_MST_ZIP where CITY_CODE = ?";
        return jdbcTemplate.query(_sql, new RowMapper<ZipModel>() {

            public ZipModel mapRow(ResultSet rs, int i) throws SQLException {
                 ZipModel z = new ZipModel();
                z.setCITY_CODE(rs.getString("city_code"));
                z.setKEC_CODE(rs.getString("kec_code"));
                z.setKEL_CODE(rs.getString("kel_code"));
                z.setPROV_CODE(rs.getString("prov_code"));
                z.setSUB_ZIP_CODE(rs.getString("sub_zip_code"));
                z.setZIP_CODE(rs.getString("zip_code"));
                z.setZIP_DESC(rs.getString("zip_desc"));
                return z;
            }
        }, new Object[]{city_code});
    }
    public List<ZipModel> getZipCodeByAll(){
        return sessionFactory.getCurrentSession()
                .createQuery("from ZipModel")
                .list();
    }
//        String _sql = "select distinct (ZIP_CODE) ZIP_CODE,SUB_ZIP_CODE,ZIP_DESC,PROV_CODE,CITY_CODE, KEC_CODE,KEL_CODE from "
//                + "FIFAPPS.FS_MST_ZIP";
//        return jdbcTemplate.query(_sql, new RowMapper<ZipModel>() {
//
//            public ZipModel mapRow(ResultSet rs, int i) throws SQLException {
//                 ZipModel z = new ZipModel();
//                z.setCITY_CODE(rs.getString("city_code"));
//                z.setKEC_CODE(rs.getString("kec_code"));
//                z.setKEL_CODE(rs.getString("kel_code"));
//                z.setPROV_CODE(rs.getString("prov_code"));
//                z.setSUB_ZIP_CODE(rs.getString("sub_zip_code"));
//                z.setZIP_CODE(rs.getString("zip_code"));
//                z.setZIP_DESC(rs.getString("zip_desc"));
//                return z;
//            }
//        }, new Object[]{});
//    }
}
