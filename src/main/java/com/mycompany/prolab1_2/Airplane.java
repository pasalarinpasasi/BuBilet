package com.mycompany.prolab1_2;

public class Airplane extends Vehicle
{
    public Airplane(int yakitKmMaliyeti, int koltukSayisi, int kullananPersonel, int hizmetPersonel, int aracID)
    {
        this.aractipi = "Airplane";

        this.yakitTuru = 3;

        this.yakitKmMaliyeti = yakitKmMaliyeti;

        this.koltukSayisi = koltukSayisi;

        this.kullananPersonel = kullananPersonel;

        this.hizmetPersonel = hizmetPersonel;

        this.aracID = aracID;
    }

    @Override
    public int CalculateFuelCost(int kilometre)
    {
        return kilometre * yakitKmMaliyeti;
    }

    @Override
    public void getYakitTuru()
    {
        if (yakitTuru == 3)
            System.out.println("Yakıt Türü: Gaz");
    }
}
