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
public class ObjectCodesDto {

    private String objectCode;
    private String objectGroup;
    private String objectDescription;
    private String objectBrand;
    private String objectModel;
    private String objectType;
    private String objectSize;
    private String objectMake;
    private String branchId;

    public ObjectCodesDto() {
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public String getObjectGroup() {
        return objectGroup;
    }

    public void setObjectGroup(String objectGroup) {
        this.objectGroup = objectGroup;
    }

    public String getObjectDescription() {
        return objectDescription;
    }

    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    public String getObjectBrand() {
        return objectBrand;
    }

    public void setObjectBrand(String objectBrand) {
        this.objectBrand = objectBrand;
    }

    public String getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(String objectModel) {
        this.objectModel = objectModel;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(String objectSize) {
        this.objectSize = objectSize;
    }

    public String getObjectMake() {
        return objectMake;
    }

    public void setObjectMake(String objectMake) {
        this.objectMake = objectMake;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getNeedAddCollateral() {
        return needAddCollateral;
    }

    public void setNeedAddCollateral(String needAddCollateral) {
        this.needAddCollateral = needAddCollateral;
    }

    public String getNewUsed() {
        return newUsed;
    }

    public void setNewUsed(String newUsed) {
        this.newUsed = newUsed;
    }

    public String getIsVehicle() {
        return isVehicle;
    }

    public void setIsVehicle(String isVehicle) {
        this.isVehicle = isVehicle;
    }

    public String getCodeAhm() {
        return codeAhm;
    }

    public void setCodeAhm(String codeAhm) {
        this.codeAhm = codeAhm;
    }
    private String categoryId;
    private String needAddCollateral;
    private String newUsed;
    private String isVehicle;
    private String codeAhm;

    public ObjectCodesDto(String objectCode, String objectGroup, String objectDescription, String objectBrand, String objectModel, String objectType, String objectSize, String objectMake, String branchId, String categoryId, String needAddCollateral, String newUsed, String isVehicle, String codeAhm) {
        this.objectCode = objectCode;
        this.objectGroup = objectGroup;
        this.objectDescription = objectDescription;
        this.objectBrand = objectBrand;
        this.objectModel = objectModel;
        this.objectType = objectType;
        this.objectSize = objectSize;
        this.objectMake = objectMake;
        this.branchId = branchId;
        this.categoryId = categoryId;
        this.needAddCollateral = needAddCollateral;
        this.newUsed = newUsed;
        this.isVehicle = isVehicle;
        this.codeAhm = codeAhm;
    }

}
