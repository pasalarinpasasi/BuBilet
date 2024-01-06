package com.mycompany.prolab1_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class companyPanel extends User implements ActionListener
{
    public int i;
    Company geciciCompany;

    //===================== MENU ====================//

    JFrame menu;
    JLabel menuLabel;
    JButton aracEkle;
    JButton aracListele;
    JButton aracSil;
    JButton karHesabi;
    JButton seferUcreti;

    //=================== aracEkle =================//

    JFrame aracEkleFrame;
    JLabel aracEkleLabel;
    JTextField aracEkleYakitKmMaliyetiText;
    JTextField aracEkleKoltukSayisiText;
    JTextField aracEkleKullananPersonelText;
    JTextField aracEkleHizmetPersonelText;
    JTextField aracEkleAracTipiText;
    JTextField aracEkleBusicinyakitturuText;
    JButton aracEkleButton;

    //=================== aracSil ====================//

    JFrame aracSilFrame;
    JLabel aracSilLabel;
    JTextField aracSilAracIDText;
    JButton aracSilButton;

    public companyPanel()
    {

    }

    public companyPanel(int i)
    {
        geciciCompany = User.Companylar.get(i);

        menu = new JFrame("Firma Menü");

        menuLabel = new JLabel("İşlem Seçin");
        menuLabel.setBounds(100, 20, 100, 30);

        aracEkle = new JButton("Araç Ekle");
        aracEkle.setBounds(70, 60, 120, 30);
        aracEkle.addActionListener(this);

        aracListele = new JButton("Araç Listele");
        aracListele.setBounds(70, 100, 120, 30);
        aracListele.addActionListener(this);

        aracSil = new JButton("Araç Sil");
        aracSil.setBounds(70, 140, 120, 30);
        aracSil.addActionListener(this);

        karHesabi = new JButton("Kar Hesabi");
        karHesabi.setBounds(70, 180, 120, 30);
        karHesabi.addActionListener(this);

        seferUcreti = new JButton("Sefer Ucreti");
        seferUcreti.setBounds(70, 220, 120, 30);
        seferUcreti.addActionListener(this);

        menu.setLayout(null);
        menu.setSize(260, 350);
        menu.setVisible(true);

        menu.add(menuLabel);
        menu.add(aracEkle);
        menu.add(aracListele);
        menu.add(aracSil);
        menu.add(karHesabi);
        menu.add(seferUcreti);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == aracEkle)
        {
            aracEkleFrame = new JFrame();

            aracEkleLabel = new JLabel("Araç Ekle");
            aracEkleLabel.setBounds(100, 20, 100, 30);

            aracEkleYakitKmMaliyetiText = new JTextField("Yakit Km Maliyeti");
            aracEkleYakitKmMaliyetiText.setBounds(100, 60, 100, 30);

            aracEkleKoltukSayisiText = new JTextField("Koltuk Sayısi");
            aracEkleKoltukSayisiText.setBounds(100, 100, 100, 30);

            aracEkleKullananPersonelText = new JTextField("Kullanılan Personel");
            aracEkleKullananPersonelText.setBounds(100, 140, 100, 30);

            aracEkleHizmetPersonelText = new JTextField("Hizmet Personel");
            aracEkleHizmetPersonelText.setBounds(100, 180, 100, 30);

            aracEkleAracTipiText = new JTextField("Arac Tipi");
            aracEkleAracTipiText.setBounds(100, 220, 100, 30);

            aracEkleBusicinyakitturuText = new JTextField("Yakit Türü");
            aracEkleBusicinyakitturuText.setBounds(100, 260, 100, 30);

            aracEkleButton = new JButton("Tamam");
            aracEkleButton.setBounds(100, 340, 100, 30);
            aracEkleButton.addActionListener(this);

            aracEkleFrame.setLayout(null);
            aracEkleFrame.setSize(300, 420);
            aracEkleFrame.setVisible(true);

            aracEkleFrame.add(aracEkleLabel);
            aracEkleFrame.add(aracEkleYakitKmMaliyetiText);
            aracEkleFrame.add(aracEkleKoltukSayisiText);
            aracEkleFrame.add(aracEkleKullananPersonelText);
            aracEkleFrame.add(aracEkleHizmetPersonelText);
            aracEkleFrame.add(aracEkleAracTipiText);
            aracEkleFrame.add(aracEkleBusicinyakitturuText);
            aracEkleFrame.add(aracEkleButton);
        }

        if(e.getSource() == aracListele)
        {
           geciciCompany.araclistele();
        }

        if(e.getSource() == aracSil)
        {
            aracSilFrame = new JFrame();

            aracSilLabel = new JLabel("Silinecek araç ID girin:");
            aracSilLabel.setBounds(30, 20, 200, 30);

            aracSilAracIDText = new JTextField();
            aracSilAracIDText.setBounds(160, 20, 80, 30);

            aracSilButton = new JButton("Sil");
            aracSilButton.setBounds(100, 80, 80, 30);
            aracSilButton.addActionListener(this);

            aracSilFrame.setLayout(null);
            aracSilFrame.setSize(300, 170);
            aracSilFrame.setVisible(true);

            aracSilFrame.add(aracSilLabel);
            aracSilFrame.add(aracSilAracIDText);
            aracSilFrame.add(aracSilButton);
        }

        if(e.getSource() == aracEkleButton)
        {
            geciciCompany.aracEkle(Integer.parseInt(aracEkleYakitKmMaliyetiText.getText()),
                    Integer.parseInt(aracEkleKoltukSayisiText.getText()),
                    Integer.parseInt(aracEkleKullananPersonelText.getText()),
                    Integer.parseInt(aracEkleHizmetPersonelText.getText()),
                    aracEkleAracTipiText.getText(),
                    aracEkleBusicinyakitturuText.getText());

            aracEkleFrame.dispose();
        }

        if(e.getSource() == aracSilButton)
        {
            geciciCompany.aracSil(Integer.parseInt(aracSilAracIDText.getText()));

            aracSilFrame.dispose();
        }

    }

    @Override
    public void Login(boolean b)
    {
    }
}
