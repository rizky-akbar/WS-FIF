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
import javax.persistence.TemporalType;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "FS_MST_CITIES")
public class CitiesModel implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    private String CITY_CODE;
    private String CITY;
    private String PROV_CODE;
    private String CREATE_BY;
    @Temporal(TemporalType.TIMESTAMP)
    private Date CREATE_DATE;
    private String UPDATE_BY;
    @Temporal(TemporalType.TIMESTAMP)
    private Date UPDATE_DATE;
    private String DATI2;
    private String DIGIT_ZIP;

    /**
     * @return the CITY_CODE
     */
    public String getCITY_CODE() {
        return CITY_CODE;
    }

    /**
     * @param CITY_CODE the CITY_CODE to set
     */
    public void setCITY_CODE(String CITY_CODE) {
        this.CITY_CODE = CITY_CODE;
    }

    /**
     * @return the CITY
     */
    public String getCITY() {
        return CITY;
    }

    /**
     * @param CITY the CITY to set
     */
    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    /**
     * @return the PROV_CODE
     */
    public String getPROV_CODE() {
        return PROV_CODE;
    }

    /**
     * @param PROV_CODE the PROV_CODE to set
     */
    public void setPROV_CODE(String PROV_CODE) {
        this.PROV_CODE = PROV_CODE;
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

    /**
     * @return the DATI2
     */
    public String getDATI2() {
        return DATI2;
    }

    /**
     * @param DATI2 the DATI2 to set
     */
    public void setDATI2(String DATI2) {
        this.DATI2 = DATI2;
    }

    /**
     * @return the DIGIT_ZIP
     */
    public String getDIGIT_ZIP() {
        return DIGIT_ZIP;
    }

    /**
     * @param DIGIT_ZIP the DIGIT_ZIP to set
     */
    public void setDIGIT_ZIP(String DIGIT_ZIP) {
        this.DIGIT_ZIP = DIGIT_ZIP;
    }

}
