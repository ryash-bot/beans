/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class kendaraan {
    private int tahunPembuatan;
    private Produsen produsen;

    public kendaraan() {
    }

    public kendaraan(int tahunPembuatan, Produsen produsen) {
        this.tahunPembuatan = tahunPembuatan;
        this.produsen = produsen;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public Produsen getProdusen() {
        return produsen;
    }

    public void setProdusen(Produsen produsen) {
        this.produsen = produsen;
    }
    
    
}
