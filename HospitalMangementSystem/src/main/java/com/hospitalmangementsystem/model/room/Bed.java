/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.model.room;

/**
 *
 * @author user
 */
public class Bed {

    private String roomNo;
    private String bedId;

    public Bed(String roomNo, String bedId) {
        this.roomNo = roomNo;
        this.bedId = bedId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

}
