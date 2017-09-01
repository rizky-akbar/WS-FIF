/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.model.master.dto;

import java.util.List;
import java.util.Map;

/**
 *
 * @author RizkyAkbar
 */
public class ResponseMessageMap {

    private String responseCode;
    private String responseMessage;
    private List<Map> responseRef;

    public ResponseMessageMap() {
    }

    public ResponseMessageMap(String responseCode, String responseMessage, List<Map> responseRef) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseRef = responseRef;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public List<Map> getResponseRef() {
        return responseRef;
    }

    public void setResponseRef(List<Map> responseRef) {
        this.responseRef = responseRef;
    }
}
