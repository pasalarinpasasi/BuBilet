package com.mycompany.prolab1_2;

public class Train extends Vehicle
{
    public Train(int yakitKmMaliyeti, int koltukSayisi, int kullananPersonel, int hizmetPersonel, int aracID)
    {
        this.aractipi = "Train";

        this.yakitTuru = 2;

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
        if (yakitTuru == 2)
            System.out.println("Yakıt Türü: Elektrik");
    }
}
