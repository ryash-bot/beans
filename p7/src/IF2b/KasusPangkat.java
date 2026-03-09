package IF2b;

public class KasusPangkat {
	public static int pangkat(int a, int n) {
		if (n == 0) {
			return 1;
		} else {
			if (n % 2 ==0) {
				return pangkat(a, n/2) * pangkat (a, n/2);
			} else {
				return pangkat(a, n/2) * pangkat (a, n/2) * a;
			}
		}
	}

	public static void main(String[] args) {
		int angka = 2;
		int pangkat = 10;
		
		System.out.println(angka + "^" + pangkat + "=" + pangkat(angka, pangkat));
		

	}

}
