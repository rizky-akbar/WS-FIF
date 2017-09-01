/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "INSC_MST_RATE", schema = "INSC")
public class InsuranceObjectModel implements Serializable {
    
    @Id
    private String RATE_NO;
    private Double TOP;
    private Double NET_RATE_PCT;
    private Double BRUTO_RATE_PCT;
    private Double DEPRECIATION_PCT;
    private Double AMOUNT_CEILING;
    @ManyToOne
    @JoinColumn(name="OBJ_GRP")
    private String OBJ_GRP;

    public InsuranceObjectModel() {
    }

    public InsuranceObjectModel(String RATE_NO, Double TOP, Double NET_RATE_PCT, Double BRUTO_RATE_PCT, Double DEPRECIATION_PCT, Double AMOUNT_CEILING, String OBJ_GRP) {
        this.RATE_NO = RATE_NO;
        this.TOP = TOP;
        this.NET_RATE_PCT = NET_RATE_PCT;
        this.BRUTO_RATE_PCT = BRUTO_RATE_PCT;
        this.DEPRECIATION_PCT = DEPRECIATION_PCT;
        this.AMOUNT_CEILING = AMOUNT_CEILING;
        this.OBJ_GRP = OBJ_GRP;
    }

    public String getRATE_NO() {
        return RATE_NO;
    }

    public void setRATE_NO(String RATE_NO) {
        this.RATE_NO = RATE_NO;
    }

    public Double getTOP() {
        return TOP;
    }

    public void setTOP(Double TOP) {
        this.TOP = TOP;
    }

    public Double getNET_RATE_PCT() {
        return NET_RATE_PCT;
    }

    public void setNET_RATE_PCT(Double NET_RATE_PCT) {
        this.NET_RATE_PCT = NET_RATE_PCT;
    }

    public Double getBRUTO_RATE_PCT() {
        return BRUTO_RATE_PCT;
    }

    public void setBRUTO_RATE_PCT(Double BRUTO_RATE_PCT) {
        this.BRUTO_RATE_PCT = BRUTO_RATE_PCT;
    }

    public Double getDEPRECIATION_PCT() {
        return DEPRECIATION_PCT;
    }

    public void setDEPRECIATION_PCT(Double DEPRECIATION_PCT) {
        this.DEPRECIATION_PCT = DEPRECIATION_PCT;
    }

    public Double getAMOUNT_CEILING() {
        return AMOUNT_CEILING;
    }

    public void setAMOUNT_CEILING(Double AMOUNT_CEILING) {
        this.AMOUNT_CEILING = AMOUNT_CEILING;
    }

    public String getOBJ_GRP() {
        return OBJ_GRP;
    }

    public void setOBJ_GRP(String OBJ_GRP) {
        this.OBJ_GRP = OBJ_GRP;
    }
    
    
    
}
