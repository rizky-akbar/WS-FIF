/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.RegionalModel;
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
public class RegionalDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<RegionalModel> getRegionalsBySinceDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from RegionalModel where CREATED_TIMESTAMP >= :since_date or LASTUPDATE_TIMESTAMP >= :since_date")
                .setParameter("since_date", since_date)
                .list();
    }
    
    public List<RegionalModel> getRegionals(){
        return sessionFactory.getCurrentSession()
                .createQuery("from RegionalModel ")
                .list();
    }
}
