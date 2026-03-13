/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;


public class Pegawai extends Person{
    private String nomorKtp;
    private String nomorBpjs;

    public Pegawai(String nomorKtp, String nomorBpjs, String nama, int usia) {
        super(nama, usia);
        this.nomorKtp = nomorKtp;
        this.nomorBpjs = nomorBpjs;
       
    }
    public Pegawai(String nomorKtp, String nomorBpjs) {
        this.nomorKtp = nomorKtp;
        this.nomorBpjs = nomorBpjs;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    public String getNomorBpjs() {
        return nomorBpjs;
    }

    public void setNomorBpjs(String nomorBpjs) {
        this.nomorBpjs = nomorBpjs;
    }
    
    
    
    
    
}
