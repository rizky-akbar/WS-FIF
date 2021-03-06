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
public class InsuranceObjectDto {
    
    private String obj_grp;
    private Double top;
    private Double net_rate_pct;
    private Double bruto_rate_pct;
    private Double depreciation_pct;
    private Double amount_ceiling;

    public InsuranceObjectDto() {
    }

    public InsuranceObjectDto(String obj_grp, Double top, Double net_rate_pct, Double bruto_rate_pct, Double depreciation_pct, Double amount_ceiling) {
        this.obj_grp = obj_grp;
        this.top = top;
        this.net_rate_pct = net_rate_pct;
        this.bruto_rate_pct = bruto_rate_pct;
        this.depreciation_pct = depreciation_pct;
        this.amount_ceiling = amount_ceiling;
    }

    public String getObj_grp() {
        return obj_grp;
    }

    public void setObj_grp(String obj_grp) {
        this.obj_grp = obj_grp;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getNet_rate_pct() {
        return net_rate_pct;
    }

    public void setNet_rate_pct(Double net_rate_pct) {
        this.net_rate_pct = net_rate_pct;
    }

    public Double getBruto_rate_pct() {
        return bruto_rate_pct;
    }

    public void setBruto_rate_pct(Double bruto_rate_pct) {
        this.bruto_rate_pct = bruto_rate_pct;
    }

    public Double getDepreciation_pct() {
        return depreciation_pct;
    }

    public void setDepreciation_pct(Double depreciation_pct) {
        this.depreciation_pct = depreciation_pct;
    }

    public Double getAmount_ceiling() {
        return amount_ceiling;
    }

    public void setAmount_ceiling(Double amount_ceiling) {
        this.amount_ceiling = amount_ceiling;
    }
    
    
}
