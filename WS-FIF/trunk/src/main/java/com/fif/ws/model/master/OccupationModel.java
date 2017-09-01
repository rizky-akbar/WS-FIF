/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.master;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RizkyAkbar
 */
@Entity
@Table(name = "FS_MST_OCCUPATIONS")
public class OccupationModel {
    @Id
    private String OCPT_CODE;
    private String DESCRIPTION;
    private String CREATED_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date CREATED_TIMESTAMP;
    private String LASTUPDATE_BY;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date LASTUPDATE_TIMESTAMP;
    private String BI_GOL_DEBITUR;
    private String BI_BIDANG_USAHA;
    private String BI_PEKERJAAN;
    private String BI_GOL_DEBITUR_REF;
    private String BI_BIDANG_USAHA_REF;
    private String BI_PEKERJAAN_REF;
    private String OCPT_TYPE;
    private String VISIBLE;
    private String AAB_CODE;
    private String MBI_PROFESI;
    private String KODE_BCA;
    private String OCPT_CODE_BCA;
    private String SUMBER_PENGHASILAN;

    /**
     * @return the OCPT_CODE
     */
    public String getOCPT_CODE() {
        return OCPT_CODE;
    }

    /**
     * @param OCPT_CODE the OCPT_CODE to set
     */
    public void setOCPT_CODE(String OCPT_CODE) {
        this.OCPT_CODE = OCPT_CODE;
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
     * @return the CREATED_BY
     */
    public String getCREATED_BY() {
        return CREATED_BY;
    }

    /**
     * @param CREATED_BY the CREATED_BY to set
     */
    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    /**
     * @return the CREATED_TIMESTAMP
     */
    public Date getCREATED_TIMESTAMP() {
        return CREATED_TIMESTAMP;
    }

    /**
     * @param CREATED_TIMESTAMP the CREATED_TIMESTAMP to set
     */
    public void setCREATED_TIMESTAMP(Date CREATED_TIMESTAMP) {
        this.CREATED_TIMESTAMP = CREATED_TIMESTAMP;
    }

    /**
     * @return the LASTUPDATE_BY
     */
    public String getLASTUPDATE_BY() {
        return LASTUPDATE_BY;
    }

    /**
     * @param LASTUPDATE_BY the LASTUPDATE_BY to set
     */
    public void setLASTUPDATE_BY(String LASTUPDATE_BY) {
        this.LASTUPDATE_BY = LASTUPDATE_BY;
    }

    /**
     * @return the LASTUPDATE_TIMESTAMP
     */
    public Date getLASTUPDATE_TIMESTAMP() {
        return LASTUPDATE_TIMESTAMP;
    }

    /**
     * @param LASTUPDATE_TIMESTAMP the LASTUPDATE_TIMESTAMP to set
     */
    public void setLASTUPDATE_TIMESTAMP(Date LASTUPDATE_TIMESTAMP) {
        this.LASTUPDATE_TIMESTAMP = LASTUPDATE_TIMESTAMP;
    }

    /**
     * @return the BI_GOL_DEBITUR
     */
    public String getBI_GOL_DEBITUR() {
        return BI_GOL_DEBITUR;
    }

    /**
     * @param BI_GOL_DEBITUR the BI_GOL_DEBITUR to set
     */
    public void setBI_GOL_DEBITUR(String BI_GOL_DEBITUR) {
        this.BI_GOL_DEBITUR = BI_GOL_DEBITUR;
    }

    /**
     * @return the BI_BIDANG_USAHA
     */
    public String getBI_BIDANG_USAHA() {
        return BI_BIDANG_USAHA;
    }

    /**
     * @param BI_BIDANG_USAHA the BI_BIDANG_USAHA to set
     */
    public void setBI_BIDANG_USAHA(String BI_BIDANG_USAHA) {
        this.BI_BIDANG_USAHA = BI_BIDANG_USAHA;
    }

    /**
     * @return the BI_PEKERJAAN
     */
    public String getBI_PEKERJAAN() {
        return BI_PEKERJAAN;
    }

    /**
     * @param BI_PEKERJAAN the BI_PEKERJAAN to set
     */
    public void setBI_PEKERJAAN(String BI_PEKERJAAN) {
        this.BI_PEKERJAAN = BI_PEKERJAAN;
    }

    /**
     * @return the BI_GOL_DEBITUR_REF
     */
    public String getBI_GOL_DEBITUR_REF() {
        return BI_GOL_DEBITUR_REF;
    }

    /**
     * @param BI_GOL_DEBITUR_REF the BI_GOL_DEBITUR_REF to set
     */
    public void setBI_GOL_DEBITUR_REF(String BI_GOL_DEBITUR_REF) {
        this.BI_GOL_DEBITUR_REF = BI_GOL_DEBITUR_REF;
    }

    /**
     * @return the BI_BIDANG_USAHA_REF
     */
    public String getBI_BIDANG_USAHA_REF() {
        return BI_BIDANG_USAHA_REF;
    }

    /**
     * @param BI_BIDANG_USAHA_REF the BI_BIDANG_USAHA_REF to set
     */
    public void setBI_BIDANG_USAHA_REF(String BI_BIDANG_USAHA_REF) {
        this.BI_BIDANG_USAHA_REF = BI_BIDANG_USAHA_REF;
    }

    /**
     * @return the BI_PEKERJAAN_REF
     */
    public String getBI_PEKERJAAN_REF() {
        return BI_PEKERJAAN_REF;
    }

    /**
     * @param BI_PEKERJAAN_REF the BI_PEKERJAAN_REF to set
     */
    public void setBI_PEKERJAAN_REF(String BI_PEKERJAAN_REF) {
        this.BI_PEKERJAAN_REF = BI_PEKERJAAN_REF;
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
     * @return the VISIBLE
     */
    public String getVISIBLE() {
        return VISIBLE;
    }

    /**
     * @param VISIBLE the VISIBLE to set
     */
    public void setVISIBLE(String VISIBLE) {
        this.VISIBLE = VISIBLE;
    }

    /**
     * @return the AAB_CODE
     */
    public String getAAB_CODE() {
        return AAB_CODE;
    }

    /**
     * @param AAB_CODE the AAB_CODE to set
     */
    public void setAAB_CODE(String AAB_CODE) {
        this.AAB_CODE = AAB_CODE;
    }

    /**
     * @return the MBI_PROFESI
     */
    public String getMBI_PROFESI() {
        return MBI_PROFESI;
    }

    /**
     * @param MBI_PROFESI the MBI_PROFESI to set
     */
    public void setMBI_PROFESI(String MBI_PROFESI) {
        this.MBI_PROFESI = MBI_PROFESI;
    }

    /**
     * @return the KODE_BCA
     */
    public String getKODE_BCA() {
        return KODE_BCA;
    }

    /**
     * @param KODE_BCA the KODE_BCA to set
     */
    public void setKODE_BCA(String KODE_BCA) {
        this.KODE_BCA = KODE_BCA;
    }

    /**
     * @return the OCPT_CODE_BCA
     */
    public String getOCPT_CODE_BCA() {
        return OCPT_CODE_BCA;
    }

    /**
     * @param OCPT_CODE_BCA the OCPT_CODE_BCA to set
     */
    public void setOCPT_CODE_BCA(String OCPT_CODE_BCA) {
        this.OCPT_CODE_BCA = OCPT_CODE_BCA;
    }

    /**
     * @return the SUMBER_PENGHASILAN
     */
    public String getSUMBER_PENGHASILAN() {
        return SUMBER_PENGHASILAN;
    }

    /**
     * @param SUMBER_PENGHASILAN the SUMBER_PENGHASILAN to set
     */
    public void setSUMBER_PENGHASILAN(String SUMBER_PENGHASILAN) {
        this.SUMBER_PENGHASILAN = SUMBER_PENGHASILAN;
    }
}
