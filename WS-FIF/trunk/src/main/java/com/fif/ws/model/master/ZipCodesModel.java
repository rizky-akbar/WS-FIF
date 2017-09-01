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
@Table(name = "FS_MST_ZIPCODES")
public class ZipCodesModel implements Serializable {
    @Id
    private String ZIP_CODE;
    private String OFFICE_CODE;
    private String DESCRIPTION;
    private String IS_BLANKSPOT;
    private String CREATED_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_TIMESTAMP;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date LASTUPDATE_TIMESTAMP;
    private String LASTUPDATE_BY;

    /**
     * @return the ZIP_CODE
     */
    public String getZIP_CODE() {
        return ZIP_CODE;
    }

    /**
     * @param ZIP_CODE the ZIP_CODE to set
     */
    public void setZIP_CODE(String ZIP_CODE) {
        this.ZIP_CODE = ZIP_CODE;
    }

    /**
     * @return the OFFICE_CODE
     */
    public String getOFFICE_CODE() {
        return OFFICE_CODE;
    }

    /**
     * @param OFFICE_CODE the OFFICE_CODE to set
     */
    public void setOFFICE_CODE(String OFFICE_CODE) {
        this.OFFICE_CODE = OFFICE_CODE;
    }

    /**
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION the DESCRIPTION to set
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the IS_BLANKSPOT
     */
    public String getIS_BLANKSPOT() {
        return IS_BLANKSPOT;
    }

    /**
     * @param IS_BLANKSPOT the IS_BLANKSPOT to set
     */
    public void setIS_BLANKSPOT(String IS_BLANKSPOT) {
        this.IS_BLANKSPOT = IS_BLANKSPOT;
    }

    /**
     * @return the CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * @param CREATED_BY the CREATED_BY to set
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    /**
     * @return the CREATED_TIMESTAMP
     */
    public Date getCREATED_TIMESTAMP() {
        return CREATED_TIMESTAMP;
    }

    /**
     * @param CREATED_TIMESTAMP the CREATED_TIMESTAMP to set
     */
    public void setCREATED_TIMESTAMP(Date CREATED_TIMESTAMP) {
        this.CREATED_TIMESTAMP = CREATED_TIMESTAMP;
    }

    /**
     * @return the LASTUPDATE_TIMESTAMP
     */
    public Date getLASTUPDATE_TIMESTAMP() {
        return LASTUPDATE_TIMESTAMP;
    }

    /**
     * @param LASTUPDATE_TIMESTAMP the LASTUPDATE_TIMESTAMP to set
     */
    public void setLASTUPDATE_TIMESTAMP(Date LASTUPDATE_TIMESTAMP) {
        this.LASTUPDATE_TIMESTAMP = LASTUPDATE_TIMESTAMP;
    }

    /**
     * @return the LASTUPDATE_BY
     */
    public String getLASTUPDATE_BY() {
        return LASTUPDATE_BY;
    }

    /**
     * @param LASTUPDATE_BY the LASTUPDATE_BY to set
     */
    public void setLASTUPDATE_BY(String LASTUPDATE_BY) {
        this.LASTUPDATE_BY = LASTUPDATE_BY;
    }
}
