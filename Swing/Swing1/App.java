package com.akash.Swing.Swing1;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });

    }
}
