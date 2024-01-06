package com.mycompany.prolab1_2;

import java.util.ArrayList;

public class Trip
{
    String aracID;
    String seferzamani;
    String toplamucret;
    String aractipi;
    String toplamkm;
    String[] guzergah;

    public Trip(String aracID, String seferzamani, String aractipi, int kacincisefer) {
        this.aracID = aracID;
        this.seferzamani = seferzamani;
        this.aractipi = aractipi;
        if(kacincisefer == 1){
            this.guzergah = new String[]{"Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Ankara", "Eskisehir", "Bilecik", "Kocaeli", "Istanbul" };

        }
        if(kacincisefer == 2){
            this.guzergah = new String[]{"Istanbul", "Kocaeli", "Bilecik", "Eskisehir", "Konya", "Eskisehir", "Bilecik", "Kocaeli", "Istanbul" };

        }
        if(kacincisefer == 3){
            this.guzergah = new String[]{"Istanbul", "Kocaeli", "Ankara", "Kocaeli", "Istanbul", "Kocaeli", "Ankara", "Kocaeli", "Istanbul"};


        }
        if(kacincisefer == 4){
            this.guzergah = new String[]{"Istanbul", "Kocaeli", "Eski¸sehir", "Konya", "Eskisehir", "Kocaeli", "Istanbul"};

        }
        if(kacincisefer == 5){
            this.guzergah = new String[]{"Istanbul", "Konya", "Istanbul"};


        }
        if(kacincisefer == 6){
            this.guzergah = new String[]{"Istanbul", "Ankara", "Istanbul"};

        }

    }

}