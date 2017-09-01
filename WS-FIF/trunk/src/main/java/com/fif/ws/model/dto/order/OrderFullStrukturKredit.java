/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.model.dto.order;

/**
 *
 * @author RizkyAkbar
 */
public class OrderFullStrukturKredit {

    private String interestType;
    private String tenor;
    private String periode;
    private String periodeType;
    private String advArrear;
    private String admin;
    private String choiceInstallmentRate;
    private String percentResidu;
    private String percentFlat;
    private String top;
    private String amountResidu  ;

    public OrderFullStrukturKredit() {
    }

    public OrderFullStrukturKredit(String interestType, String tenor, String periode, String periodeType, String advArrear, String admin, String choiceInstallmentRate, String percentResidu, String percentFlat, String top, String amountResidu) {
        this.interestType = interestType;
        this.tenor = tenor;
        this.periode = periode;
        this.periodeType = periodeType;
        this.advArrear = advArrear;
        this.admin = admin;
        this.choiceInstallmentRate = choiceInstallmentRate;
        this.percentResidu = percentResidu;
        this.percentFlat = percentFlat;
        this.top = top;
        this.amountResidu = amountResidu;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getPeriodeType() {
        return periodeType;
    }

    public void setPeriodeType(String periodeType) {
        this.periodeType = periodeType;
    }

    public String getAdvArrear() {
        return advArrear;
    }

    public void setAdvArrear(String advArrear) {
        this.advArrear = advArrear;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getChoiceInstallmentRate() {
        return choiceInstallmentRate;
    }

    public void setChoiceInstallmentRate(String choiceInstallmentRate) {
        this.choiceInstallmentRate = choiceInstallmentRate;
    }

    public String getPercentResidu() {
        return percentResidu;
    }

    public void setPercentResidu(String percentResidu) {
        this.percentResidu = percentResidu;
    }

    public String getPercentFlat() {
        return percentFlat;
    }

    public void setPercentFlat(String percentFlat) {
        this.percentFlat = percentFlat;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getAmountResidu() {
        return amountResidu;
    }

    public void setAmountResidu(String amountResidu) {
        this.amountResidu = amountResidu;
    }

}
