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
@Table(name = "FIFWS.WS_LOG_UPDATE_PHONE_CUST")
public class UpdatePhoneModel {
    @Id
    private Long SEQ_NO;
    private String CUST_NO;
    private String MOBILE_PHONE;
    private String CREATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    

    /**
     * @return the SEQ_NO
     */
    public Long getSEQ_NO() {
        return SEQ_NO;
    }

    /**
     * @param SEQ_NO the SEQ_NO to set
     */
    public void setSEQ_NO(Long SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }

    /**
     * @return the CUST_NO
     */
    public String getCUST_NO() {
        return CUST_NO;
    }

    /**
     * @param CUST_NO the CUST_NO to set
     */
    public void setCUST_NO(String CUST_NO) {
        this.CUST_NO = CUST_NO;
    }

    /**
     * @return the MOBILE_PHONE
     */
    public String getMOBILE_PHONE() {
        return MOBILE_PHONE;
    }

    /**
     * @param MOBILE_PHONE the MOBILE_PHONE to set
     */
    public void setMOBILE_PHONE(String MOBILE_PHONE) {
        this.MOBILE_PHONE = MOBILE_PHONE;
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
}
