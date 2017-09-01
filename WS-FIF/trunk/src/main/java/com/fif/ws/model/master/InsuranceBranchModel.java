/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "INSC_MST_PRODUCT_BRANCH", schema = "INSC")
public class InsuranceBranchModel implements Serializable {
    @Id
    private String BRANCH_ID;
    private String RATE_NO;
    @ManyToOne
    @JoinColumn(name="PRODUCT_NO")
    private InsuranceProductModel PRODUCT_NO;
    
    @OneToMany(mappedBy="OBJ_GRP", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<InsuranceBranchModel> inscObjects =  new ArrayList<InsuranceBranchModel>();

    public InsuranceBranchModel() {
    }

    public InsuranceBranchModel(String BRANCH_ID, String RATE_NO, InsuranceProductModel PRODUCT_NO) {
        this.BRANCH_ID = BRANCH_ID;
        this.RATE_NO = RATE_NO;
        this.PRODUCT_NO = PRODUCT_NO;
    }
    

    public String getBRANCH_ID() {
        return BRANCH_ID;
    }

    public void setBRANCH_ID(String BRANCH_ID) {
        this.BRANCH_ID = BRANCH_ID;
    }

    public String getRATE_NO() {
        return RATE_NO;
    }

    public void setRATE_NO(String RATE_NO) {
        this.RATE_NO = RATE_NO;
    }

    public InsuranceProductModel getPRODUCT_NO() {
        return PRODUCT_NO;
    }

    public void setPRODUCT_NO(InsuranceProductModel PRODUCT_NO) {
        this.PRODUCT_NO = PRODUCT_NO;
    }

    public List<InsuranceBranchModel> getInscObjects() {
        return inscObjects;
    }

    public void setInscObjects(List<InsuranceBranchModel> inscObjects) {
        this.inscObjects = inscObjects;
    }
    
    
}
