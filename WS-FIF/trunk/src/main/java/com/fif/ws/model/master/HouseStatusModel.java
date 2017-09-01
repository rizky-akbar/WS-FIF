/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "FS_MST_HOUSE_STAT")
public class HouseStatusModel {
    @Id
    private String HOUSE_STAT;
    private String STATUS_DESCR;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;

    /**
     * @return the HOUSE_STAT
     */
    public String getHOUSE_STAT() {
        return HOUSE_STAT;
    }

    /**
     * @param HOUSE_STAT the HOUSE_STAT to set
     */
    public void setHOUSE_STAT(String HOUSE_STAT) {
        this.HOUSE_STAT = HOUSE_STAT;
    }

    /**
     * @return the STATUS_DESCR
     */
    public String getSTATUS_DESCR() {
        return STATUS_DESCR;
    }

    /**
     * @param STATUS_DESCR the STATUS_DESCR to set
     */
    public void setSTATUS_DESCR(String STATUS_DESCR) {
        this.STATUS_DESCR = STATUS_DESCR;
    }

    /**
     * @return the CREATE_DATE
     */
    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    /**
     * @param CREATE_DATE the CREATE_DATE to set
     */
    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    /**
     * @return the UPDATE_DATE
     */
    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    /**
     * @param UPDATE_DATE the UPDATE_DATE to set
     */
    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }
}
