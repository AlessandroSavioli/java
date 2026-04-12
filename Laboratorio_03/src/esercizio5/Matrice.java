package esercizio5;

import java.util.Random;

public class Matrice {
	private int[][] matrice;
	private int n;

	public Matrice(int n) {
		matrice = new int[n][n];
		this.n = n;
	}

	public void randValues() {
		Random r = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrice[i][j] = r.nextInt(10);
			}
		}

	}

	public void stampaMatrice() {
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < n; j++) {
				if (j != n - 1) {
					System.out.print(matrice[i][j] + ", ");
				} else {
					System.out.print(matrice[i][j]);
				}
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		Matrice m = new Matrice(6);

		m.randValues();
		m.stampaMatrice();
	}

}
