/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.model.dto.order;

import java.util.List;

/**
 *
 * @author RizkyAkbar
 */
public class OrderFullHeaderDto {

    private String officeCode;
    private String serviceOfficeCode;
    private String applicationDate;
    private String customerNo;
    private String platform;
    private String businessUnit;
    private String programCode;
    private String supplierCode;
    private String sourceOrderCode;
    private String totalProductPrice;
    private String totalDp;
    private String totalObject;
    private String branchAR;
    private String branchDest;
    private String applNo;

    private List<OrderFullObjectPembiayaan> objectPembiayaan;
    private OrderFullMarketingSchemeContract marketingSchemeContract;
    private List<OrderFullDocuments> documents;
    private OrderFullPromotions promotions;
    private OrderFullStrukturKredit strukturKredit;

    public OrderFullHeaderDto() {
    }

    public OrderFullHeaderDto(String officeCode, String serviceOfficeCode, String applicationDate, String customerNo, String platform, String businessUnit, String programCode, String supplierCode, String sourceOrderCode, String totalProductPrice, String totalDp, String totalObject, String branchAR, String branchDest, String applNo, List<OrderFullObjectPembiayaan> objectPembiayaan, OrderFullMarketingSchemeContract marketingSchemeContract, List<OrderFullDocuments> documents, OrderFullPromotions promotions, OrderFullStrukturKredit strukturKredit) {
        this.officeCode = officeCode;
        this.serviceOfficeCode = serviceOfficeCode;
        this.applicationDate = applicationDate;
        this.customerNo = customerNo;
        this.platform = platform;
        this.businessUnit = businessUnit;
        this.programCode = programCode;
        this.supplierCode = supplierCode;
        this.sourceOrderCode = sourceOrderCode;
        this.totalProductPrice = totalProductPrice;
        this.totalDp = totalDp;
        this.totalObject = totalObject;
        this.branchAR = branchAR;
        this.branchDest = branchDest;
        this.applNo = applNo;
        this.objectPembiayaan = objectPembiayaan;
        this.marketingSchemeContract = marketingSchemeContract;
        this.documents = documents;
        this.promotions = promotions;
        this.strukturKredit = strukturKredit;
    }


    public String getApplNo() {
        return applNo;
    }

    public List<OrderFullObjectPembiayaan> getObjectPembiayaan() {
        return objectPembiayaan;
    }

    public void setObjectPembiayaan(List<OrderFullObjectPembiayaan> objectPembiayaan) {
        this.objectPembiayaan = objectPembiayaan;
    }

    public List<OrderFullDocuments> getDocuments() {
        return documents;
    }

    public void setDocuments(List<OrderFullDocuments> documents) {
        this.documents = documents;
    }

    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    
       
    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getServiceOfficeCode() {
        return serviceOfficeCode;
    }

    public void setServiceOfficeCode(String serviceOfficeCode) {
        this.serviceOfficeCode = serviceOfficeCode;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSourceOrderCode() {
        return sourceOrderCode;
    }

    public void setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode;
    }

    public String getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(String totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public String getTotalDp() {
        return totalDp;
    }

    public void setTotalDp(String totalDp) {
        this.totalDp = totalDp;
    }

    public String getTotalObject() {
        return totalObject;
    }

    public void setTotalObject(String totalObject) {
        this.totalObject = totalObject;
    }

    public String getBranchAR() {
        return branchAR;
    }

    public void setBranchAR(String branchAR) {
        this.branchAR = branchAR;
    }

    public String getBranchDest() {
        return branchDest;
    }

    public void setBranchDest(String branchDest) {
        this.branchDest = branchDest;
    }


    public OrderFullMarketingSchemeContract getMarketingSchemeContract() {
        return marketingSchemeContract;
    }

    public void setMarketingSchemeContract(OrderFullMarketingSchemeContract marketingSchemeContract) {
        this.marketingSchemeContract = marketingSchemeContract;
    }

    public OrderFullPromotions getPromotions() {
        return promotions;
    }

    public void setPromotions(OrderFullPromotions promotions) {
        this.promotions = promotions;
    }

    public OrderFullStrukturKredit getStrukturKredit() {
        return strukturKredit;
    }

    public void setStrukturKredit(OrderFullStrukturKredit strukturKredit) {
        this.strukturKredit = strukturKredit;
    }

    
}
