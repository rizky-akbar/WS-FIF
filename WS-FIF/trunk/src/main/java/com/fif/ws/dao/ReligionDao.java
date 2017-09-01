/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.ReligionModel;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class ReligionDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<ReligionModel> getReligion() {
        return sessionFactory.getCurrentSession()
                .createQuery("from ReligionModel")
                .list();
    }
    
    public List<ReligionModel> getReligionByDate(Date since_date) {
        return sessionFactory.getCurrentSession()
                .createQuery("from ReligionModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }
}
