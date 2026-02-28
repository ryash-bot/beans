package belajar;

public class Array2 {

	public static void main(String[] args) {
		//pengisian data ke array langsung saat deklarasi
		int[] angka = {5, 9, 2, 1, 10};
		
		System.out.println(angka [3]);
		
		int cari = 10;
		int indexCari = 0;
		
		for (int i = 0; i < 5; i++)
		{
			if (cari == angka[i])
			{
				indexCari = i;
			}
		}
		System.out.println( "Angka "+ cari +" ada di indexke-" + indexCari);

	}

}
