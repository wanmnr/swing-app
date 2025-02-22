package com.mycompany.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mycompany.model.User;
import com.mycompany.view.MainView;

public class MainController {
    private final MainView view;

    public MainController(MainView view) {
        this.view = view;
        this.view.getSubmitButton().addActionListener(new SubmitButtonListener());
    }

    class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getNameField().getText();
            User user = new User(name);
            view.getGreetingLabel().setText("Hello, " + user.getName() + "!");
        }
    }
}
