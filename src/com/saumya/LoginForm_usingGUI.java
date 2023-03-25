package com.saumya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginForm_usingGUI implements ActionListener {

    JFrame frame = new JFrame();
    JButton login_button = new JButton("Login");
    JButton reset_button = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> logininfo_original = new HashMap<String,String>();
    LoginForm_usingGUI(HashMap<String,String> original_info){
        logininfo_original = original_info;


        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);


        userIdField.setBounds(125,100,200,25);
        passwordField.setBounds(125,150,200,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.ITALIC,25));

        login_button.setBounds(125,200,100,25);
        login_button.addActionListener(this);

        reset_button.setBounds(250,200,100,25);
        reset_button.addActionListener(this);

        login_button.setFocusable(false);
        reset_button.setFocusable(false);

        frame.add(userIdLabel);
        frame.add(userIdField);
        frame.add(userPasswordLabel);
        frame.add(passwordField);
        frame.add(login_button);
        frame.add(reset_button);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setTitle("Login Form");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm_usingGUI loginForm = new LoginForm_usingGUI(new LoginForm_usingGUI_PasswordandIDS().getlogininfo());
        System.out.println(new LoginForm_usingGUI_PasswordandIDS().getlogininfo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset_button){
            userIdField.setText("");
            passwordField.setText("");
        }

        if(e.getSource() == login_button) {
            String userId = userIdField.getText();
            String password = String.valueOf(passwordField.getPassword());

            System.out.println(userId);
            System.out.println(password);
            boolean isValid = true;

            if (userId.length() < 6 || password.length() < 6) {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("User ID or Password is too short");
                messageLabel.setBounds(125, 250, 650, 35);
                isValid = false;
            }
            if (isValid) {
                if (logininfo_original.containsKey(userId)) {
                    if (logininfo_original.get(userId).equals(password)) {
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login Successful");
                        messageLabel.setBounds(125, 250, 250, 35);
                        LoginForm_usingGUI_welcomePage welcomePage = new LoginForm_usingGUI_welcomePage();
                    } else {
                        messageLabel.setForeground(Color.red);
                        messageLabel.setText("Wrong Password");
                        messageLabel.setBounds(125, 250, 250, 35);
                    }
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("User ID doesn't exists in our database");
                    messageLabel.setBounds(125, 250, 250, 35);
                }
            }
        }
    }
}
