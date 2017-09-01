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
@Table(name = "FS_MST_SUPPLIER")
public class DealerMaster {
    
    @Id
    private String SUPL_CODE;
    private String SUPL_BRANCH_ID;
    private String SUPL_NAME;
    private String SUPL_ADDRESS1;
    private String SUPL_ADDRESS2;
    private String SUPL_CITY;
    private String SUPL_PROVINCE;
    private String SUPL_ZIPCODE;
    private String SUPL_STATUS;
    private String SUPL_TYPE;
    private String SUPL_SUB_TYPE;
    private String SUPL_GROUP_ID;
    private String SUPL_OUTLET_TYPE;
    private String SUPL_COMP_TYPE;
    private String SUPL_MAINDEALER_ID;
    private String SUPL_COMP_NAME;
    private String STORE_TYPE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_TIMESTAMP;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date LASTUPDATE_TIMESTAMP;
    

    /**
     * @return the SUPL_CODE
     */
    public String getSUPL_CODE() {
        return SUPL_CODE;
    }

    /**
     * @param SUPL_CODE the SUPL_CODE to set
     */
    public void setSUPL_CODE(String SUPL_CODE) {
        this.SUPL_CODE = SUPL_CODE;
    }

    /**
     * @return the SUPL_BRANCH_ID
     */
    public String getSUPL_BRANCH_ID() {
        return SUPL_BRANCH_ID;
    }

    /**
     * @param SUPL_BRANCH_ID the SUPL_BRANCH_ID to set
     */
    public void setSUPL_BRANCH_ID(String SUPL_BRANCH_ID) {
        this.SUPL_BRANCH_ID = SUPL_BRANCH_ID;
    }

    /**
     * @return the SUPL_NAME
     */
    public String getSUPL_NAME() {
        return SUPL_NAME;
    }

    /**
     * @param SUPL_NAME the SUPL_NAME to set
     */
    public void setSUPL_NAME(String SUPL_NAME) {
        this.SUPL_NAME = SUPL_NAME;
    }

    /**
     * @return the SUPL_ADDRESS1
     */
    public String getSUPL_ADDRESS1() {
        return SUPL_ADDRESS1;
    }

    /**
     * @param SUPL_ADDRESS1 the SUPL_ADDRESS1 to set
     */
    public void setSUPL_ADDRESS1(String SUPL_ADDRESS1) {
        this.SUPL_ADDRESS1 = SUPL_ADDRESS1;
    }

    /**
     * @return the SUPL_ADDRESS2
     */
    public String getSUPL_ADDRESS2() {
        return SUPL_ADDRESS2;
    }

    /**
     * @param SUPL_ADDRESS2 the SUPL_ADDRESS2 to set
     */
    public void setSUPL_ADDRESS2(String SUPL_ADDRESS2) {
        this.SUPL_ADDRESS2 = SUPL_ADDRESS2;
    }

    /**
     * @return the SUPL_CITY
     */
    public String getSUPL_CITY() {
        return SUPL_CITY;
    }

    /**
     * @param SUPL_CITY the SUPL_CITY to set
     */
    public void setSUPL_CITY(String SUPL_CITY) {
        this.SUPL_CITY = SUPL_CITY;
    }

    /**
     * @return the SUPL_PROVINCE
     */
    public String getSUPL_PROVINCE() {
        return SUPL_PROVINCE;
    }

    /**
     * @param SUPL_PROVINCE the SUPL_PROVINCE to set
     */
    public void setSUPL_PROVINCE(String SUPL_PROVINCE) {
        this.SUPL_PROVINCE = SUPL_PROVINCE;
    }

    /**
     * @return the SUPL_STATUS
     */
    public String getSUPL_STATUS() {
        return SUPL_STATUS;
    }

    /**
     * @param SUPL_STATUS the SUPL_STATUS to set
     */
    public void setSUPL_STATUS(String SUPL_STATUS) {
        this.SUPL_STATUS = SUPL_STATUS;
    }

