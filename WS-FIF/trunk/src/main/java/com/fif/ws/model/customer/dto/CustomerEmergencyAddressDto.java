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
public class CustomerEmergencyAddressDto {
    private String emergencyAddress;
    private String emergencyRT;
    private String emergencyRW;
    private String emergencyKelurahan;
    private String emergencyKecamatan;
    private String emergencyCity;
    private String emergencyProvinsi;
    private String emergencyZip;
    private String emergencyFixPhone;
    private String emergencyMobilePhone;

    public CustomerEmergencyAddressDto() {
    }

    public CustomerEmergencyAddressDto(String emergencyAddress, String emergencyRT, String emergencyRW, String emergencyKelurahan, String emergencyKecamatan, String emergencyCity, String emergencyProvinsi, String emergencyZip, String emergencyFixPhone, String emergencyMobilePhone) {
        this.emergencyAddress = emergencyAddress;
        this.emergencyRT = emergencyRT;
        this.emergencyRW = emergencyRW;
        this.emergencyKelurahan = emergencyKelurahan;
        this.emergencyKecamatan = emergencyKecamatan;
        this.emergencyCity = emergencyCity;
        this.emergencyProvinsi = emergencyProvinsi;
        this.emergencyZip = emergencyZip;
        this.emergencyFixPhone = emergencyFixPhone;
        this.emergencyMobilePhone = emergencyMobilePhone;
    }

    public String getEmergencyAddress() {
        return emergencyAddress;
    }

    public void setEmergencyAddress(String emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }

    public String getEmergencyRT() {
        return emergencyRT;
    }

    public void setEmergencyRT(String emergencyRT) {
        this.emergencyRT = emergencyRT;
    }

    public String getEmergencyRW() {
        return emergencyRW;
    }

    public void setEmergencyRW(String emergencyRW) {
        this.emergencyRW = emergencyRW;
    }

    public String getEmergencyKelurahan() {
        return emergencyKelurahan;
    }

    public void setEmergencyKelurahan(String emergencyKelurahan) {
        this.emergencyKelurahan = emergencyKelurahan;
    }

    public String getEmergencyKecamatan() {
        return emergencyKecamatan;
    }

    public void setEmergencyKecamatan(String emergencyKecamatan) {
        this.emergencyKecamatan = emergencyKecamatan;
    }

    public String getEmergencyCity() {
        return emergencyCity;
    }

    public void setEmergencyCity(String emergencyCity) {
        this.emergencyCity = emergencyCity;
    }

    public String getEmergencyProvinsi() {
        return emergencyProvinsi;
    }

    public void setEmergencyProvinsi(String emergencyProvinsi) {
        this.emergencyProvinsi = emergencyProvinsi;
    }

    public String getEmergencyZip() {
        return emergencyZip;
    }

    public void setEmergencyZip(String emergencyZip) {
        this.emergencyZip = emergencyZip;
    }

    public String getEmergencyFixPhone() {
        return emergencyFixPhone;
    }

    public void setEmergencyFixPhone(String emergencyFixPhone) {
        this.emergencyFixPhone = emergencyFixPhone;
    }

    public String getEmergencyMobilePhone() {
        return emergencyMobilePhone;
    }

    public void setEmergencyMobilePhone(String emergencyMobilePhone) {
        this.emergencyMobilePhone = emergencyMobilePhone;
    }
    
    
    

    
}
