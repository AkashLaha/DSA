package com.akash.Swing.Swing2.Label;

import javax.swing.*;
import javax.swing.JLabel;

//JLabel: a gui display area for a string of text, an image or both
public class Main {

    public static void main(String[] args) {
        //write imageicon before jlabel
        ImageIcon image=new ImageIcon("icon.png");
        JLabel label =new JLabel();
        //JLabel label =new JLabel("hello how are u");//also way foe label
        label.setText("who r u");//set text of label
        label.setIcon(image);



        JFrame frame=new JFrame();
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);//adding the label to the frame
    }

}
