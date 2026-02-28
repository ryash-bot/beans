package belajar;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class netBeans {

	public static void main(String[] args) {
		Sekolah[] asalSekolahKu = new Sekolah[4];
	     asalSekolahKu[0] = new Sekolah();
	     asalSekolahKu[0].namaSekkolah = "SDN 14 Talang Ubi";
	     asalSekolahKu[0].alamatSekolah = "Handayani Mulya, Talang Ubi, Penukal Abab Lematang Ilir Regency, South Sumatra 31214";
	     asalSekolahKu[0].linkGMaps = "https://maps.app.goo.gl/9TQuNpB6WCcBc8598";
	     
	     asalSekolahKu[1] = new Sekolah();
	     asalSekolahKu[1].namaSekkolah = "SMP YKPP";
	     asalSekolahKu[1].alamatSekolah = "Talang Ubi, Muara Enim Regency, South Sumatra 31211";
	     asalSekolahKu[1].linkGMaps = "https://maps.app.goo.gl/uS5y8E4mS5LMWFBB8";
	     
	     asalSekolahKu[2] = new Sekolah();
	     asalSekolahKu[2].namaSekkolah = "SMKN 1 Talang Ubi";
	     asalSekolahKu[2].alamatSekolah = "Talang Ubi, Penukal Abab Lematang Ilir Regency, South Sumatra 31212";
	     asalSekolahKu[2].linkGMaps = "https://maps.app.goo.gl/ELAAE2QpFLJR2dxY7";
	   
	     asalSekolahKu[3] = new Sekolah();
	     asalSekolahKu[3].namaSekkolah = "Universitas Multi Data Palembang";
	     asalSekolahKu[3].alamatSekolah = "Jl. Rajawali No.14, 9 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30113";
	     asalSekolahKu[3].linkGMaps = "https://maps.app.goo.gl/EBVS3ifscX2VvPD9A";
	     
	     
	     
	     for (int i = 0; i < 4; i++) {
			asalSekolahKu[i].tampilDataMahasiswa ();
			System.out.println();
			
		}
	}

}
class Sekolah {
	String namaSekkolah;
	String alamatSekolah;
	String linkGMaps;
	void tampilDataMahasiswa() {
		String bb = "Nama Sekolah = " + namaSekkolah 
				+ "\nAlamat Sekolah" + alamatSekolah 
				+ "\nLink GMaps" + linkGMaps;
		System.out.println(bb);
//		System.out.println("Nama Sekolah = " + namaSekkolah);
//		System.out.println("Alamat Sekolah = " + alamatSekolah);
//		System.out.println("Link Gmaps = " + linkGMaps);
		JOptionPane.showMessageDialog(null, bb, "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
