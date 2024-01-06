package com.mycompany.prolab1_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class User implements ILoginable
{
    public boolean loginable = false;
    String USERNAME;
    String PASSWORD;
    public static ArrayList<Company> Companylar = new ArrayList<>();
    public static ArrayList<Integer> hizmetBedeli = new ArrayList<>();
}
