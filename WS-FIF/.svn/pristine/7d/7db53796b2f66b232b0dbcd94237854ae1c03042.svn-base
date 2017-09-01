/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.OccupationModel;
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
public class OccupationDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<OccupationModel> getOccupation(){
        return sessionFactory.getCurrentSession()
                .createQuery("from OccupationModel")
                .list();
    }
    
    public List<OccupationModel> getOccupationByDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from OccupationModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    } 
    
    public List<OccupationModel> getOccupationByOcptType (String ocpt_type){
        return sessionFactory.getCurrentSession()
                .createQuery("from OccupationModel where ocpt_type=?")
                .setParameter(0, ocpt_type).list();
    }
}
