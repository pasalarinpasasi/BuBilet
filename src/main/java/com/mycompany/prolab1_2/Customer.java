package com.mycompany.prolab1_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class Customer implements ActionListener {
    JFrame customerFrame;
    JTextField customerAD;
    JTextField customerSOYAD;
    JTextField customerID;
    JTextField customerDogumTarihi;
    JButton customerButton;

    public Customer()
    {
        customerFrame = new JFrame();

        customerAD = new JTextField("Ad");
        customerAD.setBounds(30, 20, 100, 30);

        customerSOYAD = new JTextField("Soyad");
        customerSOYAD.setBounds(30, 50, 100, 30);

        customerID = new JTextField("TC Kimlik No");
        customerID.setBounds(30, 80, 100, 30);

        customerDogumTarihi = new JTextField("Dogum Tarihi");
        customerDogumTarihi.setBounds(30, 110, 100, 30);

        customerButton = new JButton("Tamam");
        customerButton.setBounds(30, 160, 100, 30);
        customerButton.addActionListener(this);

        customerFrame.setLayout(null);
        customerFrame.setSize(170, 250);
        customerFrame.setVisible(true);

        customerFrame.add(customerAD);
        customerFrame.add(customerSOYAD);
        customerFrame.add(customerID);
        customerFrame.add(customerDogumTarihi);
        customerFrame.add(customerButton);
    }

    public void aracListele()
    {

    }

    public void rezervasyonYap()
    {

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == customerButton)
        {
            customerFrame.dispose();
        }
    }
}
