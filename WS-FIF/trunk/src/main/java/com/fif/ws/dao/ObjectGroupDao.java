/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.ObjectGroupModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class ObjectGroupDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<ObjectGroupModel> getObjectGroup(){
        return sessionFactory.getCurrentSession()
                .createQuery("from ObjectGroupModel")
                .list();
    }
}
