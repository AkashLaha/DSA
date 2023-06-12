package com.akash.Swing.Swing2.Jframw2ndway;

import javax.swing.*;
import java.awt.*;

//creating frame using Jframe as parent class
public class Myframeexp extends JFrame {
    Myframeexp(){
        this.setTitle("title is here");//sets jframe title
        this.setSize(420,420);//sets x and y dimension of frame
        this.setVisible(true);//make frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//frame from resized
        //ImageIcon image=new ImageIcon();//for change upper icon of frame specify a file path or filename if inside
        // same package
        //this.setIconImage(image.getImage());//change image icon of frame
        //this.getContentPane().setBackground(Color.BLUE);//change bg color of frame
        this.getContentPane().setBackground(new Color(123,50,250));//set rgb colors
        //u can put hexadecimal colors also by using new Color(0x6digit code)

    }
}


