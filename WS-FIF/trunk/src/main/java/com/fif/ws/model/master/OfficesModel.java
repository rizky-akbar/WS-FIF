/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

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
@Table(name = "FS_MST_OFFICES")
public class OfficesModel{ 
    @Id
    private String OFFICE_CODE;
    private String OFFICE_CODE_REP;
    private String NAME_SHORT;
    private String NAME_FULL;
    @ManyToOne
    @JoinColumn(name="REGIONAL_ID")
    private RegionalModel REGIONAL_ID;
    private String ADDRESS1;
    private String ADDRESS2;
    private String ADDRESS3;
    private String CITY;
    private String LOCATION;
    private String PHONE1;
    private String PHONE2;
    private String PHONE3;
    private String PIC_FIRST_NAME;
    private String PIC_LAST_NAME;
    private String OFFICE_CATEGORY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_TIMESTAMP;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date LASTUPDATE_TIMESTAMP ;
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
     * @return the OFFICE_CODE_REP
     */
    public String getOFFICE_CODE_REP() {
        return OFFICE_CODE_REP;
    }

    /**
     * @param OFFICE_CODE_REP the OFFICE_CODE_REP to set
     */
    public void setOFFICE_CODE_REP(String OFFICE_CODE_REP) {
        this.OFFICE_CODE_REP = OFFICE_CODE_REP;
    }

    /**
     * @return the NAME_SHORT
     */
    public String getNAME_SHORT() {
        return NAME_SHORT;
    }

    /**
     * @param NAME_SHORT the NAME_SHORT to set
     */
    public void setNAME_SHORT(String NAME_SHORT) {
        this.NAME_SHORT = NAME_SHORT;
    }

    /**
     * @return the NAME_FULL
     */
    public String getNAME_FULL() {
        return NAME_FULL;
    }

    /**
     * @param NAME_FULL the NAME_FULL to set
     */
    public void setNAME_FULL(String NAME_FULL) {
        this.NAME_FULL = NAME_FULL;
    }

    public RegionalModel getREGIONAL_ID() {
        return REGIONAL_ID;
    }

    public void setREGIONAL_ID(RegionalModel REGIONAL_ID) {
        this.REGIONAL_ID = REGIONAL_ID;
    }
    /**
     * @return the ADDRESS1
     */
    public String getADDRESS1() {
        return ADDRESS1;
    }

    /**
     * @param ADDRESS1 the ADDRESS1 to set
     */
    public void setADDRESS1(String ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }

    /**
     * @return the ADDRESS2
     */
    public String getADDRESS2() {
        return ADDRESS2;
    }

    /**
     * @param ADDRESS2 the ADDRESS2 to set
     */
    public void setADDRESS2(String ADDRESS2) {
        this.ADDRESS2 = ADDRESS2;
    }

    /**
     * @return the ADDRESS3
     */
    public String getADDRESS3() {
        return ADDRESS3;
    }

    /**
     * @param ADDRESS3 the ADDRESS3 to set
     */
    public void setADDRESS3(String ADDRESS3) {
        this.ADDRESS3 = ADDRESS3;
    }

    /**
     * @return the CITY_LOCATION
     */
   

    /**
     * @param CITY_LOCATION the CITY_LOCATION to set
     */
    

    /**
     * @return the PHONE1
     */
    public String getPHONE1() {
        return PHONE1;
    }

    /**
     * @param PHONE1 the PHONE1 to set
     */
    public void setPHONE1(String PHONE1) {
        this.PHONE1 = PHONE1;
    }

    /**
     * @return the PHONE2
     */
    public String getPHONE2() {
        return PHONE2;
    }

    /**
     * @param PHONE2 the PHONE2 to set
     */
    public void setPHONE2(String PHONE2) {
        this.PHONE2 = PHONE2;
    }

    /**
     * @return the PHONE3
     */
    public String getPHONE3() {
        return PHONE3;
    }

    /**
     * @param PHONE3 the PHONE3 to set
     */
    public void setPHONE3(String PHONE3) {
        this.PHONE3 = PHONE3;
    }

    /**
     * @return the PIC_FIRST_NAME
     */
    public String getPIC_FIRST_NAME() {
        return PIC_FIRST_NAME;
    }

    /**
     * @param PIC_FIRST_NAME the PIC_FIRST_NAME to set
     */
    public void setPIC_FIRST_NAME(String PIC_FIRST_NAME) {
        this.PIC_FIRST_NAME = PIC_FIRST_NAME;
    }

    /**
     * @return the PIC_LAST_NAME
     */
    public String getPIC_LAST_NAME() {
        return PIC_LAST_NAME;
    }

    /**
     * @param PIC_LAST_NAME the PIC_LAST_NAME to set
     */
    public void setPIC_LAST_NAME(String PIC_LAST_NAME) {
        this.PIC_LAST_NAME = PIC_LAST_NAME;
    }

    /**
     * @return the OFFICE_CATEGORY
     */
    public String getOFFICE_CATEGORY() {
        return OFFICE_CATEGORY;
    }

    /**
     * @param OFFICE_CATEGORY the OFFICE_CATEGORY to set
     */
    public void setOFFICE_CATEGORY(String OFFICE_CATEGORY) {
        this.OFFICE_CATEGORY = OFFICE_CATEGORY;
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
     * @return the LOCATION
     */
    public String getLOCATION() {
        return LOCATION;
    }

    /**
     * @param LOCATION the LOCATION to set
     */
    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
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
}
