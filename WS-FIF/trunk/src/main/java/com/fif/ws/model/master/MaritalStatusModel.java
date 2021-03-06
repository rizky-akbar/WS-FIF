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
@Table(name = "FS_MST_MARITAL_STATUS")
public class MaritalStatusModel {
    
    @Id
    private String MARITAL_STAT;
    private String MARITAL_DESC;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;

    /**
     * @return the MARITAL_STAT
     */
    public String getMARITAL_STAT() {
        return MARITAL_STAT;
    }

    /**
     * @param MARITAL_STAT the MARITAL_STAT to set
     */
    public void setMARITAL_STAT(String MARITAL_STAT) {
        this.MARITAL_STAT = MARITAL_STAT;
    }

    /**
     * @return the MARITAL_DESC
     */
    public String getMARITAL_DESC() {
        return MARITAL_DESC;
    }

    /**
     * @param MARITAL_DESC the MARITAL_DESC to set
     */
    public void setMARITAL_DESC(String MARITAL_DESC) {
        this.MARITAL_DESC = MARITAL_DESC;
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
