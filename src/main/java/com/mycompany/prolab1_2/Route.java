package com.mycompany.prolab1_2;

public class Route
{
    String baslangic;
    String ulasimaraci;
    String varis;
    public int Bus(String baslangic, String varis){
        int i = -1;
        int j = -1;


        String[] karayoluSehirler = {"Istanbul", "Kocaeli", "Ankara", "Eskisehir", "Konya"};
        int[][] karayoluMatris = {
                {0, 100, 500, 300, 600},
                {100, 0, 400, 200, 500},
                {500, 400, 0, 0, 0},
                {300, 200, 0, 0, 300},
                {600, 500, 0, 300, 0}
        };

        for (int x = 0; x < karayoluSehirler.length; x++) {
            if (karayoluSehirler[x].equalsIgnoreCase(baslangic)) {
                i = x;
                break;
            }
        }

        for (int x = 0; x < karayoluSehirler.length; x++) {
            if (karayoluSehirler[x].equalsIgnoreCase(varis)) {
                j = x;
                break;
            }
        }

        return karayoluMatris[i][j];
    }
    public int Train(String baslangic, String varis){
        int i = -1;
        int j = -1;
        String[] demiryoluSehirler = {"Istanbul", "Kocaeli", "Bilecik", "Ankara", "Eskisehir", "Konya"};
        int[][] demiryoluMatris = {
                {0, 75, 225, 375, 300, 450},
                {75, 0, 75, 300, 150, 350},
                {225, 75, 0, 225, 75, 300},
                {375, 300, 225, 0, 150, 0},
                {300, 150, 75, 150, 0, 225},
                {450, 350, 300, 0, 225, 0}
        };

        for (int x = 0; x < demiryoluSehirler.length; x++) {
            if (demiryoluSehirler[x].equalsIgnoreCase(baslangic)) {
                i=x;
                break;
            }
        }
        for (int x = 0; x < demiryoluSehirler.length; x++) {
            if (demiryoluSehirler[x].equalsIgnoreCase(varis)) {
                j=x;
                break;
            }
        }

        return demiryoluMatris[i][j];
    }

    public int Airplane(String baslangic, String varis){
        int i = -1;
        int j = -1;
        String[] havayoluSehirler = {"Istanbul", "Ankara", "Konya"};
        int[][] havayoluMatris = {
                {0, 250, 300},
                {250, 0, 0},
                {300, 0, 0}
        };
        for (int x = 0; x < havayoluSehirler.length; x++) {
            if (havayoluSehirler[x].equalsIgnoreCase(baslangic)) {
                i=x;
                break;
            }
        }

        for (int x = 0; x < havayoluSehirler.length; x++) {
            if (havayoluSehirler[x].equalsIgnoreCase(varis)) {
                j=x;
                break;
            }
        }

        return havayoluMatris[i][j];
    }

    public Route(String baslangic, String ulasimaraci, String varis) {
        this.baslangic = baslangic;
        this.ulasimaraci = ulasimaraci;
        this.varis = varis;
    }
    public int kilometre(String baslangic, String ulasimaraci, String varis){
        if(this.ulasimaraci == "Bus"){
            return this.Bus(this.baslangic, this.varis);
        }
        if(this.ulasimaraci == "Train"){
            return this.Train(this.baslangic, this.varis);
        }
        if(this.ulasimaraci == "Airplane"){
            return this.Airplane(this.baslangic, this.varis);
        }

        return -1;
    }
}
