/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.ProvinsiModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class ProvinsiDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<ProvinsiModel> getProvinsi(){
        return sessionFactory.getCurrentSession()
                .createQuery("from ProvinsiModel")
                .list();
    }
}
