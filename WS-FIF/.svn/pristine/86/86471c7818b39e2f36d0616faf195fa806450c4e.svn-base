/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.model.master;

import java.io.Serializable;
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
@Table(name = "FS_MST_KELURAHAN")
public class KelurahanModel implements Serializable {

    @Id
    private String KEL_CODE;
    private String KELURAHAN;
    private String KEC_CODE;
    private String CREATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    private String UPDATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;

    /**
     * @return the KEL_CODE
     */
    public KelurahanModel() {

    }

    public String getKEL_CODE() {
        return KEL_CODE;
    }

    /**
     * @param KEL_CODE the KEL_CODE to set
     */
    public void setKEL_CODE(String KEL_CODE) {
        this.KEL_CODE = KEL_CODE;
    }

    /**
     * @return the KELURAHAN
     */
    public String getKELURAHAN() {
        return KELURAHAN;
    }

    /**
     * @param KELURAHAN the KELURAHAN to set
     */
    public void setKELURAHAN(String KELURAHAN) {
        this.KELURAHAN = KELURAHAN;
    }

    /**
     * @return the KEC_CODE
     */
    public String getKEC_CODE() {
        return KEC_CODE;
    }

    /**
     * @param KEC_CODE the KEC_CODE to set
     */
    public void setKEC_CODE(String KEC_CODE) {
        this.KEC_CODE = KEC_CODE;
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
