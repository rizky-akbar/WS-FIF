/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

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
@Table(name = "OM_MST_DOCUMENTS")
public class DocumentModel {
    @Id
    private String DOC_CODE;
    private String DESCRIPTION;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "DOC_CODE", fetch = FetchType.EAGER)
    private List<DocumentOccutypeModel> OCPT_TYPE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date UPDATE_DATE;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATE_DATE;

    /**
     * @return the DOC_CODE
     */
    public String getDOC_CODE() {
        return DOC_CODE;
    }

    /**
     * @param DOC_CODE the DOC_CODE to set
     */
    public void setDOC_CODE(String DOC_CODE) {
        this.DOC_CODE = DOC_CODE;
    }

    /**
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION the DESCRIPTION to set
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the OCPT_TYPE
     */
    public List<DocumentOccutypeModel> getOCPT_TYPE() {
        return OCPT_TYPE;
    }

    /**
     * @param OCPT_TYPE the OCPT_TYPE to set
     */
    public void setOCPT_TYPE(List<DocumentOccutypeModel> OCPT_TYPE) {
        this.OCPT_TYPE = OCPT_TYPE;
    }

    /**
     * @return the UPDATE_DATE
     */
    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    /**
     * @param UPDATE_DATE the UPDATE_DATE to set
     */
    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    /**
     * @return the CREATE_DATE
     */
    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    /**
     * @param CREATE_DATE the CREATE_DATE to set
     */
    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    /**
     * @return the OCPT_TYPE
     */
    

   
}
