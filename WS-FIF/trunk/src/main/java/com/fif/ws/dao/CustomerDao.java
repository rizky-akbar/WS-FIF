/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.customer.dto.CustomerCollectAddressDto;
import com.fif.ws.model.customer.dto.CustomerEmergencyAddressDto;
import com.fif.ws.model.customer.dto.CustomerHeaderDto;
import com.fif.ws.model.customer.dto.CustomerHomeAddressDto;
import com.fif.ws.model.customer.dto.CustomerIdAddressDto;
import com.fif.ws.model.customer.dto.CustomerMailAddressDto;
import com.fif.ws.model.customer.dto.CustomerOfficeAddressDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class CustomerDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
   // List<Map> lBranch = new ArrayList<Map>();
      
    public List<CustomerHeaderDto> getCustomerByCustNo(String cust_no){
        String _sql = "SELECT BRANCH_ID, CUST_NO, CUST_NAME, KTP_CUST_NAME, " +
                 "CUST_TITLE, CUST_SEX, BIRTH_PLACE, TO_CHAR (BIRTH_DATE, 'YYYYMMDD') birthDate," +
                 "MOTHERS_NAME, CUST_CATEGORY, MARITAL_STAT, CUST_MOBPHONE, ID_CUST_ADDR," +
                 "ID_CUST_RT, ID_CUST_RW, ID_CUST_KEL, ID_CUST_KEC, ID_CUST_CITY, ID_CUST_ZIP, ID_CUST_PROV," +
                 "MAIL_ADDR, MAIL_RT, MAIL_RW, MAIL_KEL, MAIL_KEC, MAIL_CITY," +
                 "MAIL_ZIP, MAIL_PROV, MAIL_FIXPHONE, MAIL_MOBPHONE, EMER_ADDR, EMER_RT," +
                 "EMER_RW, EMER_KEL, EMER_KEC, EMER_CITY, EMER_ZIP, EMER_PROV, EMER_FIXPHONE, EMER_MOBPHONE," +
                 "OFF_ADDR, OFF_RT, OFF_RW, OFF_KEL, OFF_KEC, OFF_CITY, OFF_ZIP, OFF_PROV," +
                 "OFF_FIXPHONE, OFF_MOBPHONE, CUST_ADDR, CUST_RT, CUST_RW, CUST_KEL, CUST_KEC, CUST_CITY," +
                 "CUST_ZIP, CUST_PROV, CUST_FIXPHONE, CUST_MOBPHONE, COLLEC_NAME, COLLEC_ADDR, COLLEC_RT," +
                 "COLLEC_RW, COLLEC_KEL, COLLEC_KEC, COLLEC_CITY, COLLEC_ZIP, COLLEC_PROV, COLLEC_FIXPH_AREA," +
                 "COLLEC_FIXPHONE, COLLEC_FAX_AREA, COLLEC_FAXIMILE, COLLEC_MOBPHONE, COLLEC_EMAIL," +
                 "COLLEC_MOBPHONE_2, NEXT_DUE_DATE" +
                 " FROM " +
                 "(SELECT NVL (c.BRANCH_ID, a.BRANCH_ID) BRANCH_ID," +
                 "a.CUST_NO, a.CUST_NAME, C.KTP_CUST_NAME, b.CUST_TITLE, b.CUST_SEX, b.BIRTH_PLACE," +
                 "b.BIRTH_DATE, b.MOTHERS_NAME, b.CUST_CATEGORY, b.MARITAL_STAT, b.CUST_MOBPHONE, a.ID_CUST_ADDR," +
                 "a.ID_CUST_RT, a.ID_CUST_RW, a.ID_CUST_KEL, a.ID_CUST_KEC, a.ID_CUST_CITY, a.ID_CUST_ZIP," +
                 "a.ID_CUST_PROV, a.MAIL_ADDR, a.MAIL_RT, a.MAIL_RW, a.MAIL_KEL," +
                 "a.MAIL_KEC, a.MAIL_CITY, a.MAIL_ZIP, a.MAIL_PROV," +
                 "a.MAIL_FIXPH_AREA || '-' || a.MAIL_FIXPHONE MAIL_FIXPHONE," +
                 "a.MAIL_MOBPHONE, b.EMER_ADDR, b.EMER_RT, b.EMER_RW," +
                 "b.EMER_KEL, b.EMER_KEC, b.EMER_CITY, b.EMER_ZIP, b.EMER_PROV," +
                 "b.EMER_FIXPH_AREA || '-' || b.EMER_FIXPHONE EMER_FIXPHONE," +
                 "b.EMER_MOBPHONE, b.OFF_ADDR, b.OFF_RT, b.OFF_RW, b.OFF_KEL," +
                 "b.OFF_KEC, b.OFF_CITY, b.OFF_ZIP, b.OFF_PROV," +
                 "b.OFF_FIXPH_AREA || '-' || b.OFF_FIXPHONE OFF_FIXPHONE," +
                 "b.OFF_MOBPHONE, b.CUST_ADDR, b.CUST_RT, b.CUST_RW," +
                 "b.CUST_KEL, b.CUST_KEC, b.CUST_CITY, b.CUST_ZIP, b.CUST_PROV," +
                 "b.CUST_FIXPH_AREA || '-' || b.CUST_FIXPHONE CUST_FIXPHONE," +
                 "D.COLLEC_NAME, d.COLLEC_ADDR, d.COLLEC_RT, d.COLLEC_RW, d.COLLEC_KEL," +
                 "d.COLLEC_KEC, d.COLLEC_CITY, d.COLLEC_ZIP, d.COLLEC_PROV, d.COLLEC_FIXPH_AREA," +
                 "d.COLLEC_FIXPHONE, d.COLLEC_FAX_AREA, d.COLLEC_FAXIMILE, d.COLLEC_MOBPHONE," +
                 "d.COLLEC_EMAIL, d.COLLEC_MOBPHONE_2," +
                 " (SELECT MAX (NEXT_DUE_DATE) FROM ACCTMGMT.AR_TRN_SUM_CONTRACTS" +
                 " WHERE CUST_NO = a.CUST_NO) NEXT_DUE_DATE" +
                 " FROM FIFAPPS.FS_MST_CUST a, FIFAPPS.FS_MST_CUST_IND b, ORDMGMT.OM_TRN_APPL_HDR c, ORDMGMT.OM_TRN_APPL_ADDR d" +
                 " WHERE a.CUST_NO = ?" +
                 " AND a.CUST_NO = b.CUST_NO" +
                 " AND b.CUST_NO = c.CUST_NO(+)" +
                 " AND c.APPL_NO = d.APPL_NO(+)" +
                 " ORDER BY APPL_DATE DESC)" +
                 " WHERE ROWNUM = 1";
       
//        
//       lBranch = jdbcTemplate.query(_sql, new RowMapper<Map>() {
//
//            public Map mapRow(ResultSet rs, int i) throws SQLException {
//                Map m = new HashMap();
//                m.put("BRANCH_ID", rs.getString("BRANCH_ID"));
//                return m;
//                       
//                        
//            }
//        }, cust_no);
//       if(lBranch.get(0).get("BRANCH_ID")=="A"){
//           Map m = new HashMap();
//           m.put("BRANCH_ID", "A1");
//           lBranch.add(m);
//       }
//       
        
        return jdbcTemplate.query(_sql, new RowMapper<CustomerHeaderDto>() {

            public CustomerHeaderDto mapRow(ResultSet rs, int i) throws SQLException {
                CustomerHeaderDto cust = new CustomerHeaderDto(rs.getString("CUST_NO"),rs.getString("BRANCH_ID"), rs.getString("CUST_NAME"), rs.getString("KTP_CUST_NAME"),
                        rs.getString("CUST_TITLE"), rs.getString("CUST_SEX"), rs.getString("BIRTH_PLACE"), rs.getString("birthDate"), 
                        rs.getString("MOTHERS_NAME"), rs.getString("CUST_CATEGORY"), rs.getString("MARITAL_STAT"), rs.getString("CUST_MOBPHONE"),
                        rs.getString("NEXT_DUE_DATE"), 
                        new CustomerIdAddressDto(rs.getString("ID_CUST_ADDR"), rs.getString("ID_CUST_RT"), rs.getString("ID_CUST_RW"),
                                rs.getString("ID_CUST_KEL"), rs.getString("ID_CUST_KEC"), rs.getString("ID_CUST_CITY"),
                                rs.getString("ID_CUST_PROV"), rs.getString("ID_CUST_ZIP")), 
                        new CustomerMailAddressDto(rs.getString("MAIL_ADDR"), rs.getString("MAIL_RT"),
                                rs.getString("MAIL_RW"), rs.getString("MAIL_KEL"), rs.getString("MAIL_KEC"),
                                rs.getString("MAIL_CITY"), rs.getString("MAIL_PROV"), rs.getString("MAIL_ZIP"),
                                rs.getString("MAIL_FIXPHONE"), rs.getString("MAIL_MOBPHONE")),
                        new CustomerCollectAddressDto(rs.getString("COLLEC_NAME"),rs.getString("COLLEC_ADDR"), rs.getString("COLLEC_RT"),
                                rs.getString("COLLEC_RW"), rs.getString("COLLEC_KEL"), rs.getString("COLLEC_KEC"),
                                rs.getString("COLLEC_CITY"), rs.getString("COLLEC_PROV"), rs.getString("COLLEC_ZIP"),
                                rs.getString("COLLEC_FIXPH_AREA"), rs.getString("COLLEC_FIXPHONE"), rs.getString("COLLEC_FAX_AREA"),
                                rs.getString("COLLEC_FAXIMILE"), rs.getString("COLLEC_MOBPHONE"), rs.getString("COLLEC_MOBPHONE_2"),
                                rs.getString("COLLEC_EMAIL")),
                        new CustomerEmergencyAddressDto(rs.getString("EMER_ADDR"), rs.getString("EMER_RT"),
                                rs.getString("EMER_RW"), rs.getString("EMER_KEL"), rs.getString("EMER_KEC"),
                                rs.getString("EMER_CITY"), rs.getString("EMER_PROV"), rs.getString("EMER_ZIP"),
                                rs.getString("EMER_FIXPHONE"), rs.getString("EMER_MOBPHONE")), 
                        new CustomerHomeAddressDto(rs.getString("CUST_ADDR"), rs.getString("CUST_RT"),
                                rs.getString("CUST_RW"), rs.getString("CUST_KEL"), rs.getString("CUST_KEC"),
                                rs.getString("CUST_CITY"), rs.getString("CUST_PROV"), rs.getString("CUST_ZIP"),
                                rs.getString("CUST_FIXPHONE"), rs.getString("CUST_MOBPHONE")), 
                        new CustomerOfficeAddressDto(rs.getString("OFF_ADDR"), rs.getString("OFF_RT"),
                                rs.getString("OFF_RW"), rs.getString("OFF_KEL"), rs.getString("OFF_KEC"),
                                rs.getString("OFF_CITY"), rs.getString("OFF_PROV"), rs.getString("OFF_ZIP"),
                                rs.getString("OFF_FIXPHONE"), rs.getString("OFF_MOBPHONE")));
                return cust;
            }
        }, cust_no);
    }
    
    
}
