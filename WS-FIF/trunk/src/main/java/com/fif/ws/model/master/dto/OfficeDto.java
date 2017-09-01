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
public class OfficeDto {

    private String offIceCode;
    private String officeRep;
    private String nameShort;
    private String NameFull;
    private String regionalId;
    private String regionalName;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String location;
    private String phone1;
    private String phone2;
    private String phone3;
    private String picFirstName;
    private String picLastName;
    private String officeCategory;

    public OfficeDto() {
    }

    public OfficeDto(String offIceCode, String officeRep, String nameShort, String NameFull, String regionalId, String regionalName, String address1, String address2, String address3, String city, String location, String phone1, String phone2, String phone3, String picFirstName, String picLastName, String officeCategory) {
        this.offIceCode = offIceCode;
        this.officeRep = officeRep;
        this.nameShort = nameShort;
        this.NameFull = NameFull;
        this.regionalId = regionalId;
        this.regionalName = regionalName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.location = location;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.picFirstName = picFirstName;
        this.picLastName = picLastName;
        this.officeCategory = officeCategory;
    }
    
    

    public String getOffIceCode() {
        return offIceCode;
    }

    public void setOffIceCode(String offIceCode) {
        this.offIceCode = offIceCode;
    }

    public String getOfficeRep() {
        return officeRep;
    }

    public void setOfficeRep(String officeRep) {
        this.officeRep = officeRep;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameFull() {
        return NameFull;
    }

    public void setNameFull(String NameFull) {
        this.NameFull = NameFull;
    }

    public String getRegionalId() {
        return regionalId;
    }

    public void setRegionalId(String regionalId) {
        this.regionalId = regionalId;
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

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getPicFirstName() {
        return picFirstName;
    }

    public void setPicFirstName(String picFirstName) {
        this.picFirstName = picFirstName;
    }

    public String getPicLastName() {
        return picLastName;
    }

    public void setPicLastName(String picLastName) {
        this.picLastName = picLastName;
    }

    public String getOfficeCategory() {
        return officeCategory;
    }

    public void setOfficeCategory(String officeCategory) {
        this.officeCategory = officeCategory;
    }

    public String getRegionalName() {
        return regionalName;
    }

    public void setRegionalName(String regionalName) {
        this.regionalName = regionalName;
    }

       
    
  
}
