/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import com.hospitalmangementsystem.model.person.accountant.Accountant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewInsertAccounts;
import main.java.com.hospitalmangementsystem.view.ViewInsertAccounts;

/**
 *
 * @author user
 */
public class ControllerInsertAccounts {

    private ViewInsertAccounts view;

    public ControllerInsertAccounts(ViewInsertAccounts view) {
        this.view = view;

        view.setButtonBehaviour(new BtnInsertIntoAccounts());
    }

    class BtnInsertIntoAccounts implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Accountant accModel = new Accountant(view.getTxtMoneyRecievedFrom(), Integer.parseInt(view.getTxtValue()), view.getTxtDate());
            accModel.storeMoneyRecived();

        }

    }

}
