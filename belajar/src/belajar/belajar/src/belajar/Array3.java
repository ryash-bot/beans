package belajar;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//deklarasi array
		int total = 0, max = 0, min = 0;
		double rata = 0;
		int[] angka = new int[5]; // ukuran array didefinisikan 
		
		//	int[] angka = {5, 9, 2, 1, 10}; ukuran array tergantung banyak data
		
		//pengisian 
		for (int i = 0; i< 5; i++)
		{
			System.out.print("masukan angka ke-" + (i+1) + " : ");
			angka[i] = sc.nextInt();
		}
		System.out.println("\ndata angka : ");
		for (int i = 0; i < angka.length; i++)
		{
			System.out.println("angka ke-1" + (i+1) + " = " + angka[i]);
			total = total + angka[i];
		}
		rata = total / angka.length;
		max = angka[0];
		min = angka[0];
		for (int i = 1; i < angka.length; i++)
		{
		    if (angka[i] >= max) 
		    
		    {
		        max = angka[i];
		    }
			
			if (angka[i] <= min)
			{
					min = angka[i];
			}
		
		}
		
		System.out.println("Nilai terbesar = " + max);
		System.out.println("Total angka = " + total);
		System.out.println("rata rata = " + rata);
		System.out.println("Nilai terbesar = " + max);
		System.out.println("Nilai terkecil = " + min);
		

	}

}
