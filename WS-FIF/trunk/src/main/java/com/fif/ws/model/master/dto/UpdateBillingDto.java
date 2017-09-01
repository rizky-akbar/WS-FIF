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
public class UpdateBillingDto {
    private String applNo;
    private String billing;
    private String subZipCode;
    private String emer;

    public UpdateBillingDto() {
    }

    public UpdateBillingDto(String applNo, String billing, String subZipCode, String emer) {
        this.applNo = applNo;
        this.billing = billing;
        this.subZipCode = subZipCode;
        this.emer = emer;
    }

    public String getApplNo() {
        return applNo;
    }

    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public String getSubZipCode() {
        return subZipCode;
    }

    public void setSubZipCode(String subZipCode) {
        this.subZipCode = subZipCode;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }
    

}
