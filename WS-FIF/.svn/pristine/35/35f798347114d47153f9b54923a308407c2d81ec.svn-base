/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.dao;

import com.fif.ws.model.master.KecamatanModel;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class KecamatanDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<KecamatanModel> getKecamatan() {
        return sessionFactory.getCurrentSession()
                .createQuery("from KecamatanModel")
                .list();
    }
    public List<KecamatanModel> getKecamatanByCityCode (String city_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from KecamatanModel where CITY_CODE=?")
                .setParameter(0, city_code).list();
    }
    public List<KecamatanModel> getKecamatanByKecCode (String kec_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from KecamatanModel where KEC_CODE=?")
                .setParameter(0, kec_code).list();
    }
}
