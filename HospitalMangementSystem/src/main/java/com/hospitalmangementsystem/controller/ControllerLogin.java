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

/**
 *
 * @author user
 */
public class ControllerLogin {

    private ViewLogin view;
    private static int loginStatus;

    public ControllerLogin(ViewLogin view) {

        this.view = view;
        loginStatus = -1;
        view.setbuttonlistener(new ButtonListener());
    }

    public static int getLoginStatus() {
        return loginStatus;
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int temp = new Login(view.getTxtLoginId(), view.getTxtPassword()).checkLogin();
            loginStatus = temp;

        }

    }

}
