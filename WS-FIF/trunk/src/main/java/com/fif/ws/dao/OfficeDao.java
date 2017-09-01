/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.OfficesModel;
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
public class OfficeDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<OfficesModel> getOffices(){
        return sessionFactory.getCurrentSession()
                .createQuery("from OfficesModel")
                .list();
    }
    
    public List<OfficesModel> getOfficesByDate(Date since_date){
        return sessionFactory.getCurrentSession()
                .createQuery("from OfficesModel o where o.CREATED_TIMESTAMP>=? or o.LASTUPDATE_TIMESTAMP>=?")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
        
    }
    public List<OfficesModel> getOfficesByBranchName(String branch_name){
        return sessionFactory.getCurrentSession()
                .createQuery("from OfficesModel where NAME_SHORT=?")
                .setParameter(0, branch_name)
                .list();
    }
    public List<OfficesModel> getOfficesByBranchCode(String branch_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from OfficesModel where OFFICE_CODE =?")
                .setParameter(0, branch_code)
                .list();
    }
}
