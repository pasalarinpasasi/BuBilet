package com.mycompany.prolab1_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GUI extends JFrame implements ActionListener
{
    boolean loginable = false;
    public int i;

    JFrame frame;
    JLabel user;
    JLabel pass;
    JButton login;
    JTextField username;
    JPasswordField password;
    JLabel success;

    JLabel label;
    JButton adminGiris;
    JButton firmaGiris;
    JButton kullaniciGiris;
    public GUI()
    {
        label = new JLabel("Giriş Yöntemini Seçiniz.");
        label.setBounds(160, 30, 200, 30);

        adminGiris = new JButton("Admin Girişi");
        adminGiris.setBounds(150, 80, 150, 30);
        adminGiris.addActionListener(this);

        firmaGiris = new JButton("Firma Girişi");
        firmaGiris.setBounds(150, 130, 150, 30);
        firmaGiris.addActionListener(this);

        kullaniciGiris = new JButton("Kullanıcı Girişi");
        kullaniciGiris.setBounds(150, 180, 150, 30);
        kullaniciGiris.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,300);
        this.setVisible(true);

        this.add(label);
        this.add(adminGiris);
        this.add(firmaGiris);
        this.add(kullaniciGiris);

    }

    public GUI(int o)
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == adminGiris)
        {
            Admin admin = new Admin();
        }

        if (e.getSource() == firmaGiris)
        {
            user = new JLabel("Firma Adı: ");
            user.setBounds(100, 30, 200, 20);

            pass = new JLabel("Parola: ");
            pass.setBounds(100, 70, 200, 20);

            username = new JTextField();
            username.setBounds(180, 30, 150, 20);

            password = new JPasswordField();
            password.setBounds(180, 70, 150, 20);

            login = new JButton("Giriş Yap");
            login.setBounds(180, 120, 100, 40);
            login.addActionListener(this);

            success = new JLabel();
            success.setBounds(180, 170, 150, 20);

            frame = new JFrame("Firma Giriş");
            frame.setLayout(null);
            frame.setSize(450, 250);
            frame.setVisible(true);

            frame.add(user);
            frame.add(pass);
            frame.add(username);
            frame.add(password);
            frame.add(login);
            frame.add(success);


        }

        if (e.getSource() == kullaniciGiris)
        {
            Customer customer = new Customer();
        }

        if(e.getSource() == login)
        {
            for(i = 0; i < User.Companylar.size(); i++)
            {
                if(Objects.equals(username.getText(), User.Companylar.get(i).USERNAME) && Objects.equals(password.getText(), User.Companylar.get(i).PASSWORD))
                {
                    companyPanel companyPanel = new companyPanel();
                    companyPanel.i = i;
                    companyPanel companyPanel1 = new companyPanel(1);
                    frame.dispose();
                    break;
                }
            }
            username.setText("");
            password.setText("");
            success.setText("Hatalı Giriş!");
        }
    }
}
