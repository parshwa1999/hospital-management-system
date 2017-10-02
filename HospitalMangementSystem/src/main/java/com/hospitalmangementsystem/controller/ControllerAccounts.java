/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewAccountant;
import main.java.com.hospitalmangementsystem.view.ViewAccountantData;
import main.java.com.hospitalmangementsystem.view.ViewInsertAccounts;

/**
 *
 * @author user
 */
public class ControllerAccounts {

    private ViewAccountant view;

    public ControllerAccounts(ViewAccountant view) {
        this.view = view;

        view.setButtonBehaviour(new BtnInsertAccounts());
    }

    class BtnInsertAccounts implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Insert Accounts")) {
                ViewInsertAccounts viewInsertAccounts = new ViewInsertAccounts();
            } else if (e.getActionCommand().equals("View Accounts")) {
                ViewAccountantData viewAccountantData = new ViewAccountantData();
            }

        }

    }

}
