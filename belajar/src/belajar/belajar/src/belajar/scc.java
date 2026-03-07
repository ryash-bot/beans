package belajar;
import java.util.Scanner;
public class scc {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	//deklarasi variable
	String nama, npm, alamat ;
	int umur;
	
	//input data penggguna
	System.out.print("Masukan Nama \t: ");
	nama = input.nextLine();
	System.out.print("Masukan NPM \t: ");
	npm = input.nextLine();
	System.out.print("Masukan Umur \t: ");
	umur = input.nextInt();
	input.nextLine();
	System.out.print("Masukan Alamat \t: ");
	alamat = input.nextLine();
	
	//output
	System.out.println("\n=====BIODATA=====");
	System.out.println("Nama \t= " + nama);
	System.out.println("NPM \t= " + npm);
	System.out.println("Umur \t= " + umur);
	System.out.println("Alamat \t= " + alamat);
 }
	
}
