/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lenovo
 */
public class Soal1B {
    String namaBarang;
    double hargaBarang;
    int jumlahBarang;

    Soal1B (String namaBarang, double hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

     public double hitungTotal() {
        return hargaBarang * jumlahBarang;
    }

     public double hitungDiskon() {
        double total = hitungTotal();
        if (total >= 50000) {
            return total * 0.1;
        } else {
            return 0;
        }
    }
     public void tampilkanInfo() {
        double total = hitungTotal();
        double diskon = hitungDiskon();
        double bayar = total - diskon;

        System.out.println("Barang: " + namaBarang);
        System.out.println("Jumlah: " + jumlahBarang);
        System.out.println("Total Belanja: Rp " + total);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Bayar: Rp " + bayar);
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {   
        Soal1B rifki1 = new Soal1B("Buku", 25000, 13);
        Soal1B rifki2 = new Soal1B("Pulpen", 5000, 12);
        Soal1B rifki3 = new Soal1B("Tas", 150000, 1);
        rifki1.tampilkanInfo();
        rifki2.tampilkanInfo();
        rifki3.tampilkanInfo();
    }

}
