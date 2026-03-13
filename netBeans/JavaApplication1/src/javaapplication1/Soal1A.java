/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lenovo
 */
public class Soal1A { 
    public static double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    public static double hitungDiskon(double total) {
        if (total >= 50000) {
            return total * 0.1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] barang = {"Buku", "Pulpen", "Tip X"};
        double[] harga = {20000, 5000, 1500};
        int[] jumlah = {20, 1, 1};

        for (int i = 0; i < barang.length; i++) {
            double totalBelanja = hitungTotal(harga[i], jumlah[i]);
            double diskon = hitungDiskon(totalBelanja);
            double totalBayar = totalBelanja - diskon;

            System.out.println("Barang: " + barang[i]);
            System.out.println("Jumlah: " + jumlah[i]);
            System.out.println("Total Belanja: Rp " + totalBelanja);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total Bayar: Rp " + totalBayar);
            System.out.println("----------------------------");
        }
    }
}

 

