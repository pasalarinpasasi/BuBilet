package com.mycompany.prolab1_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;

public class Admin extends User implements ActionListener {
    static final String USERNAME = "admin"; //tontikEjderha123
    static final String PASSWORD = "123"; // pasham1numaraliEderhaAvcisi

    static {
        User.hizmetBedeli.add(123);
        User.Companylar.add(new Company("Türk Hava Yolları", "1234"));
        User.hizmetBedeli.add(567);
        User.Companylar.add(new Company("YHT", "4321"));
        User.hizmetBedeli.add(890);
        User.Companylar.add(new Company("Efe Tur", "1234"));
        User.hizmetBedeli.add(987);
        User.Companylar.add(new Company("Kütahyalılar Seyahat", "9555"));
        User.hizmetBedeli.add(654);
        User.Companylar.add(new Company("Cesur Bingöl", "7805"));
    }

    JFrame frame;

    //===================== CONSTRUCTOR 1 FRAME ========================//

    JLabel user;
    JLabel pass;
    JButton login;
    JTextField username;
    JPasswordField password;
    JLabel success;

    //===================== CONSTRUCTOR 2 FRAME ========================//

    JLabel baslik;
    JButton firmaGoruntule;
    JButton firmaEkle;
    JButton firmaSil;
    JButton hizmetBedeli;

    //===================== firmaGoruntule() FRAME ========================//

    JFrame firmaGoruntuleFrame;
    JTable firmaGoruntuleTablo;
    JScrollPane firmaGoruntulePane;
    Object[][] data;
    Object[] column = {"Firma Adı", "Hizmet Bedeli"};

    //===================== firmaEkle() FRAME ===========================//

    JFrame firmaEkleFrame;
    JLabel firmaKullaniciAdi;
    JLabel firmaParola;
    JTextField firmaUsername;
    JPasswordField firmaPassword;
    JLabel firmaEkleHizmetBedeliLabel;
    JTextField firmaEkleHizmetBedeli;
    JButton firmaEkleButon;

    //===================== firmaSil() FRAME ===========================//

    JFrame firmaSilFrame;
    JLabel firmaSilLabel;
    JTextField firmaSilText;
    JButton firmaSilButton;

    //===================== hizmetBedeli() FRAME ========================//

    JFrame hizmetBedeliFrame;
    JLabel hizmetBedeliFirmaLabel;
    JLabel hizmetBedeliLabel;
    JTextField hizmetBedeliFirmaText;
    JTextField yeniHizmetBedeli;
    JButton hizmetBedeliButton;

