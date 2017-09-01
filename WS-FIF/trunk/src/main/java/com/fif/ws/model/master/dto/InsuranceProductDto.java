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
public class InsuranceProductDto {
    private String product_no;
    private String product_desc;
    private Double adm_fee;
    private String start_date;
    private String end_date;
    
    private List<InsuranceBranchDto> branch;

    public InsuranceProductDto() {
    }

    public InsuranceProductDto(String product_no, String product_desc, Double adm_fee, String start_date, String end_date, List<InsuranceBranchDto> branch) {
        this.product_no = product_no;
        this.product_desc = product_desc;
        this.adm_fee = adm_fee;
        this.start_date = start_date;
        this.end_date = end_date;
        this.branch = branch;
    }

    public String getProduct_no() {
        return product_no;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public Double getAdm_fee() {
        return adm_fee;
    }

    public void setAdm_fee(Double adm_fee) {
        this.adm_fee = adm_fee;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public List<InsuranceBranchDto> getBranch() {
        return branch;
    }

    public void setBranch(List<InsuranceBranchDto> branch) {
        this.branch = branch;
    }
    
    
    
    
}
