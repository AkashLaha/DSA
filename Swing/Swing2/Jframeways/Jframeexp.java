package com.akash.Swing.Swing2.Jframeways;

import javax.swing.*;
import java.awt.*;

public class Jframeexp {
    public static void main(String[] args) {
        JFrame frame=new JFrame();//creates a frame
        frame.setTitle("title is here");//sets jframe title
        frame.setSize(420,420);//sets x and y dimension of frame
        frame.setVisible(true);//make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //exit out of the app because by default it only hides after closing
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //not close the frame even after clicking the x button
        frame.setResizable(false);//frame from resized
        //ImageIcon image=new ImageIcon();//for changing the upper icon of frame specify a file path or filename if
        // inside
        // same package
        //frame.setIconImage(image.getImage());//change image icon of frame
        //frame.getContentPane().setBackground(Color.BLUE);//change bg color of frame
        frame.getContentPane().setBackground(new Color(123,50,250));//set rgb colors
        //u can put hexadecimal colors also by using new Color(0x6digit code)



    }
}
