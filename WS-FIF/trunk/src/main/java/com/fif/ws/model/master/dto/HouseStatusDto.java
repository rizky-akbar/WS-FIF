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
public class HouseStatusDto {

    private String houseStatus;
    private String description;

    public HouseStatusDto() {
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HouseStatusDto(String houseStatus, String description) {
        this.houseStatus = houseStatus;
        this.description = description;
    }

}
