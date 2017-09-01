/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.dto.ResponseMessage;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class UpdateCustomerPhoneDao {

    @Autowired
    private JdbcTemplate jdbcTemplate2;

    public void updateCustomerPhone(String custNo, String mobilePhone) {

        jdbcTemplate2.update("insert into FIFWS.WS_LOG_UPDATE_PHONE_CUST"
                + "(SEQ_NO,CUST_NO,MOBILE_PHONE,CREATE_BY,CREATE_DATE) values(?,?,?,?,?)",
                new Object[]{1,custNo, mobilePhone, "SYSTEM", new Date()});

    }

}
