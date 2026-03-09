package IF2b;

public class Kasus_Perkalian_Matriks {
	public static int[][] perkalianMatriks(int[][] A, int[][] B, int n) {
		int[][] C = new int [n][n];
		
		if (n == 1) {
			C[0][0] = A[0][0] * B[0][0];
		} else {
			int ukuranBaru = n/2;
			int[][] A11 = new int[ukuranBaru][ukuranBaru];
			int[][] A12 = new int[ukuranBaru][ukuranBaru];
			int[][] A21 = new int[ukuranBaru][ukuranBaru];
			int[][] A22 = new int[ukuranBaru][ukuranBaru];
			
			int[][] B11 = new int[ukuranBaru][ukuranBaru];
			int[][] B12 = new int[ukuranBaru][ukuranBaru];
			int[][] B21 = new int[ukuranBaru][ukuranBaru];
			int[][] B22 = new int[ukuranBaru][ukuranBaru];
			
			bagiMatriks(A, A11, 0, 0);
			bagiMatriks(A, A12, 0, ukuranBaru);
			bagiMatriks(A, A21, ukuranBaru, 0);
			bagiMatriks(A, A22, ukuranBaru, ukuranBaru);
			
			bagiMatriks(B, B11, 0, 0);
			bagiMatriks(B, B12, 0, ukuranBaru);
			bagiMatriks(B, B21, ukuranBaru, 0);
			bagiMatriks(B, B22, ukuranBaru, ukuranBaru);
			
		}
	}
	public static int[][] tambahMatris(int[][] A, int[][]B) {
		int n = A.length;
		int[][] C = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0 ; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
	}
	
	public static void bagiMatriks(int[][] matriks, int[][] C, int iBaru, int jBaru) {
		for (int i = 0; i < C.length; i++) {
			for (int j=0; j < C.length;j++) {
				C[i][j] = matriks[i + iBaru][j + jBaru];
			}
		}
		
	}
	
	public static void main(String[] args) {

	}

}
