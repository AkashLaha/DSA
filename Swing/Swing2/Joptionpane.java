package com.akash.Swing.Swing2;

import javax.swing.*;

//it is used for prompting or poping some alert msgs or dialog boxes like confirm dialog box,input dialog box or
// msg dailog box
public class Joptionpane {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter ur age"));
        JOptionPane.showMessageDialog(null,"ur age "+age);

        double height= Double.parseDouble(JOptionPane.showInputDialog("enter ur height"));
        JOptionPane.showMessageDialog(null,"ur height"+height);
    }
}
