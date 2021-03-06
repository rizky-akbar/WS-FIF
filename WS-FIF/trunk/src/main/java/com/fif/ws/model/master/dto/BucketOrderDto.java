/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.model.master.dto;

/**
 *
 * @author RizkyAkbar
 */
public class BucketOrderDto {

    private String transactionId;
    private String orderDate;
    private String salesId;
    private String dealerId;
    private String dealerIdFif;
    private String branchId;
    private String customerName;
    private String birthPlace;
    private String birthdate;
    private String sex;
    private String businessUnit;
    private double dpAmount;
    private int top;
    private String objectType;
    private String objectTypeFif;
    private String address;
    private String zip;
    private String subZip;
    private String provinsiCode;
    private String provinsi;
    private String cityCode;
    private String city;
    private String kecamatanCode;
    private String kecamatan;
    private String kelurahanCode;
    private String kelurahan;
    private String customerPhoneArea;
    private String customerPhone;
    private String customerOfficePhoneArea;
    private String customerOfficePhone;
    private String customerMobilePhone1;
    private String customerMobilePhone2;
    private String houseStatus;
    private String sourceInput;
    private String actOccpt;
    private String education;
    private String maritalStatus;
    private String comments;
    private String virtualAccount;
    private String RT;
    private String RW;
    private double totProdPrice;

    
    

    public BucketOrderDto() {
    }

    public BucketOrderDto(String transactionId, String orderDate, String salesId, String dealerId, String dealerIdFif, String branchId, String customerName, String birthPlace, String birthdate, String sex, String businessUnit, double dpAmount, int top, String objectType, String objectTypeFif, String address, String zip, String subZip, String provinsiCode, String provinsi, String cityCode, String city, String kecamatanCode, String kecamatan, String kelurahanCode, String kelurahan, String customerPhoneArea, String customerPhone, String customerOfficePhoneArea, String customerOfficePhone, String customerMobilePhone1, String customerMobilePhone2, String houseStatus, String sourceInput, String actOccpt, String education, String maritalStatus, String comments, String virtualAccount, String RT, String RW, double totProdPrice) {
        this.transactionId = transactionId;
        this.orderDate = orderDate;
        this.salesId = salesId;
        this.dealerId = dealerId;
        this.dealerIdFif = dealerIdFif;
        this.branchId = branchId;
        this.customerName = customerName;
        this.birthPlace = birthPlace;
        this.birthdate = birthdate;
        this.sex = sex;
        this.businessUnit = businessUnit;
        this.dpAmount = dpAmount;
        this.top = top;
        this.objectType = objectType;
        this.objectTypeFif = objectTypeFif;
        this.address = address;
        this.zip = zip;
        this.subZip = subZip;
        this.provinsiCode = provinsiCode;
        this.provinsi = provinsi;
        this.cityCode = cityCode;
        this.city = city;
        this.kecamatanCode = kecamatanCode;
        this.kecamatan = kecamatan;
        this.kelurahanCode = kelurahanCode;
        this.kelurahan = kelurahan;
        this.customerPhoneArea = customerPhoneArea;
        this.customerPhone = customerPhone;
        this.customerOfficePhoneArea = customerOfficePhoneArea;
        this.customerOfficePhone = customerOfficePhone;
        this.customerMobilePhone1 = customerMobilePhone1;
        this.customerMobilePhone2 = customerMobilePhone2;
        this.houseStatus = houseStatus;
        this.sourceInput = sourceInput;
        this.actOccpt = actOccpt;
        this.education = education;
        this.maritalStatus = maritalStatus;
        this.comments = comments;
        this.virtualAccount = virtualAccount;
        this.RT = RT;
        this.RW = RW;
        this.totProdPrice = totProdPrice;
        
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getActOccpt() {
        return actOccpt;
    }

    public void setActOccpt(String actOccpt) {
        this.actOccpt = actOccpt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerIdFif() {
        return dealerIdFif;
    }

    public void setDealerIdFif(String dealerIdFif) {
        this.dealerIdFif = dealerIdFif;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getRW() {
        return RW;
    }

    public void setRW(String RW) {
        this.RW = RW;
    }

    public String getKelurahanCode() {
        return kelurahanCode;
    }

    public void setKelurahanCode(String kelurahanCode) {
        this.kelurahanCode = kelurahanCode;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatanCode() {
        return kecamatanCode;
    }

    public void setKecamatanCode(String kecamatanCode) {
        this.kecamatanCode = kecamatanCode;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinsiCode() {
        return provinsiCode;
    }

    public void setProvinsiCode(String provinsiCode) {
        this.provinsiCode = provinsiCode;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSubZip() {
        return subZip;
    }

    public void setSubZip(String subZip) {
        this.subZip = subZip;
    }

    public String getCustomerPhoneArea() {
        return customerPhoneArea;
    }

    public void setCustomerPhoneArea(String customerPhoneArea) {
        this.customerPhoneArea = customerPhoneArea;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerOfficePhoneArea() {
        return customerOfficePhoneArea;
    }

    public void setCustomerOfficePhoneArea(String customerOfficePhoneArea) {
        this.customerOfficePhoneArea = customerOfficePhoneArea;
    }

    public String getCustomerOfficePhone() {
        return customerOfficePhone;
    }

    public void setCustomerOfficePhone(String customerOfficePhone) {
        this.customerOfficePhone = customerOfficePhone;
    }

    public String getCustomerMobilePhone1() {
        return customerMobilePhone1;
    }

    public void setCustomerMobilePhone1(String customerMobilePhone1) {
        this.customerMobilePhone1 = customerMobilePhone1;
    }

    public String getCustomerMobilePhone2() {
        return customerMobilePhone2;
    }

    public void setCustomerMobilePhone2(String customerMobilePhone2) {
        this.customerMobilePhone2 = customerMobilePhone2;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectTypeFif() {
        return objectTypeFif;
    }

    public void setObjectTypeFif(String objectTypeFif) {
        this.objectTypeFif = objectTypeFif;
    }

     public String getSourceInput() {
        return sourceInput;
    }

    public void setSourceInput(String sourceInput) {
        this.sourceInput = sourceInput;
    }

    public double getDpAmount() {
        return dpAmount;
    }

    public void setDpAmount(double dpAmount) {
        this.dpAmount = dpAmount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   
    public double getTotProdPrice() {
        return totProdPrice;
    }

    public void setTotProdPrice(double totProdPrice) {
        this.totProdPrice = totProdPrice;
    }

}
