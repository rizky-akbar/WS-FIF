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
public class InsuranceBranchDto {
    private String branch_id;
    private String rate_no;
    
    private List<InsuranceObjectDto> objectGroup;

    public InsuranceBranchDto() {
    }

    public InsuranceBranchDto(String branch_id, String rate_no, List<InsuranceObjectDto> objectGroup) {
        this.branch_id = branch_id;
        this.rate_no = rate_no;
        this.objectGroup = objectGroup;
    }

    public String getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    public String getRate_no() {
        return rate_no;
    }

    public void setRate_no(String rate_no) {
        this.rate_no = rate_no;
    }

    public List<InsuranceObjectDto> getObjectGroup() {
        return objectGroup;
    }

    public void setObjectGroup(List<InsuranceObjectDto> objectGroup) {
        this.objectGroup = objectGroup;
    }
 
    
}
