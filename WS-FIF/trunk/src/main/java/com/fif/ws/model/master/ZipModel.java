/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "FS_MST_ZIP")
public class ZipModel implements Serializable {
    @Id
    private String ZIP_CODE;
    private String SUB_ZIP_CODE;
    private String ZIP_DESC;
    private String KEL_CODE;
    private String KEC_CODE;
    private String CITY_CODE;
    private String PROV_CODE;

    /**
     * @return the ZIP_CODE
     */
    public String getZIP_CODE() {
        return ZIP_CODE;
    }

    /**
     * @param ZIP_CODE the ZIP_CODE to set
     */
    public void setZIP_CODE(String ZIP_CODE) {
        this.ZIP_CODE = ZIP_CODE;
    }

    /**
     * @return the SUB_ZIP_CODE
     */
    public String getSUB_ZIP_CODE() {
        return SUB_ZIP_CODE;
    }

    /**
     * @param SUB_ZIP_CODE the SUB_ZIP_CODE to set
     */
    public void setSUB_ZIP_CODE(String SUB_ZIP_CODE) {
        this.SUB_ZIP_CODE = SUB_ZIP_CODE;
    }

    /**
     * @return the ZIP_DESC
     */
    public String getZIP_DESC() {
        return ZIP_DESC;
    }

    /**
     * @param ZIP_DESC the ZIP_DESC to set
     */
    public void setZIP_DESC(String ZIP_DESC) {
        this.ZIP_DESC = ZIP_DESC;
    }

    /**
     * @return the KEL_CODE
     */
    public String getKEL_CODE() {
        return KEL_CODE;
    }

    /**
     * @param KEL_CODE the KEL_CODE to set
     */
    public void setKEL_CODE(String KEL_CODE) {
        this.KEL_CODE = KEL_CODE;
    }

    /**
     * @return the KEC_CODE
     */
    public String getKEC_CODE() {
        return KEC_CODE;
    }

    /**
     * @param KEC_CODE the KEC_CODE to set
     */
    public void setKEC_CODE(String KEC_CODE) {
        this.KEC_CODE = KEC_CODE;
    }

    /**
     * @return the CITY_CODE
     */
    public String getCITY_CODE() {
        return CITY_CODE;
    }

    /**
     * @param CITY_CODE the CITY_CODE to set
     */
    public void setCITY_CODE(String CITY_CODE) {
        this.CITY_CODE = CITY_CODE;
    }

    /**
     * @return the PROV_CODE
     */
    public String getPROV_CODE() {
        return PROV_CODE;
    }

    /**
     * @param PROV_CODE the PROV_CODE to set
     */
    public void setPROV_CODE(String PROV_CODE) {
        this.PROV_CODE = PROV_CODE;
    }
}
