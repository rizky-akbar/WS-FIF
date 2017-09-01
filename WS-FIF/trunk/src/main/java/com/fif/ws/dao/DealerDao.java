/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.dao;

import com.fif.ws.model.master.DealerMaster;
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
public class DealerDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    public List<DealerMaster> getDealerByDealerCode(String dealer_code){
        return sessionFactory.getCurrentSession()
                .createQuery("from DealerMaster where SUPL_CODE=?")
                .setParameter(0, dealer_code)
                .list();
    }
     public List<DealerMaster> getDealerByMpf(Date since_date ){
        return sessionFactory.getCurrentSession()
                .createQuery("from DealerMaster d where d.SUPL_OUTLET_TYPE in ('00','07','11') and (d.CREATED_TIMESTAMP>=? or d.LASTUPDATE_TIMESTAMP>=?)")
                .setParameter(0, since_date)
                .setParameter(1, since_date)
                .list();
    }
     public List<DealerMaster> getDealerByAllMpf(){
        return sessionFactory.getCurrentSession()
                .createQuery("from DealerMaster where SUPL_OUTLET_TYPE in ('00','07','11') and SUPL_STATUS='AC'")
                .list();
    }
    public List<DealerMaster> getDealer(){
        return sessionFactory.getCurrentSession()
                .createQuery("from DealerMaster where rownum < 10")
                .list();
    }
    
}
