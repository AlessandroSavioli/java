package eCommerce;

import java.util.ArrayList;

public class Carrello {

	private ArrayList<Prodotto> carrello;

	public Carrello() {
		carrello = new ArrayList<Prodotto>();
	}

	public String toString() {
		String s = "Carrello: ";

		for (Prodotto p : carrello) {
			s += p.getClass().getSimpleName() + " ";
		}

		return s;
	}

	public void aggiungiProdotto(Prodotto p) {
		carrello.add(p);
	}

	public void checkout(Utente u) {
		double conto = 0;

		for (Prodotto p : carrello) {
			conto += p.calcolaPrezzo();
		}

		if (u.getPuntiFedeltà() >= 50) {
			u.sottraiPunti(50);
			if (conto > 5) {
				conto -= 5;
			} else {
				conto = 0;
			}
		}

		u.aggiungiPunti(conto);

		carrello.clear();
		;
	}
}
