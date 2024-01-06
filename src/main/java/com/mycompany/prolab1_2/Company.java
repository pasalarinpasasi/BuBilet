package com.mycompany.prolab1_2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Company extends User implements IProfitable {
    boolean loginable = false;
    public String USERNAME;
    public String PASSWORD;
    public static ArrayList<Vehicle> araclar = new ArrayList<>();

    static
    {
        araclar.add(new Train(15, 25, 3000, 2000, 4513));
    }

    JFrame firmaGoruntuleFrame;
    JTable firmaGoruntuleTablo;
    JScrollPane firmaGoruntulePane;
    Object[][] data;
    Object[] column = {"Araç Tipi", "Araç ID"};

    public Company(String username, String password)
    {
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public void aracEkle(int yakitKmMaliyeti, int koltukSayisi, int kullananPersonel, int hizmetPersonel,
                         String aractipi, String busicinyakitturu)
    {
        Random r = new Random();
        int aracID = r.nextInt(10000);

        if(Objects.equals(aractipi, "Train")){
            araclar.add(new Train(yakitKmMaliyeti, koltukSayisi, kullananPersonel, hizmetPersonel, aracID));
        }
        if(Objects.equals(aractipi, "Bus")){
            araclar.add(new Bus(busicinyakitturu, yakitKmMaliyeti, koltukSayisi, kullananPersonel, hizmetPersonel, aracID));
        }
        if(Objects.equals(aractipi, "Airplane")){
            araclar.add(new Airplane(yakitKmMaliyeti, koltukSayisi, kullananPersonel, hizmetPersonel, aracID));
        }
    }

    public void araclistele(){
        data = new Object[araclar.size()][2];
        firmaGoruntuleFrame = new JFrame();

        for (int i = 0; i < araclar.size(); i++)
        {
            data[i][0] = araclar.get(i).aractipi;
            data[i][1] = araclar.get(i).aracID;
        }

        firmaGoruntuleTablo = new JTable(data, column);
        firmaGoruntuleTablo.setBounds(30, 40, 200, 300);

        firmaGoruntulePane = new JScrollPane(firmaGoruntuleTablo);

        firmaGoruntuleFrame.add(firmaGoruntulePane);
        firmaGoruntuleFrame.setSize(300,400);
        firmaGoruntuleFrame.setVisible(true);
    }

    public void aracSil(int aranacakaracID)
    {
        for (int i = 0; i < araclar.size(); i++)
        {
            if(araclar.get(i).aracID == aranacakaracID){
                araclar.remove(i);
            }
        }
    }

    public int karHesabi()
    {

        return 0;
    }

    public void seferUcreti()
    {

    }



    @Override
    public void Login(boolean b)
    {
        //if (this.USERNAME == username && this.PASSWORD == password)
    }
}