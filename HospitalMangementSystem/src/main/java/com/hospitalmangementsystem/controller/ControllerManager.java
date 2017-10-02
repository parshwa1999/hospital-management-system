/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.model.login.Login;
import main.java.com.hospitalmangementsystem.view.ViewAddNewDoctor;
import main.java.com.hospitalmangementsystem.view.ViewLogin;
import main.java.com.hospitalmangementsystem.view.ViewManager;
import main.java.com.hospitalmangementsystem.view.ViewNewLogin;

/**
 *
 * @author user
 */
public class ControllerManager {

    private ViewManager view;

    public ControllerManager(ViewManager view) {
        this.view = view;

        view.setButtinBehaviour(new ManagerBtnController());

    }

    class ManagerBtnController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add Doctor")) {
                ViewAddNewDoctor viewNewDoctor = new ViewAddNewDoctor();
            } else if (e.getActionCommand().equals("Add Nurse")) {

            } else if (e.getActionCommand().equals("Add Receptionist")) {

            } else if (e.getActionCommand().equals("View Staff")) {

            } else if (e.getActionCommand().equals("Create New Login")) {
                ViewNewLogin viewNewLogin = new ViewNewLogin();
                ControllerNewLogin controllerNewLogin = new ControllerNewLogin(viewNewLogin);
            } else if (e.getActionCommand().equals("View Accounts")) {
            }
        }

    }
}
