/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.CustomerModel;
import com.fif.ws.model.master.dto.CustomerDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
public class CustomerIndDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CustomerDto> getCustomerIndividu(Date birth_date, String id_number, String id_type,
            String cust_name, String no_kontrak) {
//        String _sql = "SELECT custid.cust_no, custid.cust_name, custid.ktp_cust_name, "
//                + "custid.cust_title,custid.cust_sex, custid.cust_category,custid.birth_place,"
//                + "to_char(custid.birth_date, 'YYYYMMDD') birthDate,custid.mothers_name,custid.cust_type_id,custid.ocpt_type,"
//                + "custid.ocpt_code,custid.ocpt_sub_code,custid.edu_type,custid.relg_id,custid.marital_stat,"
//                + "custid.house_stat,custid.branch_id"
//                + "           FROM fifapps.fs_mst_cust cust,"
//                + "                fifapps.fs_mst_cust_ind custid,"
//                + "                acctmgmt.ar_trn_sum_contracts cont,"
//                + "                ordmgmt.om_trn_appl_hdr appl"
//                + "          WHERE cust.cust_no = cont.cust_no"
//                + "            AND cust.cust_no = custid.cust_no"
//                + "            AND cont.contract_no = appl.contract_no"
//                + "            AND (   (    cust.identity_no = ?"
//                + "                     AND cust.ident_type = ?"
//                + "                     AND cust.cust_name = ?)"
//                + "                 OR (cont.contract_no = ? AND appl.birth_date = ?))";
        String _sql = "SELECT custid.cust_no, custid.cust_name, custid.ktp_cust_name, "
                + "custid.cust_title,custid.cust_sex, custid.cust_category,custid.birth_place,"
                + "to_char(custid.birth_date, 'YYYYMMDD') birthDate,custid.mothers_name,custid.cust_type_id,custid.ocpt_type,"
                + "custid.ocpt_code,custid.ocpt_sub_code,custid.edu_type,custid.relg_id,custid.marital_stat,"
                + "custid.house_stat,custid.branch_id"
                + "           FROM fifapps.fs_mst_cust cust,"
                + "                fifapps.fs_mst_cust_ind custid,"
                + "                acctmgmt.ar_trn_sum_contracts cont,"
                + "                ordmgmt.om_trn_appl_hdr appl"
                + "          WHERE cust.cust_no = cont.cust_no"
                + "            AND cust.cust_no = custid.cust_no"
                + "            AND cont.contract_no = appl.contract_no"
                + "            AND cont.contract_no = ? AND appl.birth_date = ?";
        return jdbcTemplate.query(_sql, new RowMapper<CustomerDto>() {

            public CustomerDto mapRow(ResultSet rs, int i) throws SQLException {
                CustomerDto custDto = new CustomerDto(rs.getString("cust_no"), rs.getString("cust_name"),
                        rs.getString("ktp_cust_name"), rs.getString("cust_title"), rs.getString("cust_sex"),
                        rs.getString("cust_category"), rs.getString("birth_place"), rs.getString("birthDate"),
                        rs.getString("mothers_name"), rs.getString("cust_type_id"), rs.getString("ocpt_type"),
                        rs.getString("ocpt_code"), rs.getString("ocpt_sub_code"), rs.getString("edu_type"),
                        rs.getString("relg_id"), rs.getString("marital_stat"), rs.getString("house_stat"),
                        rs.getString("branch_id"));
                return custDto;
            }
        }, new Object[]{no_kontrak, birth_date});

    }

    public List<CustomerDto> getCustomerInd(Date birth_date, String id_type, String id_number) {
        String sql_ = "SELECT custid.cust_no, custid.cust_name, custid.ktp_cust_name, "
                + "custid.cust_title,custid.cust_sex, custid.cust_category,custid.birth_place,"
                + "to_char(custid.birth_date, 'YYYYMMDD') birthDate,custid.mothers_name,custid.cust_type_id,custid.ocpt_type,"
                + "custid.ocpt_code,custid.ocpt_sub_code,custid.edu_type,custid.relg_id,custid.marital_stat,"
                + "custid.house_stat,custid.branch_id"
                + "           FROM fifapps.fs_mst_cust cust,"
                + "                fifapps.fs_mst_cust_ind custid,"
                + "                acctmgmt.ar_trn_sum_contracts cont,"
                + "                ordmgmt.om_trn_appl_hdr appl"
                + "          WHERE cust.cust_no = cont.cust_no"
                + "            AND cust.cust_no = custid.cust_no"
                + "            AND cont.contract_no = appl.contract_no"
                + "            AND (cust.identity_no = ? AND cust.ident_type = ? AND appl.birth_date = ?)";
        return jdbcTemplate.query(sql_, new RowMapper<CustomerDto>() {

            public CustomerDto mapRow(ResultSet rs, int i) throws SQLException {
                CustomerDto custDto = new CustomerDto(rs.getString("cust_no"), rs.getString("cust_name"),
                        rs.getString("ktp_cust_name"), rs.getString("cust_title"), rs.getString("cust_sex"),
                        rs.getString("cust_category"), rs.getString("birth_place"), rs.getString("birthDate"),
                        rs.getString("mothers_name"), rs.getString("cust_type_id"), rs.getString("ocpt_type"),
                        rs.getString("ocpt_code"), rs.getString("ocpt_sub_code"), rs.getString("edu_type"),
                        rs.getString("relg_id"), rs.getString("marital_stat"), rs.getString("house_stat"),
                        rs.getString("branch_id"));
                return custDto;
            }
        }, new Object[]{id_number, id_type, birth_date});

    }

    public List<CustomerModel> getCustomerByCustNo(String cust_no) {
        return sessionFactory.getCurrentSession()
                .createQuery("from CustomerModel where CUST_NO=?")
                .setParameter(0, cust_no)
                .list();
    }

}
