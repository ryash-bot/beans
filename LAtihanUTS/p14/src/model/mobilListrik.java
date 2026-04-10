/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class mobilListrik {
    private String kapasitasBatrei;

    public mobilListrik() {
        this.kapasitasBatrei = "-";
    }

    public mobilListrik(Produsen produsen, String model, int jumlahPintu, String jenisBBM, String kapasitasBatrei) {
        this.kapasitasBatrei = kapasitasBatrei;
    }

    public String getKapasitasBatrei() {
        return kapasitasBatrei;
    }

    public void setKapasitasBatrei(String kapasitasBatrei) {
        this.kapasitasBatrei = kapasitasBatrei;
    }

  
  }

