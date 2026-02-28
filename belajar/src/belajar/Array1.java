package belajar;

public class Array1 {

	public static void main(String[] args) {

		
		//deklarasi 
		String[] nama = new String[5];
		//atauString nama[] = new Strin[5];
		//pengisian data
		nama[0] = "andi";
		nama[1] = "evan";
		nama[2] = "reyhan";
		nama[3] = "oza";
		nama[4] = "paga";

		//menampilkan data dari array 
	
		System.out.println("Data Mahasiswa =");
		for (int i = 0; i <5; i++)
		{
			System.out.println(nama[i]);
		}
	}

}
