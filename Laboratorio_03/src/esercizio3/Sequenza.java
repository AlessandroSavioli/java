package esercizio3;

import java.util.Arrays;

public class Sequenza {

	private int[] dati;

	public Sequenza(int[] array) {
		dati = Arrays.copyOf(array, array.length);
	}

	public int getMediana() {
		int copia[] = Arrays.copyOf(dati, dati.length);
		Arrays.sort(copia);

		return copia[copia.length / 2];
	}

	public double getMedia() {
		double somma = 0;

		for (int i = 0; i < dati.length; i++) {
			somma += dati[i];
		}

		return somma / dati.length;
	}

	public int getModa() {
		int moda = dati[0];
		int maxConteggio = 0;

		for (int i = 0; i < dati.length; i++) {
			int conteggioCorrente = 0;

			for (int j = 0; j < dati.length; j++) {
				if (dati[j] == dati[i]) {
					conteggioCorrente++;
				}

				if (conteggioCorrente > maxConteggio) {
					maxConteggio = conteggioCorrente;
					moda = dati[i];
				}
			}
		}

		return moda;

	}

	public static void main(String[] args) {
		int[] numeri = { 10, 20, 30, 50, 20, 20, 10, 10, 10 };
		Sequenza s = new Sequenza(numeri);

		System.out.println(s.getMediana());
		System.out.println(s.getMedia());
		System.out.println(s.getModa());

	}

}
