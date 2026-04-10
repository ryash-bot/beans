/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author user1
 */
public class Latihan {
    public static void main(String[] args){
    Produsen toyota = new Produsen("Toyota", "Jepang");
    Produsen ryh = new Produsen("rifki", "Indonesia");
    
    Mobil[] mobil = new Mobil[4];
    mobil[0] = new Mobil(ryh, 2025, "maxta", 4, "diesel");
    mobil[1] = new Mobil(toyota, 2024, "granda",  5,  "bensin");
    mobil[2] = new Mobil(ryh, 2026, "zen", 6, "listrik", 20000);
    mobil[3] = new Mobil(toyota, 2025, "maxta", 4, "hyabrid", 24000);
    
    for (Mobil m : mobil){
        System.out.println("Produsen\t:" + m.getProdusen().getNamaBarang() + "-" + m.getProdusen().getNegara);
    
    }
    }
    
}
