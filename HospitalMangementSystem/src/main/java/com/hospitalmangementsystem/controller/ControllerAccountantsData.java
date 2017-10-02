/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospitalmangementsystem.controller;

import com.hospitalmangementsystem.model.person.accountant.Accountant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewAccountantData;
import main.java.com.hospitalmangementsystem.view.ViewInsertAccounts;

/**
 *
 * @author user
 */
public class ControllerAccountantsData {

    private ViewAccountantData view;

    public ControllerAccountantsData(ViewAccountantData view) {
        this.view = view;

        view.setButtonBehaviour(new BtnAccountsRetrieveData());
    }

    class BtnAccountsRetrieveData implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ninininini");
            String date = view.getTxtDate();
            Accountant accModel = new Accountant();
            accModel.viewMoneyRecived(date);
            view.setLblRecievedFrom(accModel.getMoneyGivenBy());
            view.setLblValues(Integer.toString(accModel.getAccountGiven()));
        }

    }

}