    public Admin()
    {
        user = new JLabel("Kullanıcı Adı: ");
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

        frame = new JFrame("Admin Giriş");
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

    public Admin(int o)
    {
        baslik = new JLabel("İşlem Seçiniz");
        baslik.setBounds(112, 15, 200, 30);

        firmaGoruntule = new JButton("Firmaları Görüntüle");
        firmaGoruntule.setBounds(50, 50, 200, 30);
        firmaGoruntule.addActionListener(this);

        firmaEkle = new JButton("Firma Ekle");
        firmaEkle.setBounds(50, 90, 200, 30);
        firmaEkle.addActionListener(this);

        firmaSil = new JButton("Firma Sil");
        firmaSil.setBounds(50, 130, 200, 30);
        firmaSil.addActionListener(this);

        hizmetBedeli = new JButton("Hizmet Bedeli Belirle");
        hizmetBedeli.setBounds(50, 170, 200, 30);
        hizmetBedeli.addActionListener(this);

        /*mevcutHizmetBedeli = new JLabel(MevcutHizmetBedeli);
        mevcutHizmetBedeli.setBounds(10, 230, 200, 30);*/

        frame = new JFrame("Admin Panel");
        frame.setLayout(null);
        frame.setSize(310, 300);
        frame.setVisible(true);

        frame.add(baslik);
        frame.add(firmaGoruntule);
        frame.add(firmaEkle);
        frame.add(firmaSil);
        frame.add(hizmetBedeli);
        //frame.add(mevcutHizmetBedeli);
    }

    public void firmaGoruntule()
    {
        data = new Object[User.Companylar.size()][2];
        firmaGoruntuleFrame = new JFrame();

        for (int i = 0; i < User.Companylar.size(); i++)
        {
            data[i][0] = User.Companylar.get(i).USERNAME;
            data[i][1] = User.hizmetBedeli.get(i);
        }

        firmaGoruntuleTablo = new JTable(data, column);
        firmaGoruntuleTablo.setBounds(30, 40, 200, 300);

        firmaGoruntulePane = new JScrollPane(firmaGoruntuleTablo);

        firmaGoruntuleFrame.add(firmaGoruntulePane);
        firmaGoruntuleFrame.setSize(300,400);
        firmaGoruntuleFrame.setVisible(true);
    }

    public void firmaEkle()
    {
        firmaEkleFrame = new JFrame();

        firmaKullaniciAdi = new JLabel("Firma Adını Girin:");
        firmaKullaniciAdi.setBounds(50, 40, 150, 30);

        firmaParola = new JLabel("Firma Parolasını Girin:");
        firmaParola.setBounds(50, 80, 150,  30);

        firmaUsername = new JTextField();
        firmaUsername.setBounds(200, 40, 100, 30);

        firmaPassword = new JPasswordField();
        firmaPassword.setBounds(200, 80, 100, 30);

        firmaEkleHizmetBedeliLabel = new JLabel("Hizmet Bedeli:");
        firmaEkleHizmetBedeliLabel.setBounds(50, 120, 150, 30);

        firmaEkleHizmetBedeli = new JTextField();
        firmaEkleHizmetBedeli.setBounds(200, 120, 100, 30);

        firmaEkleButon = new JButton("Tamam");
        firmaEkleButon.setBounds(150, 180, 80, 40);
        firmaEkleButon.addActionListener(this);


        firmaEkleFrame.setLayout(null);
        firmaEkleFrame.setSize(400, 300);
        firmaEkleFrame.setVisible(true);

        firmaEkleFrame.add(firmaKullaniciAdi);
        firmaEkleFrame.add(firmaParola);
        firmaEkleFrame.add(firmaUsername);
        firmaEkleFrame.add(firmaPassword);
        firmaEkleFrame.add(firmaEkleHizmetBedeliLabel);
        firmaEkleFrame.add(firmaEkleHizmetBedeli);
        firmaEkleFrame.add(firmaEkleButon);
    }

    public void firmaSil()
    {
        firmaSilFrame = new JFrame();

        firmaSilLabel = new JLabel("Silinecek Firmanın Adını Yazın");
        firmaSilLabel.setBounds(43, 30, 200, 30);

        firmaSilText = new JTextField();
        firmaSilText.setBounds(78, 65, 100, 30);

        firmaSilButton = new JButton("Sil");
        firmaSilButton.setBounds(103, 110, 50, 30);
        firmaSilButton.addActionListener(this);

        firmaSilFrame.setLayout(null);
        firmaSilFrame.setSize(270, 200);
        firmaSilFrame.setVisible(true);

        firmaSilFrame.add(firmaSilLabel);
        firmaSilFrame.add(firmaSilText);
        firmaSilFrame.add(firmaSilButton);
    }

    public void hizmetBedeli()
    {
        hizmetBedeliFrame = new JFrame();

        hizmetBedeliFirmaLabel = new JLabel("Firma Adı:");
        hizmetBedeliFirmaLabel.setBounds(20, 20, 100, 30);

        hizmetBedeliLabel = new JLabel("Yeni Hizmet Bedeli:");
        hizmetBedeliLabel.setBounds(20, 60, 120, 30);

        hizmetBedeliFirmaText = new JTextField();
        hizmetBedeliFirmaText.setBounds(150, 20, 100, 30);

        yeniHizmetBedeli = new JTextField();
        yeniHizmetBedeli.setBounds(150, 60, 100, 30);

        hizmetBedeliButton = new JButton("Tamam");
        hizmetBedeliButton.setBounds(95, 110, 80, 30);
        hizmetBedeliButton.addActionListener(this);

        hizmetBedeliFrame.setLayout(null);
        hizmetBedeliFrame.setSize(290, 200);
        hizmetBedeliFrame.setVisible(true);

        hizmetBedeliFrame.add(hizmetBedeliFirmaLabel);
        hizmetBedeliFrame.add(hizmetBedeliFirmaText);
        hizmetBedeliFrame.add(hizmetBedeliLabel);
        hizmetBedeliFrame.add(yeniHizmetBedeli);
        hizmetBedeliFrame.add(hizmetBedeliButton);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == login)
        {
            if(Objects.equals(username.getText(), USERNAME) && Objects.equals(password.getText(), PASSWORD))
            {
                this.loginable = true;
                this.Login(loginable);
                frame.dispose();
            }

            else
            {
                username.setText("");
                password.setText("");
                success.setText("Hatalı Giriş!");
            }
        }

        //METOTLAR
        if(e.getSource() == firmaGoruntule)
        {
            firmaGoruntule();
        }

        if(e.getSource() == firmaEkle)
        {
            firmaEkle();
        }

        if(e.getSource() == firmaSil)
        {
            firmaSil();
        }

        if(e.getSource() == hizmetBedeli)
        {
            hizmetBedeli();
        }

        //BUTONLAR
        if(e.getSource() == firmaEkleButon)
        {
            User.Companylar.add(new Company(firmaUsername.getText(), firmaPassword.getText()));
            User.hizmetBedeli.add(Integer.parseInt(firmaEkleHizmetBedeli.getText()));

            firmaEkleFrame.dispose();
        }

        if(e.getSource() == firmaSilButton)
        {
            for(int i = 0; i < User.Companylar.size(); i++)
                if(Objects.equals(User.Companylar.get(i).USERNAME, firmaSilText.getText()))
                {
                    User.Companylar.remove(i);
                    User.hizmetBedeli.remove(i);
                }

            firmaSilFrame.dispose();
        }

        if(e.getSource() == hizmetBedeliButton)
        {
            for(int i = 0; i < User.Companylar.size(); i++)
                if(Objects.equals(User.Companylar.get(i).USERNAME, hizmetBedeliFirmaText.getText()))
                    User.hizmetBedeli.set(i, Integer.parseInt(yeniHizmetBedeli.getText()));

            hizmetBedeliFrame.dispose();
        }
    }

    @Override
    public void Login(boolean loginable)
    {
        if(loginable)
        {
            Admin admin1 = new Admin(1);
        }
    }
}
