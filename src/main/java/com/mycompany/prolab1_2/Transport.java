package com.mycompany.prolab1_2;

import java.util.ArrayList;

public class Transport implements IReservable
{
    static String aracID;
    static String seferzamani;
    String toplamucret;
    static String aractipi;
    String toplamkm;
    String[] guzergah;
    static int kacincisefer;
    public static ArrayList<Vehicle> transportaraclar = Company.araclar;
    public static ArrayList<Company> firmalistesi = Admin.Companylar;
    public static ArrayList<Trip> seferListesi = new ArrayList<>();


    @Override
    public int reservation() {
        return 0;
    }

    @Override
    public int reservable() {
        return 0;
    }
}
