/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.hospitalmangementsystem.controller;

import main.java.com.hospitalmangementsystem.model.login.Login;
import main.java.com.hospitalmangementsystem.view.ViewLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.hospitalmangementsystem.view.ViewNewLogin;

/**
 *
 * @author user
 */
public class ControllerNewLogin {

    private ViewNewLogin view;

    public ControllerNewLogin(ViewNewLogin view) {

        this.view = view;

        view.setbuttonlistener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Login login = new Login(view.getTxtLoginId(), view.getTxtPassword());
            login.storeNewLogin();
            view.setVisible(false);
        }

    }

}
