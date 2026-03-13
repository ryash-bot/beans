/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;


public class P9 {
    public static void main(String[] args) {
        Pegawai[] Pegawai = new Pegawai[4];
        
        Pegawai[0] = new Pegawai("1203291", "1281249", "rifki", 20);
        Pegawai[1] = new Pegawai("120351", "128124353", "fauzan", 20);
        Pegawai[2] = new Pegawai("12032234", "1281223", "ale", 20);
        Pegawai[3] = new Pegawai("12032121", "12811319", "roykios", 20);
        
        for (Pegawai i : Pegawai) {
            System.out.println("Nomor Ktp = " + i.getNomorKtp());
            System.out.println("Nomor Ktp = " + i.getNomorBpjs());
            System.out.println("Nama = " + i.getNama());
            System.out.println("Umur = " +i.getUsia());
               
        
        }
    }
    
}
