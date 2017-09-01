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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "OM_MST_PROMO_DTL")
public class PromoDetailModel implements Serializable{
    
    @Id
    private String PROMO_DTL_ID;
    private String PROMO_DTL_DESC;
    private String PROMO_DTL_BRANCH;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date PROMO_DTL_VALID_DATE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date PROMO_DTL_INVALID_DATE;
    private String PROMO_FLAG;
    private String PROMO_DTL_REGION;
    private String BUSS_UNIT;
    private String COY_ID;
    private String QUOTA_FLAG;
    @ManyToOne
    @JoinColumn(name="PROMO_MST_CODE")
    private PromoModel PROMO_MST_CODE;

    public PromoDetailModel() {
    }

    public PromoDetailModel(String PROMO_DTL_ID, String PROMO_DTL_DESC, String PROMO_DTL_BRANCH, Date PROMO_DTL_VALID_DATE, Date PROMO_DTL_INVALID_DATE, String PROMO_FLAG, String PROMO_DTL_REGION, String BUSS_UNIT, String COY_ID, String QUOTA_FLAG, PromoModel PROMO_MST_CODE) {
        this.PROMO_DTL_ID = PROMO_DTL_ID;
        this.PROMO_DTL_DESC = PROMO_DTL_DESC;
        this.PROMO_DTL_BRANCH = PROMO_DTL_BRANCH;
        this.PROMO_DTL_VALID_DATE = PROMO_DTL_VALID_DATE;
        this.PROMO_DTL_INVALID_DATE = PROMO_DTL_INVALID_DATE;
        this.PROMO_FLAG = PROMO_FLAG;
        this.PROMO_DTL_REGION = PROMO_DTL_REGION;
        this.BUSS_UNIT = BUSS_UNIT;
        this.COY_ID = COY_ID;
        this.QUOTA_FLAG = QUOTA_FLAG;
        this.PROMO_MST_CODE = PROMO_MST_CODE;
    }

    public String getPROMO_DTL_ID() {
        return PROMO_DTL_ID;
    }

    public void setPROMO_DTL_ID(String PROMO_DTL_ID) {
        this.PROMO_DTL_ID = PROMO_DTL_ID;
    }

    public String getPROMO_DTL_DESC() {
        return PROMO_DTL_DESC;
    }

    public void setPROMO_DTL_DESC(String PROMO_DTL_DESC) {
        this.PROMO_DTL_DESC = PROMO_DTL_DESC;
    }

    public String getPROMO_DTL_BRANCH() {
        return PROMO_DTL_BRANCH;
    }

    public void setPROMO_DTL_BRANCH(String PROMO_DTL_BRANCH) {
        this.PROMO_DTL_BRANCH = PROMO_DTL_BRANCH;
    }

    public Date getPROMO_DTL_VALID_DATE() {
        return PROMO_DTL_VALID_DATE;
    }

    public void setPROMO_DTL_VALID_DATE(Date PROMO_DTL_VALID_DATE) {
        this.PROMO_DTL_VALID_DATE = PROMO_DTL_VALID_DATE;
    }

    public Date getPROMO_DTL_INVALID_DATE() {
        return PROMO_DTL_INVALID_DATE;
    }

    public void setPROMO_DTL_INVALID_DATE(Date PROMO_DTL_INVALID_DATE) {
        this.PROMO_DTL_INVALID_DATE = PROMO_DTL_INVALID_DATE;
    }

    public String getPROMO_FLAG() {
        return PROMO_FLAG;
    }

    public void setPROMO_FLAG(String PROMO_FLAG) {
        this.PROMO_FLAG = PROMO_FLAG;
    }

    public String getPROMO_DTL_REGION() {
        return PROMO_DTL_REGION;
    }

    public void setPROMO_DTL_REGION(String PROMO_DTL_REGION) {
        this.PROMO_DTL_REGION = PROMO_DTL_REGION;
    }

    public String getBUSS_UNIT() {
        return BUSS_UNIT;
    }

    public void setBUSS_UNIT(String BUSS_UNIT) {
        this.BUSS_UNIT = BUSS_UNIT;
    }

    public String getCOY_ID() {
        return COY_ID;
    }

    public void setCOY_ID(String COY_ID) {
        this.COY_ID = COY_ID;
    }

    public String getQUOTA_FLAG() {
        return QUOTA_FLAG;
    }

    public void setQUOTA_FLAG(String QUOTA_FLAG) {
        this.QUOTA_FLAG = QUOTA_FLAG;
    }

    public PromoModel getPROMO_MST_CODE() {
        return PROMO_MST_CODE;
    }

    public void setPROMO_MST_CODE(PromoModel PROMO_MST_CODE) {
        this.PROMO_MST_CODE = PROMO_MST_CODE;
    }
    
    
    
    
}
