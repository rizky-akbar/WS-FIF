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

public class OccupationDto {
 
    private String occupationCode  ;
    private String description  ;
    private String occupationType  ;
    private String aabCode  ;

    public OccupationDto() {
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType;
    }

    public String getAabCode() {
        return aabCode;
    }

    public void setAabCode(String aabCode) {
        this.aabCode = aabCode;
    }

    public OccupationDto(String occupationCode, String description, String occupationType, String aabCode) {
        this.occupationCode = occupationCode;
        this.description = description;
        this.occupationType = occupationType;
        this.aabCode = aabCode;
    }

   
}
