package com.mycompany.prolab1_2;

public class Bus extends Vehicle
{
    public Bus(String yakitTuru, int yakitKmMaliyeti, int koltukSayisi, int kullananPersonel, int hizmetPersonel, int aracID)
    {
        this.aractipi = "Bus";

        if (yakitTuru == "Benzin")
            this.yakitTuru = 0;

        if (yakitTuru == "Motorin")
            this.yakitTuru = 1;

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
        if (yakitTuru == 0)
            System.out.println("Yakıt Türü: Benzin");

        if (yakitTuru == 1)
            System.out.println("Yakıt Türü: Motorin");
    }
}
