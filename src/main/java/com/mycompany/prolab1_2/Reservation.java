package com.mycompany.prolab1_2;

public class Reservation
{
    Node head;



    static class Node
    {
        int data;
        int gun;
        int koltukNumarasi;
        int aracPlaka;
        Passenger Yolcu;

        Node next;

        Node(Passenger yolcu, Vehicle arac, int koltukNumarasi, int gun)
        {
            this.aracPlaka = arac.aracID;
            this.gun = gun;
            this.koltukNumarasi = koltukNumarasi;
            Yolcu = new Passenger(yolcu.AD, yolcu.SOYAD, yolcu.ID, yolcu.dogumTarihi);

            data = Integer.parseInt(Yolcu.ID);
            next = null;
        }
    }

    public static Reservation ekle(Reservation reservation, Passenger yolcu, Vehicle arac, int koltukNumarasi, int gun)
    {
        Node new_node = new Node(yolcu, arac, koltukNumarasi, gun);

        if (reservation.head == null)
        {
            reservation.head = new_node;
        }
        else
        {
            Node last = reservation.head;
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
        }

        return reservation;
    }

    public static void printReservation(Reservation reservation)
    {

    }
}
