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
@Table(name = "OM_BUCKET_ORDER_FIF")
public class BucketOrderFif {

    @Id
    private Long ORDER_ID;
    private String TRANSACTIONID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ORDER_DATE;
    private String SALES_ID;
    private String DEALER_ID;
    private String DEALER_ID_FIF;
    private String BRANCH_ID;
    private String CUST_NAME;
    private String BIRTH_PLACE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date BIRTH_DATE;
    private String SEX;
    private String BUSS_UNIT;
    private Double DP_AMT;
    private int TOP;
    private String OBJECT_TYPE;
    private String OBJECT_TYPE_FIF;
    private String CUST_ADDRESS;
    private String CUST_ZIP;
    private String CUST_SUB_ZIP;
    private String CUST_PROV_CODE;
    private String CUST_PROV;
    private String CUST_CITY_CODE;
    private String CUST_CITY;
    private String CUST_KEC_CODE;
    private String CUST_KEC;
    private String CUST_KEL_CODE;
    private String CUST_KEL;
    private String CUST_PHONE_AREA;
    private String CUST_PHONE;
    private String CUST_OFFPH_AREA;
    private String CUST_OFFICE_PHONE;
    private String CUST_MOBPHONE1;
    private String CUST_MOBPHONE2;
    private String STATUS_RUMAH;
    private String SOURCE_INPUT;
    private String ACTUAL_OCPT;
    private String PENDIDIKAN;
    private String STATUS_PERNIKAHAN;
    private String COMMENTS;
    private String VIRTUALACCOUNT;
    private String CUST_RT;
    private String CUST_RW;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_DATE;
    private String CREATED_BY;
    private String STATUS_ORDER;
    private String SERV_OFF_CODE;

    public BucketOrderFif() {
    
    }

    public BucketOrderFif(Long ORDER_ID, String TRANSACTIONID, Date ORDER_DATE, String SALES_ID, String DEALER_ID, String DEALER_ID_FIF, String BRANCH_ID, String CUST_NAME, String BIRTH_PLACE, Date BIRTH_DATE, String SEX, String BUSS_UNIT, Double DP_AMT, int TOP, String OBJECT_TYPE, String OBJECT_TYPE_FIF, String CUST_ADDRESS, String CUST_ZIP, String CUST_SUB_ZIP, String CUST_PROV_CODE, String CUST_PROV, String CUST_CITY_CODE, String CUST_CITY, String CUST_KEC_CODE, String CUST_KEC, String CUST_KEL_CODE, String CUST_KEL, String CUST_PHONE_AREA, String CUST_PHONE, String CUST_OFFPH_AREA, String CUST_OFFICE_PHONE, String CUST_MOBPHONE1, String CUST_MOBPHONE2, String STATUS_RUMAH, String SOURCE_INPUT, String ACTUAL_OCPT, String PENDIDIKAN, String STATUS_PERNIKAHAN, String COMMENTS, String VIRTUALACCOUNT, String CUST_RT, String CUST_RW, Date CREATED_DATE, String CREATED_BY, String STATUS_ORDER, String SERV_OFF_CODE) {
        this.ORDER_ID = ORDER_ID;
        this.TRANSACTIONID = TRANSACTIONID;
        this.ORDER_DATE = ORDER_DATE;
        this.SALES_ID = SALES_ID;
        this.DEALER_ID = DEALER_ID;
        this.DEALER_ID_FIF = DEALER_ID_FIF;
        this.BRANCH_ID = BRANCH_ID;
        this.CUST_NAME = CUST_NAME;
        this.BIRTH_PLACE = BIRTH_PLACE;
        this.BIRTH_DATE = BIRTH_DATE;
        this.SEX = SEX;
        this.BUSS_UNIT = BUSS_UNIT;
        this.DP_AMT = DP_AMT;
        this.TOP = TOP;
        this.OBJECT_TYPE = OBJECT_TYPE;
        this.OBJECT_TYPE_FIF = OBJECT_TYPE_FIF;
        this.CUST_ADDRESS = CUST_ADDRESS;
        this.CUST_ZIP = CUST_ZIP;
        this.CUST_SUB_ZIP = CUST_SUB_ZIP;
        this.CUST_PROV_CODE = CUST_PROV_CODE;
        this.CUST_PROV = CUST_PROV;
        this.CUST_CITY_CODE = CUST_CITY_CODE;
        this.CUST_CITY = CUST_CITY;
        this.CUST_KEC_CODE = CUST_KEC_CODE;
        this.CUST_KEC = CUST_KEC;
        this.CUST_KEL_CODE = CUST_KEL_CODE;
        this.CUST_KEL = CUST_KEL;
        this.CUST_PHONE_AREA = CUST_PHONE_AREA;
        this.CUST_PHONE = CUST_PHONE;
        this.CUST_OFFPH_AREA = CUST_OFFPH_AREA;
        this.CUST_OFFICE_PHONE = CUST_OFFICE_PHONE;
        this.CUST_MOBPHONE1 = CUST_MOBPHONE1;
        this.CUST_MOBPHONE2 = CUST_MOBPHONE2;
        this.STATUS_RUMAH = STATUS_RUMAH;
        this.SOURCE_INPUT = SOURCE_INPUT;
        this.ACTUAL_OCPT = ACTUAL_OCPT;
        this.PENDIDIKAN = PENDIDIKAN;
        this.STATUS_PERNIKAHAN = STATUS_PERNIKAHAN;
        this.COMMENTS = COMMENTS;
        this.VIRTUALACCOUNT = VIRTUALACCOUNT;
        this.CUST_RT = CUST_RT;
        this.CUST_RW = CUST_RW;
        this.CREATED_DATE = CREATED_DATE;
        this.CREATED_BY = CREATED_BY;
        this.STATUS_ORDER = STATUS_ORDER;
        this.SERV_OFF_CODE = SERV_OFF_CODE;
    }

    
    public String getSERV_OFF_CODE() {
        return SERV_OFF_CODE;
    }

