package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public JPanel panel1;
    private JTextField textField1;
    int option;

    public App() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option = Integer.parseInt(textField1.getText());
            }
        });
    }


}
