package com.akash;

import java.awt.*; import javax.swing.*;
public class RegistrationForm extends Frame
{
    RegistrationForm()
    {
        Frame fm = new Frame();
        Label lb1 = new Label("Full Name");
        lb1.setBounds(80,30,120,40);
        Label lb2= new Label("Institute Name");
        lb2.setBounds(80,60,120,40);
        Label lb3= new Label("Email");
        lb3.setBounds(80,90,120,40);
        Label lb4= new Label("Phone Number");
        lb4.setBounds(80,120,120,40);
        Label lb5= new Label("Country");
        lb5.setBounds(80,150,120,40);
        Label lb6= new Label("Gender");
        lb6.setBounds(80,180,120,40);
        Label lb7= new Label("Language");
        lb7.setBounds(80,210,120,40);
        Label lb8= new Label("Comment");
        lb8.setBounds(80,240,120,40);
        fm.add(lb1);
        fm.add(lb2);
        fm.add(lb3);
        fm.add(lb4);
        fm.add(lb5);
        fm.add(lb6);
        fm.add(lb7);
        fm.add(lb8);


        TextField t1,t2,t3,t4,t8;
        t1=new TextField();
        t1.setBounds(200,30,120,20);
        t2=new TextField();
        t2.setBounds(200,60,120,20);
        t3=new TextField();
        t3.setBounds(200,90,120,20);
        t4=new TextField();
        t4.setBounds(200,120,120,20);
        t8=new TextField();
        t8.setBounds(200,240,120,20);
        fm.add(t1);
        fm.add(t2);
        fm.add(t3);
        fm.add(t4);
        fm.add(t8);
        Choice c = new Choice();
        c.setBounds(200,150,120,20);
        c.add("India");
        c.add("Nepal");
        c.add("Canada");
        c.add("Paris");
        fm.add(c);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("Male", cbg, false);
        checkBox1.setBounds(200,180,120,20);
        fm.add(checkBox1);
        Checkbox checkBox2 = new Checkbox("Male", cbg, false);
        checkBox2.setBounds(350,180,120,20);
        fm.add(checkBox2);
        Checkbox checkbox1=new Checkbox("English");
        checkbox1.setBounds(200,210,120,20);
        fm.add(checkbox1);
        Checkbox checkbox2=new Checkbox("Hindi");
        checkbox2.setBounds(350,210,120,20);
        fm.add(checkbox2);
        Button b = new Button("Submit");
        b.setBounds(80,270,120,40);
        fm.add(b);
        fm.setLayout(null);
        fm.setVisible(true);
        fm.setSize(800,800);
    }

    public static void main(String args[])
    {
        RegistrationForm rf = new RegistrationForm();
    }
}
