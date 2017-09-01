/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.ZipCodesModel;
import com.fif.ws.model.master.dto.ZipCodesDto;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RizkyAkbar
 */
@Repository
public class ZipCodesDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<ZipCodesModel> getZipCodes(){
        return sessionFactory.getCurrentSession()
                .createQuery("from ZipCodesModel")
                .list();
    }
}
