package esercizio2;

public class Istogramma {
	private int min, max;
	private int[] intervallo;

	public Istogramma(int min, int max) {
		if (min < max) {
			this.min = min;
			this.max = max;
			this.intervallo = new int[max - min + 1];
		} else {
			throw new IllegalArgumentException("Il min non può essere maggiore del max");
		}

	}

	public void aggiungi(int valore) {
		if (valore >= min && valore <= max) {
			intervallo[valore - min] += 1;
		}
	}

	public void stampaOrizzontale() {
		for (int i = 0; i < intervallo.length; i++) {
			System.out.println(i + min + ": " + "*".repeat(intervallo[i]));
		}
	}

	public void stampaVerticale() {
		int maxValore = 0;

		for (int i = 0; i < intervallo.length; i++) {
			if (intervallo[i] > maxValore) {
				maxValore = intervallo[i];
			}
		}

		for (int livello = maxValore; livello > 0; livello--) {
			for (int i = 0; i < intervallo.length; i++) {
				if (intervallo[i] >= livello) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}

			System.out.println();

		}

		for (int i = 0; i < intervallo.length; i++) {
			System.out.printf("%2d ", i + min);
		}

		System.out.println();

	}

	public static void main(String[] args) {
		Istogramma i = new Istogramma(0, 31);

		i.aggiungi(18);
		i.aggiungi(30);
		i.aggiungi(30);
		i.aggiungi(25);
		i.aggiungi(18);
		i.aggiungi(31);

		i.stampaOrizzontale();
		i.stampaVerticale();
	}

}
