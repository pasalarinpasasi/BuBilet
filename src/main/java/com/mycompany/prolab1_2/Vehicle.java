package com.mycompany.prolab1_2;

import java.security.PublicKey;

public abstract class Vehicle {

    public String aractipi;
    public int aracID;
    public int koltukSayisi;
    public int yakitKmMaliyeti;
    public int yakitTuru; //0 = benzin, 1 = motorin, 2 = elektrik, 3 = gaz
    public int kullananPersonel;
    public int hizmetPersonel;
    public abstract int CalculateFuelCost(int kilometre);
    public abstract void getYakitTuru();
}
