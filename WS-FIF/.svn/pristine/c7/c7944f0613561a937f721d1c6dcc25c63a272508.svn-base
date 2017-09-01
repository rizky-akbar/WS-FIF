/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

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
@Table(name = "OM_MST_DOC_OCCUTYPE ")
public class DocumentOccutypeModel {
    @Id
    private String OCPT_TYPE;
    private String REQUIRED;
    
    @ManyToOne
    @JoinColumn(name="DOC_CODE")
    private DocumentModel DOC_CODE;

    public DocumentModel getDOC_CODE() {
        return DOC_CODE;
    }

    public void setDOC_CODE(DocumentModel DOC_CODE) {
        this.DOC_CODE = DOC_CODE;
    }

    
    
    /**
     * @return the OCPT_TYPE
     */
    public String getOCPT_TYPE() {
        return OCPT_TYPE;
    }

    /**
     * @param OCPT_TYPE the OCPT_TYPE to set
     */
    public void setOCPT_TYPE(String OCPT_TYPE) {
        this.OCPT_TYPE = OCPT_TYPE;
    }

    /**
     * @return the REQUIRED
     */
    public String getREQUIRED() {
        return REQUIRED;
    }

    /**
     * @param REQUIRED the REQUIRED to set
     */
    public void setREQUIRED(String REQUIRED) {
        this.REQUIRED = REQUIRED;
    }
}
