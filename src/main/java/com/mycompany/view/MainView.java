package com.mycompany.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private JTextField nameField;
    private JButton submitButton;
    private JLabel greetingLabel;

    public MainView() {
        setTitle("Swing MVC Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter your name: "));
        nameField = new JTextField(15);
        add(nameField);

        submitButton = new JButton("Submit");
        add(submitButton);

        greetingLabel = new JLabel("");
        add(greetingLabel);
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }
}
