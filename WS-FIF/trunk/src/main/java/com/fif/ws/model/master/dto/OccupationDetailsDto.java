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
public class OccupationDetailsDto {
 
       private String occupationCode;
       private String occupationSubCode;
       private String description;

    public OccupationDetailsDto() {
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getOccupationSubCode() {
        return occupationSubCode;
    }

    public void setOccupationSubCode(String occupationSubCode) {
        this.occupationSubCode = occupationSubCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OccupationDetailsDto(String occupationCode, String occupationSubCode, String description) {
        this.occupationCode = occupationCode;
        this.occupationSubCode = occupationSubCode;
        this.description = description;
    }
}
