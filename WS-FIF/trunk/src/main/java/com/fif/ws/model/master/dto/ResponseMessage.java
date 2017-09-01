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
public class ResponseMessage {
    
    private String responseCode;
    private String responseMessage;
    private String responseRef;

    public ResponseMessage() {
    }

    public ResponseMessage(String responseCode, String responseMessage, String responseRef) {
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

    public String getResponseRef() {
        return responseRef;
    }

    public void setResponseRef(String responseRef) {
        this.responseRef = responseRef;
    }
    
    
}