    /**
     * @return the SUPL_TYPE
     */
    public String getSUPL_TYPE() {
        return SUPL_TYPE;
    }

    /**
     * @param SUPL_TYPE the SUPL_TYPE to set
     */
    public void setSUPL_TYPE(String SUPL_TYPE) {
        this.SUPL_TYPE = SUPL_TYPE;
    }

    /**
     * @return the SUPL_SUB_TYPE
     */
    public String getSUPL_SUB_TYPE() {
        return SUPL_SUB_TYPE;
    }

    /**
     * @param SUPL_SUB_TYPE the SUPL_SUB_TYPE to set
     */
    public void setSUPL_SUB_TYPE(String SUPL_SUB_TYPE) {
        this.SUPL_SUB_TYPE = SUPL_SUB_TYPE;
    }

    /**
     * @return the SUPL_GROUP_ID
     */
    public String getSUPL_GROUP_ID() {
        return SUPL_GROUP_ID;
    }

    /**
     * @param SUPL_GROUP_ID the SUPL_GROUP_ID to set
     */
    public void setSUPL_GROUP_ID(String SUPL_GROUP_ID) {
        this.SUPL_GROUP_ID = SUPL_GROUP_ID;
    }

    /**
     * @return the SUPL_OUTLET_TYPE
     */
    public String getSUPL_OUTLET_TYPE() {
        return SUPL_OUTLET_TYPE;
    }

    /**
     * @param SUPL_OUTLET_TYPE the SUPL_OUTLET_TYPE to set
     */
    public void setSUPL_OUTLET_TYPE(String SUPL_OUTLET_TYPE) {
        this.SUPL_OUTLET_TYPE = SUPL_OUTLET_TYPE;
    }

    /**
     * @return the SUPL_COMP_TYPE
     */
    public String getSUPL_COMP_TYPE() {
        return SUPL_COMP_TYPE;
    }

    /**
     * @param SUPL_COMP_TYPE the SUPL_COMP_TYPE to set
     */
    public void setSUPL_COMP_TYPE(String SUPL_COMP_TYPE) {
        this.SUPL_COMP_TYPE = SUPL_COMP_TYPE;
    }

    /**
     * @return the SUPL_MAINDEALER
     */
    
    /**
     * @return the SUPL_COMP_NAME
     */
    public String getSUPL_COMP_NAME() {
        return SUPL_COMP_NAME;
    }

    /**
     * @param SUPL_COMP_NAME the SUPL_COMP_NAME to set
     */
    public void setSUPL_COMP_NAME(String SUPL_COMP_NAME) {
        this.SUPL_COMP_NAME = SUPL_COMP_NAME;
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
     * @return the SUPL_ZIPCODE
     */
    public String getSUPL_ZIPCODE() {
        return SUPL_ZIPCODE;
    }

    /**
     * @param SUPL_ZIPCODE the SUPL_ZIPCODE to set
     */
    public void setSUPL_ZIPCODE(String SUPL_ZIPCODE) {
        this.SUPL_ZIPCODE = SUPL_ZIPCODE;
    }

    /**
     * @return the SUPL_MAINDEALER_ID
     */
    public String getSUPL_MAINDEALER_ID() {
        return SUPL_MAINDEALER_ID;
    }

    /**
     * @param SUPL_MAINDEALER_ID the SUPL_MAINDEALER_ID to set
     */
    public void setSUPL_MAINDEALER_ID(String SUPL_MAINDEALER_ID) {
        this.SUPL_MAINDEALER_ID = SUPL_MAINDEALER_ID;
    }

    /**
     * @return the STORE_TYPE
     */
    public String getSTORE_TYPE() {
        return STORE_TYPE;
    }

    /**
     * @param STORE_TYPE the STORE_TYPE to set
     */
    public void setSTORE_TYPE(String STORE_TYPE) {
        this.STORE_TYPE = STORE_TYPE;
    }
    
}
