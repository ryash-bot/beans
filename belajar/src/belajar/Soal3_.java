package If2b;

import java.util.Scanner;

public class Soal3_ {

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
		return 0;
	}else {
		return n/10 + soal1(n/10);
	}


}
}


	


