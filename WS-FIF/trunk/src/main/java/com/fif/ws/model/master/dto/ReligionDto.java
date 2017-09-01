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
public class ReligionDto {

    private String religionId;
    private String description;
    private String aabCode;

    public ReligionDto() {
    }

    public String getReligionId() {
        return religionId;
    }

    public void setReligionId(String religionId) {
        this.religionId = religionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAabCode() {
        return aabCode;
    }

    public void setAabCode(String aabCode) {
        this.aabCode = aabCode;
    }

    public ReligionDto(String religionId, String description, String aabCode) {
        this.religionId = religionId;
        this.description = description;
        this.aabCode = aabCode;
    }
}
