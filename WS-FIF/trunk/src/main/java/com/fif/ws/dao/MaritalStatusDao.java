/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.MaritalStatusModel;
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
public class MaritalStatusDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<MaritalStatusModel> getMaritalStatus(){
        return sessionFactory.getCurrentSession()
                .createQuery("from MaritalStatusModel")
                .list();
    }
    
     public List<MaritalStatusModel> getMaritalStatusByDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from MaritalStatusModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }
}
