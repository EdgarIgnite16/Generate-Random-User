package _Main;

import Controller.MainForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainForm().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
