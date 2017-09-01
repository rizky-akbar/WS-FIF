/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RizkyAkbar
 */

@Entity
@Table(name = "OM_MST_PROMO_MST")
public class PromoModel implements Serializable{

    @Id
    private String PROMO_MST_CODE;
    private String PROMO_MST_DESC;
    private String CREATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    private String UPDATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;
    private String BUSS_UNIT;
    private String COY_ID;
    private String IS_ACTIVE;
    @OneToMany(mappedBy="PROMO_MST_CODE", targetEntity = PromoDetailModel.class, fetch = FetchType.LAZY)
    private List<PromoDetailModel> promoDetails;

    public PromoModel() {
    }

    public PromoModel(String PROMO_MST_CODE, String PROMO_MST_DESC, String CREATE_BY, Date CREATE_DATE, String UPDATE_BY, Date UPDATE_DATE, String BUSS_UNIT, String COY_ID, String IS_ACTIVE) {
        this.PROMO_MST_CODE = PROMO_MST_CODE;
        this.PROMO_MST_DESC = PROMO_MST_DESC;
        this.CREATE_BY = CREATE_BY;
        this.CREATE_DATE = CREATE_DATE;
        this.UPDATE_BY = UPDATE_BY;
        this.UPDATE_DATE = UPDATE_DATE;
        this.BUSS_UNIT = BUSS_UNIT;
        this.COY_ID = COY_ID;
        this.IS_ACTIVE = IS_ACTIVE;
    }

    
    public List<PromoDetailModel> getPromoDetails() {
        return promoDetails;
    }

    public void setPromoDetails(List<PromoDetailModel> promoDetails) {
        this.promoDetails = promoDetails;
    }

    public String getPROMO_MST_CODE() {
        return PROMO_MST_CODE;
    }

    public void setPROMO_MST_CODE(String PROMO_MST_CODE) {
        this.PROMO_MST_CODE = PROMO_MST_CODE;
    }

    public String getPROMO_MST_DESC() {
        return PROMO_MST_DESC;
    }

    public void setPROMO_MST_DESC(String PROMO_MST_DESC) {
        this.PROMO_MST_DESC = PROMO_MST_DESC;
    }

    public String getCREATE_BY() {
        return CREATE_BY;
    }

    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
    }

    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
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

    public String getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(String IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }
    
    
    
}
