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
@Table(name = "FS_MST_OCCU_TYPE")
public class OccupationTypeModel {
    @Id
    private String OCPT_TYPE;
    private String OCPT_DESCR;
    private String CREATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    private String UPDATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;

    /**
     * @return the OCPT_TYPE
     */
    public String getOCPT_TYPE() {
        return OCPT_TYPE;
    }

    /**
     * @param OCPT_TYPE the OCPT_TYPE to set
     */
    public void setOCPT_TYPE(String OCPT_TYPE) {
        this.OCPT_TYPE = OCPT_TYPE;
    }

    /**
     * @return the OCPT_DESCR
     */
    public String getOCPT_DESCR() {
        return OCPT_DESCR;
    }

    /**
     * @param OCPT_DESCR the OCPT_DESCR to set
     */
    public void setOCPT_DESCR(String OCPT_DESCR) {
        this.OCPT_DESCR = OCPT_DESCR;
    }

    /**
     * @return the CREATE_BY
     */
    public String getCREATE_BY() {
        return CREATE_BY;
    }

    /**
     * @param CREATE_BY the CREATE_BY to set
     */
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
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
     * @return the UPDATE_BY
     */
    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    /**
     * @param UPDATE_BY the UPDATE_BY to set
     */
    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
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
