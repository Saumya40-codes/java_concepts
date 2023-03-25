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
    JCheckBox box;
    JLabel label1;

    public GUI(){
        JCheckBox box = new JCheckBox("Click Check !?");
        JFrame frame = new JFrame();


         JButton button = new JButton("Click me");
         button.addActionListener(this);


         label = new JLabel("Number of clicks: 0 \n Dislike");

         label1 = new JLabel("YAY !");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,50,100,50));
        panel.setLayout(new GridLayout(1,1));

        panel.add(button);
        panel.add(label);
        panel.add(box);
        panel.add(label1);


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
        label.setText("Number of clicks: "+count + " "+arr[count]);
        else
            label.setText("Number of clicks: "+count +"\n Emotion index out of bound");
    }
}
