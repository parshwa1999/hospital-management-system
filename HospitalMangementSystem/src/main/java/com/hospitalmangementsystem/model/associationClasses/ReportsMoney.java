/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.associationClasses;

/**
 *
 * @author user
 */
public class ReportsMoney {

    private String sender;
    private String AccountantId;
    private String dateOfHandling;
    private int moneyGiven;

    public ReportsMoney(String sender, String AccountantId, String dateOfHandling, int moneyGiven) {
        this.sender = sender;
        this.AccountantId = AccountantId;
        this.dateOfHandling = dateOfHandling;
        this.moneyGiven = moneyGiven;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAccountantId() {
        return AccountantId;
    }

    public void setAccountantId(String AccountantId) {
        this.AccountantId = AccountantId;
    }

    public String getDateOfHandling() {
        return dateOfHandling;
    }

    public void setDateOfHandling(String dateOfHandling) {
        this.dateOfHandling = dateOfHandling;
    }

    public int getMoneyGiven() {
        return moneyGiven;
    }

    public void setMoneyGiven(int moneyGiven) {
        this.moneyGiven = moneyGiven;
    }

}
