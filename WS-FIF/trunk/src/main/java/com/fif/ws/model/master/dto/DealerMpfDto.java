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
public class DealerMpfDto {
    
    private String dealerCode;
    private String dealerName;
    private String branchId;
    private String address1;
    private String address2;
    private String city;
    private String provinsi;
    private String zipcode;
    private String supplierType;
    private String storeType;

    public DealerMpfDto(String dealerCode, String dealerName, String branchId, String address1, String address2, String city, String provinsi, String zipcode, String supplierType, String storeType) {
        this.dealerCode = dealerCode;
        this.dealerName = dealerName;
        this.branchId = branchId;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.provinsi = provinsi;
        this.zipcode = zipcode;
        this.supplierType = supplierType;
        this.storeType = storeType;
    }

    

    public DealerMpfDto() {
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

      

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
  
}
