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
public abstract class Room {

    private int totalNoOfBed;
    private boolean airConditioned;
    private String roomNo;

    public Room(int totalNoOfBed, boolean airConditioned, String roomNo) {
        this.totalNoOfBed = totalNoOfBed;
        this.airConditioned = airConditioned;
        this.roomNo = roomNo;
    }

    public int getTotalNoOfBed() {
        return totalNoOfBed;
    }

    public void setTotalNoOfBed(int totalNoOfBed) {
        this.totalNoOfBed = totalNoOfBed;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

}
