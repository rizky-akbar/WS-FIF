/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.KecamatanModel;
import com.fif.ws.model.master.KelurahanModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class KelurahanDao {
    
    @Autowired
    private SessionFactory sessionFactory;
        
      public List<KelurahanModel> getKelurahan(){
        return sessionFactory.getCurrentSession().
                createQuery("from KelurahanModel").list();
    }
    public List<KelurahanModel> getKelurahanByKecCode (String kec_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from KelurahanModel where KEC_CODE=?")
                .setParameter(0, kec_code).list();
    }
    public List<KelurahanModel> getKelurahanByKelCode (String kel_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from KelurahanModel where KEL_CODE=?")
                .setParameter(0, kel_code).list();
    }
    
    
}
