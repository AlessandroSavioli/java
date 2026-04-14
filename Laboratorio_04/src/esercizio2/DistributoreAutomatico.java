package esercizio2;

import java.util.Random;

public class DistributoreAutomatico {

	private final int N;
	private Prodotto[] prodotti;
	private double saldo;

	public DistributoreAutomatico(int N) {
		this.N = N;
		prodotti = new Prodotto[N];
		this.saldo = 0;
	}

	public void carica() {
		Random r = new Random();
		String[] ids = { "001", "002", "003" };

		for (int i = 0; i < N; i++) {
			String id = ids[r.nextInt(3)];

			switch (id) {
			case "001":
				prodotti[i] = new BottigliaDAcqua();
				break;

			case "002":
				prodotti[i] = new BarraDiCioccolato();
				break;

			case "003":
				prodotti[i] = new GommeDaMasticare();
			}

		}
	}

	public void inserisciImporto(double importo) {
		this.saldo += importo;
	}

	public Prodotto getProdotto(String id) {
		for (int i = 0; i < N; i++) {
			if (prodotti[i] != null) {
				if (prodotti[i].getId().equals(id)) {
					if (prodotti[i].getPrezzo() <= saldo) {
						saldo -= prodotti[i].getPrezzo();
						Prodotto p = prodotti[i];
						prodotti[i] = null;

						System.out.println("Acquisto effettuato!");
						return p;
					} else {
						System.out.println("Saldo insufficiente!");
						return null;
					}

				}
			}

		}

		System.out.println("Prodotto non trovato o esaurito!");
		return null;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getResto() {
		double resto = saldo;
		saldo = 0;

		return resto;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < N; i++) {
			if (prodotti[i] == null) {
				s += "VUOTO" + "\n";
			} else {
				s += prodotti[i].toString() + "\n";
			}
		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistributoreAutomatico d = new DistributoreAutomatico(5);
		d.carica();
		d.inserisciImporto(5.50);
		System.out.println(d.toString());
		d.getProdotto("003");
		System.out.println(d.toString());
		d.getProdotto("002");
		System.out.println(d.toString());
		System.out.println(d.getResto());
	}

}
