package com.saumya;

import javax.swing.*;
import java.awt.*;

public class LoginForm_usingGUI_welcomePage {
    LoginForm_usingGUI_welcomePage(){
        JLabel label = new JLabel("Welcome to the Login Page. YAY!");
        label.setForeground(Color.BLUE);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,50,100,50));
        panel.add(label);
        JFrame frame = new JFrame();
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome Page");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm_usingGUI_welcomePage();
    }
}
