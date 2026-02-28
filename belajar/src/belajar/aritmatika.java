package belajar;

import java.util.Scanner;

public class aritmatika {

	public static void main(String[] args) {
		Scanner ry = new Scanner(System.in);
		//deklarasi data
		
		Double panjang, lebar, luas;
		Double ty = 0.5;
		//input datanya
		System.out.print("Masukan Nilai P : ");
		panjang = ry.nextDouble();
		System.out.print("Masukan Nilai L : ");
		lebar = ry.nextDouble();
		//output
		luas = panjang * lebar + ty;
		System.out.print("Hasilnya P*L+T = " + luas);
		
		
		

	}

}
