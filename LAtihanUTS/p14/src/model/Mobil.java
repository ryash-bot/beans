/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Mobil extends mobilListrik {
    private String model;
    private int jumlahPintu;
    private String jenisBBM;

    public Mobil(Produsen produsen, String model, int jumlahPintu, String jenisBBM) {
        this.model = model;
        this.jumlahPintu = jumlahPintu;
        this.jenisBBM = jenisBBM;
    }

    public Mobil() {
        this.model = "-";
        this.jenisBBM = "-";
        this.jumlahPintu = 0;
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getJenisBBM() {
        return jenisBBM;
    }

    public void setJenisBBM(String jenisBBM) {
        this.jenisBBM = jenisBBM;
    }
    
}
