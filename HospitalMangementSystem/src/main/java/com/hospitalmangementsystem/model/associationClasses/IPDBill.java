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
public class IPDBill {

    private int totalCharge;
    private String pharmacyBillId;
    private String IPDpatientId;

    public IPDBill(String pharmacyBillId, String IPDpatientId) {
        this.pharmacyBillId = pharmacyBillId;
        this.IPDpatientId = IPDpatientId;
    }

    public String getPharmacyBillId() {
        return pharmacyBillId;
    }

    public void setPharmacyBillId(String pharmacyBillId) {
        this.pharmacyBillId = pharmacyBillId;
    }

    public String getIPDpatientId() {
        return IPDpatientId;
    }

    public void setIPDpatientId(String IPDpatientId) {
        this.IPDpatientId = IPDpatientId;
    }

}
