package com.mycompany;

import com.mycompany.view.MainView;
import com.mycompany.controller.MainController;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (Exception e) {
                e.printStackTrace();
            }
            MainView view = new MainView();
            new MainController(view);
            view.setVisible(true);
        });
    }
}
