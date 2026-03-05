package If2b;

import java.util.Scanner;

public class Rifki_pbo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		System.out.print("n = ");
		n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Output = " + soal1(n));
	
		

	}
	public static int soal1(int n) {
		if (n == 0) {
			
		}else if (n % 10 == 9) {
			return 1+ soal1(n/10);
		}
		else {
			return soal1(n/10);
		}
		return n;
		
	}

}
