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
@Table(name = "FS_MST_SUB_OCCUPATION")
public class OccupationSubModel {

    @Id
    private String OCPT_SUB_CODE;
    private String OCPT_DESC;
    private String OCPT_SALARY;
    private String OCPT_DEV_SAL;
    private String OCPT_ERROR;
    private String OCPT_RATING;
    private String OCPT_PARAMETER1;
    private String OCPT_PARAMETER2;
    private String OCPT_ERROR_VALUE;
    private String CREATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;
    private String UPDATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;
    private String OCPT_CODE;

    /**
     * @return the OCPT_SUB_CODE
     */
    public String getOCPT_SUB_CODE() {
        return OCPT_SUB_CODE;
    }

    /**
     * @param OCPT_SUB_CODE the OCPT_SUB_CODE to set
     */
    public void setOCPT_SUB_CODE(String OCPT_SUB_CODE) {
        this.OCPT_SUB_CODE = OCPT_SUB_CODE;
    }

    /**
     * @return the OCPT_DESC
     */
    public String getOCPT_DESC() {
        return OCPT_DESC;
    }

    /**
     * @param OCPT_DESC the OCPT_DESC to set
     */
    public void setOCPT_DESC(String OCPT_DESC) {
        this.OCPT_DESC = OCPT_DESC;
    }

    /**
     * @return the OCPT_SALARY
     */
    public String getOCPT_SALARY() {
        return OCPT_SALARY;
    }

    /**
     * @param OCPT_SALARY the OCPT_SALARY to set
     */
    public void setOCPT_SALARY(String OCPT_SALARY) {
        this.OCPT_SALARY = OCPT_SALARY;
    }

    /**
     * @return the OCPT_DEV_SAL
     */
    public String getOCPT_DEV_SAL() {
        return OCPT_DEV_SAL;
    }

    /**
     * @param OCPT_DEV_SAL the OCPT_DEV_SAL to set
     */
    public void setOCPT_DEV_SAL(String OCPT_DEV_SAL) {
        this.OCPT_DEV_SAL = OCPT_DEV_SAL;
    }

    /**
     * @return the OCPT_ERROR
     */
    public String getOCPT_ERROR() {
        return OCPT_ERROR;
    }

    /**
     * @param OCPT_ERROR the OCPT_ERROR to set
     */
    public void setOCPT_ERROR(String OCPT_ERROR) {
        this.OCPT_ERROR = OCPT_ERROR;
    }

    /**
     * @return the OCPT_RATING
     */
    public String getOCPT_RATING() {
        return OCPT_RATING;
    }

    /**
     * @param OCPT_RATING the OCPT_RATING to set
     */
    public void setOCPT_RATING(String OCPT_RATING) {
        this.OCPT_RATING = OCPT_RATING;
    }

    /**
     * @return the OCPT_PARAMETER1
     */
    public String getOCPT_PARAMETER1() {
        return OCPT_PARAMETER1;
    }

    /**
     * @param OCPT_PARAMETER1 the OCPT_PARAMETER1 to set
     */
    public void setOCPT_PARAMETER1(String OCPT_PARAMETER1) {
        this.OCPT_PARAMETER1 = OCPT_PARAMETER1;
    }

    /**
     * @return the OCPT_PARAMETER2
     */
    public String getOCPT_PARAMETER2() {
        return OCPT_PARAMETER2;
    }

    /**
     * @param OCPT_PARAMETER2 the OCPT_PARAMETER2 to set
     */
    public void setOCPT_PARAMETER2(String OCPT_PARAMETER2) {
        this.OCPT_PARAMETER2 = OCPT_PARAMETER2;
    }

    /**
     * @return the OCPT_ERROR_VALUE
     */
    public String getOCPT_ERROR_VALUE() {
        return OCPT_ERROR_VALUE;
    }

    /**
     * @param OCPT_ERROR_VALUE the OCPT_ERROR_VALUE to set
     */
    public void setOCPT_ERROR_VALUE(String OCPT_ERROR_VALUE) {
        this.OCPT_ERROR_VALUE = OCPT_ERROR_VALUE;
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
     * @return the OCPT_CODE
     */
    public String getOCPT_CODE() {
        return OCPT_CODE;
    }

    /**
     * @param OCPT_CODE the OCPT_CODE to set
     */
    public void setOCPT_CODE(String OCPT_CODE) {
        this.OCPT_CODE = OCPT_CODE;
    }

}