    public void setSERV_OFF_CODE(String SERV_OFF_CODE) {
        this.SERV_OFF_CODE = SERV_OFF_CODE;
    }

    public String getSTATUS_ORDER() {
        return STATUS_ORDER;
    }

    public void setSTATUS_ORDER(String STATUS_ORDER) {
        this.STATUS_ORDER = STATUS_ORDER;
    }
    
    public Date getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(Date CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }
    
    public Long getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(Long ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public String getTRANSACTIONID() {
        return TRANSACTIONID;
    }

    public void setTRANSACTIONID(String TRANSACTIONID) {
        this.TRANSACTIONID = TRANSACTIONID;
    }

    public Date getORDER_DATE() {
        return ORDER_DATE;
    }

    public void setORDER_DATE(Date ORDER_DATE) {
        this.ORDER_DATE = ORDER_DATE;
    }

    public String getSALES_ID() {
        return SALES_ID;
    }

    public void setSALES_ID(String SALES_ID) {
        this.SALES_ID = SALES_ID;
    }

    public String getDEALER_ID() {
        return DEALER_ID;
    }

    public void setDEALER_ID(String DEALER_ID) {
        this.DEALER_ID = DEALER_ID;
    }

    public String getDEALER_ID_FIF() {
        return DEALER_ID_FIF;
    }

    public void setDEALER_ID_FIF(String DEALER_ID_FIF) {
        this.DEALER_ID_FIF = DEALER_ID_FIF;
    }

    public String getBRANCH_ID() {
        return BRANCH_ID;
    }

    public void setBRANCH_ID(String BRANCH_ID) {
        this.BRANCH_ID = BRANCH_ID;
    }

    public String getCUST_NAME() {
        return CUST_NAME;
    }

    public void setCUST_NAME(String CUST_NAME) {
        this.CUST_NAME = CUST_NAME;
    }

    public String getBIRTH_PLACE() {
        return BIRTH_PLACE;
    }

    public void setBIRTH_PLACE(String BIRTH_PLACE) {
        this.BIRTH_PLACE = BIRTH_PLACE;
    }

    public Date getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public void setBIRTH_DATE(Date BIRTH_DATE) {
        this.BIRTH_DATE = BIRTH_DATE;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getBUSS_UNIT() {
        return BUSS_UNIT;
    }

    public void setBUSS_UNIT(String BUSS_UNIT) {
        this.BUSS_UNIT = BUSS_UNIT;
    }

    public Double getDP_AMT() {
        return DP_AMT;
    }

    public void setDP_AMT(Double DP_AMT) {
        this.DP_AMT = DP_AMT;
    }

    public int getTOP() {
        return TOP;
    }

    public void setTOP(int TOP) {
        this.TOP = TOP;
    }

    public String getOBJECT_TYPE() {
        return OBJECT_TYPE;
    }

    public void setOBJECT_TYPE(String OBJECT_TYPE) {
        this.OBJECT_TYPE = OBJECT_TYPE;
    }

    public String getOBJECT_TYPE_FIF() {
        return OBJECT_TYPE_FIF;
    }

    public void setOBJECT_TYPE_FIF(String OBJECT_TYPE_FIF) {
        this.OBJECT_TYPE_FIF = OBJECT_TYPE_FIF;
    }

    public String getCUST_ADDRESS() {
        return CUST_ADDRESS;
    }

    public void setCUST_ADDRESS(String CUST_ADDRESS) {
        this.CUST_ADDRESS = CUST_ADDRESS;
    }

    public String getCUST_ZIP() {
        return CUST_ZIP;
    }

    public void setCUST_ZIP(String CUST_ZIP) {
        this.CUST_ZIP = CUST_ZIP;
    }

    public String getCUST_SUB_ZIP() {
        return CUST_SUB_ZIP;
    }

    public void setCUST_SUB_ZIP(String CUST_SUB_ZIP) {
        this.CUST_SUB_ZIP = CUST_SUB_ZIP;
    }

    public String getCUST_PROV_CODE() {
        return CUST_PROV_CODE;
    }

    public void setCUST_PROV_CODE(String CUST_PROV_CODE) {
        this.CUST_PROV_CODE = CUST_PROV_CODE;
    }

    public String getCUST_PROV() {
        return CUST_PROV;
    }

    public void setCUST_PROV(String CUST_PROV) {
        this.CUST_PROV = CUST_PROV;
    }

    public String getCUST_CITY_CODE() {
        return CUST_CITY_CODE;
    }

    public void setCUST_CITY_CODE(String CUST_CITY_CODE) {
        this.CUST_CITY_CODE = CUST_CITY_CODE;
    }

    public String getCUST_CITY() {
        return CUST_CITY;
    }

    public void setCUST_CITY(String CUST_CITY) {
        this.CUST_CITY = CUST_CITY;
    }

    public String getCUST_KEC_CODE() {
        return CUST_KEC_CODE;
    }

    public void setCUST_KEC_CODE(String CUST_KEC_CODE) {
        this.CUST_KEC_CODE = CUST_KEC_CODE;
    }

    public String getCUST_KEC() {
        return CUST_KEC;
    }

    public void setCUST_KEC(String CUST_KEC) {
        this.CUST_KEC = CUST_KEC;
    }

    public String getCUST_KEL_CODE() {
        return CUST_KEL_CODE;
    }

    public void setCUST_KEL_CODE(String CUST_KEL_CODE) {
        this.CUST_KEL_CODE = CUST_KEL_CODE;
    }

    public String getCUST_KEL() {
        return CUST_KEL;
    }

    public void setCUST_KEL(String CUST_KEL) {
        this.CUST_KEL = CUST_KEL;
    }

    public String getCUST_PHONE_AREA() {
        return CUST_PHONE_AREA;
    }

    public void setCUST_PHONE_AREA(String CUST_PHONE_AREA) {
        this.CUST_PHONE_AREA = CUST_PHONE_AREA;
    }

    public String getCUST_PHONE() {
        return CUST_PHONE;
    }

    public void setCUST_PHONE(String CUST_PHONE) {
        this.CUST_PHONE = CUST_PHONE;
    }

    public String getCUST_OFFPH_AREA() {
        return CUST_OFFPH_AREA;
    }

    public void setCUST_OFFPH_AREA(String CUST_OFFPH_AREA) {
        this.CUST_OFFPH_AREA = CUST_OFFPH_AREA;
    }

    public String getCUST_OFFICE_PHONE() {
        return CUST_OFFICE_PHONE;
    }

    public void setCUST_OFFICE_PHONE(String CUST_OFFICE_PHONE) {
        this.CUST_OFFICE_PHONE = CUST_OFFICE_PHONE;
    }

    public String getCUST_MOBPHONE1() {
        return CUST_MOBPHONE1;
    }

    public void setCUST_MOBPHONE1(String CUST_MOBPHONE1) {
        this.CUST_MOBPHONE1 = CUST_MOBPHONE1;
    }

    public String getCUST_MOBPHONE2() {
        return CUST_MOBPHONE2;
    }

    public void setCUST_MOBPHONE2(String CUST_MOBPHONE2) {
        this.CUST_MOBPHONE2 = CUST_MOBPHONE2;
    }

    public String getSTATUS_RUMAH() {
        return STATUS_RUMAH;
    }

    public void setSTATUS_RUMAH(String STATUS_RUMAH) {
        this.STATUS_RUMAH = STATUS_RUMAH;
    }

    public String getSOURCE_INPUT() {
        return SOURCE_INPUT;
    }

    public void setSOURCE_INPUT(String SOURCE_INPUT) {
        this.SOURCE_INPUT = SOURCE_INPUT;
    }

    public String getACTUAL_OCPT() {
        return ACTUAL_OCPT;
    }

    public void setACTUAL_OCPT(String ACTUAL_OCPT) {
        this.ACTUAL_OCPT = ACTUAL_OCPT;
    }

    public String getPENDIDIKAN() {
        return PENDIDIKAN;
    }

    public void setPENDIDIKAN(String PENDIDIKAN) {
        this.PENDIDIKAN = PENDIDIKAN;
    }

    public String getSTATUS_PERNIKAHAN() {
        return STATUS_PERNIKAHAN;
    }

    public void setSTATUS_PERNIKAHAN(String STATUS_PERNIKAHAN) {
        this.STATUS_PERNIKAHAN = STATUS_PERNIKAHAN;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public String getVIRTUALACCOUNT() {
        return VIRTUALACCOUNT;
    }

    public void setVIRTUALACCOUNT(String VIRTUALACCOUNT) {
        this.VIRTUALACCOUNT = VIRTUALACCOUNT;
    }

    public String getCUST_RT() {
        return CUST_RT;
    }

    public void setCUST_RT(String CUST_RT) {
        this.CUST_RT = CUST_RT;
    }

    public String getCUST_RW() {
        return CUST_RW;
    }

    public void setCUST_RW(String CUST_RW) {
        this.CUST_RW = CUST_RW;
    }
       
}
