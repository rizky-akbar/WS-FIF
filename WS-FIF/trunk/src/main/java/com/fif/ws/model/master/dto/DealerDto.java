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
public class DealerDto {

    private String dealerCode;
    private String dealerName;
    private String address1;
    private String address2;
    private String city;
    private String provinsi;
    private String zipcode;
    private String supplierStatus;
    private String supplierType;
    private String supplierSubType;
    private String supplierGroupId;
    private String supplierOutletType;
    private String supplierCompanyType;
    private String supplierCompanyName;
    private String supplierMainDealer;

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

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getSupplierSubType() {
        return supplierSubType;
    }

    public void setSupplierSubType(String supplierSubType) {
        this.supplierSubType = supplierSubType;
    }

    public String getSupplierGroupId() {
        return supplierGroupId;
    }

    public void setSupplierGroupId(String supplierGroupId) {
        this.supplierGroupId = supplierGroupId;
    }

    public String getSupplierOutletType() {
        return supplierOutletType;
    }

    public void setSupplierOutletType(String supplierOutletType) {
        this.supplierOutletType = supplierOutletType;
    }

    public String getSupplierCompanyType() {
        return supplierCompanyType;
    }

    public void setSupplierCompanyType(String supplierCompanyType) {
        this.supplierCompanyType = supplierCompanyType;
    }

    public String getSupplierCompanyName() {
        return supplierCompanyName;
    }

    public void setSupplierCompanyName(String supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
    }

    public String getSupplierMainDealer() {
        return supplierMainDealer;
    }

    public void setSupplierMainDealer(String supplierMainDealer) {
        this.supplierMainDealer = supplierMainDealer;
    }

    public DealerDto(String dealerCode, String dealerName, String address1, String address2, String city, String provinsi, String zipcode, String supplierStatus, String supplierType, String supplierSubType, String supplierGroupId, String supplierOutletType, String supplierCompanyType, String supplierCompanyName, String supplierMainDealer) {
        this.dealerCode = dealerCode;
        this.dealerName = dealerName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.provinsi = provinsi;
        this.zipcode = zipcode;
        this.supplierStatus = supplierStatus;
        this.supplierType = supplierType;
        this.supplierSubType = supplierSubType;
        this.supplierGroupId = supplierGroupId;
        this.supplierOutletType = supplierOutletType;
        this.supplierCompanyType = supplierCompanyType;
        this.supplierCompanyName = supplierCompanyName;
        this.supplierMainDealer = supplierMainDealer;
    }

    public DealerDto() {
    }

}
