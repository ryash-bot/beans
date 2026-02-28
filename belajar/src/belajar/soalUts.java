package belajar;
import java.util.Scanner;
public class soalUts {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String kodeMerek, merekMotor, kodeJenis, jenis, jenisPembayaran;
	int jumlah, harga, subTotal, total = 0;

	
	System.out.print("Masukan Kode Merek (S/Y/H) = ");
	kodeMerek = sc.nextLine().toUpperCase(); 
	
	System.out.print("Masukan Kode Merek (S/M/B) = ");
	kodeJenis = sc.nextLine().toUpperCase();
	
	System.out.print("Berapa Motor Yang Di Beli = ");
	jumlah = sc.nextInt(); 
	
	System.out.print("Menggunakan pembayaran (Cash/Credit) = ");
	jenisPembayaran = sc.nextLine().toUpperCase();
	
	
	if (kodeMerek == "S")
	{
		merekMotor ="Suzuki";
		kodeJenis = "S";
		jenis = "Sport";
		harga = 220000;
		
	}
	
	
	}

}
