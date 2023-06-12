package com.akash.Swing.Swing1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextArea textArea;
    private JButton btn;
    public MainFrame(){
        super("Hello World");
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        btn =new JButton("Click Me");
        add(textArea,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
