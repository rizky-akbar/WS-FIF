/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "FS_MST_REGIONALS")
public class RegionalModel {
    @Id
    private String REGIONAL_ID;
    private String NAME_SHORT;
    private String NAME_FULL;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_TIMESTAMP;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date LASTUPDATE_TIMESTAMP;
    
    @OneToMany(mappedBy="REGIONAL_ID", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OfficesModel> offices =  new ArrayList<OfficesModel>();

    public RegionalModel() {
    }

    public RegionalModel(String REGIONAL_ID, String NAME_SHORT, String NAME_FULL) {
        this.REGIONAL_ID = REGIONAL_ID;
        this.NAME_SHORT = NAME_SHORT;
        this.NAME_FULL = NAME_FULL;
    }

    public Date getCREATED_TIMESTAMP() {
        return CREATED_TIMESTAMP;
    }

    public void setCREATED_TIMESTAMP(Date CREATED_TIMESTAMP) {
        this.CREATED_TIMESTAMP = CREATED_TIMESTAMP;
    }

    public Date getLASTUPDATE_TIMESTAMP() {
        return LASTUPDATE_TIMESTAMP;
    }

    public void setLASTUPDATE_TIMESTAMP(Date LASTUPDATE_TIMESTAMP) {
        this.LASTUPDATE_TIMESTAMP = LASTUPDATE_TIMESTAMP;
    }

    public List<OfficesModel> getOffices() {
        return offices;
    }

    public void setOffices(List<OfficesModel> offices) {
        this.offices = offices;
    }

    public String getREGIONAL_ID() {
        return REGIONAL_ID;
    }

    public void setREGIONAL_ID(String REGIONAL_ID) {
        this.REGIONAL_ID = REGIONAL_ID;
    }

    public String getNAME_SHORT() {
        return NAME_SHORT;
    }

    public void setNAME_SHORT(String NAME_SHORT) {
        this.NAME_SHORT = NAME_SHORT;
    }

    public String getNAME_FULL() {
        return NAME_FULL;
    }

    public void setNAME_FULL(String NAME_FULL) {
        this.NAME_FULL = NAME_FULL;
    }
    
    
}
