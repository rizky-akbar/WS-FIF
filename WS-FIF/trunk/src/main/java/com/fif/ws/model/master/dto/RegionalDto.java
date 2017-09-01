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
public class RegionalDto {
    
    private String regID;
    private String regShortName;
    private String regFullName;

    public RegionalDto() {
    }

    public RegionalDto(String regID, String regShortName, String regFullName) {
        this.regID = regID;
        this.regShortName = regShortName;
        this.regFullName = regFullName;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public String getRegShortName() {
        return regShortName;
    }

    public void setRegShortName(String regShortName) {
        this.regShortName = regShortName;
    }

    public String getRegFullName() {
        return regFullName;
    }

    public void setRegFullName(String regFullName) {
        this.regFullName = regFullName;
    }
    
    
}
