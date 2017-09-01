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
public class CustomerIdAddressDto {
    private String idAddress;
    private String idRT;
    private String idRW;
    private String idKelurahan;
    private String idKecamatan;
    private String idCity;
    private String idProvinsi;
    private String idZip;

    public CustomerIdAddressDto() {
    }

    public CustomerIdAddressDto(String idAddress, String idRT, String idRW, String idKelurahan, String idKecamatan, String idCity, String idProvinsi, String idZip) {
        this.idAddress = idAddress;
        this.idRT = idRT;
        this.idRW = idRW;
        this.idKelurahan = idKelurahan;
        this.idKecamatan = idKecamatan;
        this.idCity = idCity;
        this.idProvinsi = idProvinsi;
        this.idZip = idZip;
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public String getIdRT() {
        return idRT;
    }

    public void setIdRT(String idRT) {
        this.idRT = idRT;
    }

    public String getIdRW() {
        return idRW;
    }

    public void setIdRW(String idRW) {
        this.idRW = idRW;
    }

    public String getIdKelurahan() {
        return idKelurahan;
    }

    public void setIdKelurahan(String idKelurahan) {
        this.idKelurahan = idKelurahan;
    }

    public String getIdKecamatan() {
        return idKecamatan;
    }

    public void setIdKecamatan(String idKecamatan) {
        this.idKecamatan = idKecamatan;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdProvinsi() {
        return idProvinsi;
    }

    public void setIdProvinsi(String idProvinsi) {
        this.idProvinsi = idProvinsi;
    }

    public String getIdZip() {
        return idZip;
    }

    public void setIdZip(String idZip) {
        this.idZip = idZip;
    }
    
    

}
