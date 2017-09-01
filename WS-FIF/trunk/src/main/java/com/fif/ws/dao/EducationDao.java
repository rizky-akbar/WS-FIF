/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.EducationModel;
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
public class EducationDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<EducationModel> getEducation(){
        return sessionFactory.getCurrentSession()
                .createQuery("from EducationModel")
                .list();
    }
    
     public List<EducationModel> getEducationByDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from EducationModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }
}
