/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.DocumentModel;
import com.fif.ws.model.master.DocumentOccutypeModel;
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
public class DocumentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<DocumentModel> getDocument() {
        return sessionFactory.getCurrentSession()
                .createQuery("from DocumentModel")
                .list();
    }
   
    public List<DocumentModel> getDocumentbydate(Date since_date) {
        return sessionFactory.getCurrentSession()
                .createQuery("from DocumentModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }

    public List<DocumentOccutypeModel> getDocumentOcc() {
        return sessionFactory.getCurrentSession()
                .createQuery("from DocumentOccutypeModel")
                .list();
    }
}
