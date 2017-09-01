/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master.dto;

import java.util.List;

/**
 *
 * @author RizkyAkbar
 */
public class PromoDto {
    
    private String promoCode;
    private String promoDescription;
    private String businessUnit;
    private List<PromoDetailDto> promoDetail;

    public PromoDto() {
    }

    public PromoDto(String promoCode, String promoDescription, String businessUnit, List<PromoDetailDto> promoDetail) {
        this.promoCode = promoCode;
        this.promoDescription = promoDescription;
        this.businessUnit = businessUnit;
        this.promoDetail = promoDetail;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
    
    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public List<PromoDetailDto> getPromoDetail() {
        return promoDetail;
    }

    public void setPromoDetail(List<PromoDetailDto> promoDetail) {
        this.promoDetail = promoDetail;
    }
    
    
}
