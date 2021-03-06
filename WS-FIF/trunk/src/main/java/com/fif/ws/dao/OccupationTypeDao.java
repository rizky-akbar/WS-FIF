/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.OccupationTypeModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class OccupationTypeDao {
    
      
    @Autowired
    private SessionFactory sessionFactory;
    public List<OccupationTypeModel> getOccupationByOcptType (String ocpt_type){
        return sessionFactory.getCurrentSession()
                .createQuery("from OccupationTypeModel where OCPT_TYPE=?")
                .setParameter(0, ocpt_type).list();
    }
}

