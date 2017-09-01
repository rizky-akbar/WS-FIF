/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.CitiesModel;
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
public class CitiesDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<CitiesModel> getCities(){
        return sessionFactory.getCurrentSession()
                .createQuery("from CitiesModel")
                .list();
    }
    
     public List<CitiesModel> getCitiesByDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from CitiesModel where CREATE_DATE>=? or UPDATE_DATE>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }
    
    public List<CitiesModel> getCityByCityCode (String city_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from CitiesModel where CITY_CODE=?")
                .setParameter(0, city_code).list();
    }
    
    public List<CitiesModel> getCityByProvCode (String prov_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from CitiesModel where PROV_CODE=?")
                .setParameter(0, prov_code).list();
    }
}
    