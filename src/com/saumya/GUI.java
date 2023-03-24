package com.saumya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    String[] arr = {"Dislike","Meh","OK","mid","like","insane","amazing","Out of the world"};
    JButton button;
    JLabel label;

    public GUI(){
        JFrame frame = new JFrame();


         JButton button = new JButton("Click me");
        button.addActionListener(this);


         label = new JLabel("Number of clicks: 0 \n Dislike");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        panel.setLayout(new GridLayout(1,1));

        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI YAY");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if(count <= arr.length-1)
        label.setText("Number of clicks: "+count + " \n"+arr[count]);
        else
            label.setText("Number of clicks: "+count +"\n Emotion index out of bound");
    }
}
