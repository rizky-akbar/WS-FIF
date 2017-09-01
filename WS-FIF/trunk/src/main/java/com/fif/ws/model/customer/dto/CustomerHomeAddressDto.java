/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.customer.dto;

/**
 *
 * @author RizkyAkbar
 */
public class CustomerHomeAddressDto {
    private String custAddress;
    private String custRT;
    private String custRW;
    private String custKelurahan;
    private String custKecamatan;
    private String custCity;
    private String custProvinsi;
    private String custZip;
    private String custFixPhone;
    private String custMobilePhone;

    public CustomerHomeAddressDto() {
    }

    public CustomerHomeAddressDto(String custAddress, String custRT, String custRW, String custKelurahan, String custKecamatan, String custCity, String custProvinsi, String custZip, String custFixPhone, String custMobilePhone) {
        this.custAddress = custAddress;
        this.custRT = custRT;
        this.custRW = custRW;
        this.custKelurahan = custKelurahan;
        this.custKecamatan = custKecamatan;
        this.custCity = custCity;
        this.custProvinsi = custProvinsi;
        this.custZip = custZip;
        this.custFixPhone = custFixPhone;
        this.custMobilePhone = custMobilePhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustRT() {
        return custRT;
    }

    public void setCustRT(String custRT) {
        this.custRT = custRT;
    }

    public String getCustRW() {
        return custRW;
    }

    public void setCustRW(String custRW) {
        this.custRW = custRW;
    }

    public String getCustKelurahan() {
        return custKelurahan;
    }

    public void setCustKelurahan(String custKelurahan) {
        this.custKelurahan = custKelurahan;
    }

    public String getCustKecamatan() {
        return custKecamatan;
    }

    public void setCustKecamatan(String custKecamatan) {
        this.custKecamatan = custKecamatan;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustProvinsi() {
        return custProvinsi;
    }

    public void setCustProvinsi(String custProvinsi) {
        this.custProvinsi = custProvinsi;
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    public String getCustFixPhone() {
        return custFixPhone;
    }

    public void setCustFixPhone(String custFixPhone) {
        this.custFixPhone = custFixPhone;
    }

    public String getCustMobilePhone() {
        return custMobilePhone;
    }

    public void setCustMobilePhone(String custMobilePhone) {
        this.custMobilePhone = custMobilePhone;
    }
    
    

}
