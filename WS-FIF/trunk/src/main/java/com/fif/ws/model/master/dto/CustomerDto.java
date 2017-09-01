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
public class CustomerDto {

    private String customerNo;
    private String customerName;
    private String customerKtpName;
    private String customerTitle;
    private String customerSex;
    private String customerCategory;
    private String birthPlace;
    private String birthDate;
    private String mothersName;
    private String customerTypeId;
    private String customerOccupationType;
    private String customerOccupationCode;
    private String customerOccupationSubCode;
    private String customerEducationType;
    private String customerReligion;
    private String maritalStatus;
    private String houseStatus;
    private String branchId;

    public CustomerDto() {
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerKtpName() {
        return customerKtpName;
    }

    public void setCustomerKtpName(String customerKtpName) {
        this.customerKtpName = customerKtpName;
    }

    public String getCustomerTitle() {
        return customerTitle;
    }

    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerOccupationType() {
        return customerOccupationType;
    }

    public void setCustomerOccupationType(String customerOccupationType) {
        this.customerOccupationType = customerOccupationType;
    }

    public String getCustomerOccupationCode() {
        return customerOccupationCode;
    }

    public void setCustomerOccupationCode(String customerOccupationCode) {
        this.customerOccupationCode = customerOccupationCode;
    }

    public String getCustomerOccupationSubCode() {
        return customerOccupationSubCode;
    }

    public void setCustomerOccupationSubCode(String customerOccupationSubCode) {
        this.customerOccupationSubCode = customerOccupationSubCode;
    }

    public String getCustomerEducationType() {
        return customerEducationType;
    }

    public void setCustomerEducationType(String customerEducationType) {
        this.customerEducationType = customerEducationType;
    }

    public String getCustomerReligion() {
        return customerReligion;
    }

    public void setCustomerReligion(String customerReligion) {
        this.customerReligion = customerReligion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public CustomerDto(String customerNo, String customerName, String customerKtpName, String customerTitle, String customerSex, String customerCategory, String birthPlace, String birthDate, String mothersName, String customerTypeId, String customerOccupationType, String customerOccupationCode, String customerOccupationSubCode, String customerEducationType, String customerReligion, String maritalStatus, String houseStatus, String branchId) {
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.customerKtpName = customerKtpName;
        this.customerTitle = customerTitle;
        this.customerSex = customerSex;
        this.customerCategory = customerCategory;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.mothersName = mothersName;
        this.customerTypeId = customerTypeId;
        this.customerOccupationType = customerOccupationType;
        this.customerOccupationCode = customerOccupationCode;
        this.customerOccupationSubCode = customerOccupationSubCode;
        this.customerEducationType = customerEducationType;
        this.customerReligion = customerReligion;
        this.maritalStatus = maritalStatus;
        this.houseStatus = houseStatus;
        this.branchId = branchId;
    }

}
