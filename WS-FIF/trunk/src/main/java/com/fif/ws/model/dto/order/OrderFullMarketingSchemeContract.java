/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fif.ws.model.dto.order;

/**
 *
 * @author RizkyAkbar
 */
public class OrderFullMarketingSchemeContract {
    
    private String msCode  ;
    private String amount ;

    public OrderFullMarketingSchemeContract(String msCode, String amount) {
        this.msCode = msCode;
        this.amount = amount;
    }
    
    

    public OrderFullMarketingSchemeContract() {
    }

   

    public String getMsCode() {
        return msCode;
    }

    public void setMsCode(String msCode) {
        this.msCode = msCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

     
}
