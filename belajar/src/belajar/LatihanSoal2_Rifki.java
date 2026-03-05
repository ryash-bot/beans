package If2b;

import java.util.Scanner;

public class LatihanSoal2_Rifki {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0; 
	System.out.print("Masukan Jumlah Angsa = ");
	n = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Jumlah kaki Angsa = " + soal1(n));

	

}
public static int soal1(int n) {
	if (n == 0) {
		return 0;
		
	}else  {
		return 2 + soal1(n-1);
		
	}
}

}
