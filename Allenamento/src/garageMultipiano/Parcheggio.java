package garageMultipiano;

import java.util.ArrayList;

public class Parcheggio {
	private ArrayList<Veicolo> posti;
	private double guadagnoTotale;

	public Parcheggio() {
		posti = new ArrayList<Veicolo>();
		guadagnoTotale = 0;
	}

	public void aggiungiVeicolo(Veicolo v) {

		if (posti.size() < 10) {
			posti.add(v);
		} else {
			System.out.println("Il parcheggio è pieno! riprovare più tardi!");
		}
	}

	public void rimuoviVeicolo(String targa) {
		for (Veicolo v : posti) {
			if (v.getTarga().equals(targa)) {
				double guadagno = v.calcolaTariffa();
				guadagnoTotale += guadagno;

				posti.remove(v);
				System.out.println(
						"Rimosso veicolo, tipo veicolo: " + v.getClass().getSimpleName() + ", targa: " + v.getTarga());
				return;
			}
		}

		System.out.println("Veicolo non trovato!");

	}

	public double getGuadagnoTotale() {
		return guadagnoTotale;
	}

	public static void main(String[] args) {
		Veicolo opel_adam = new Auto("TZ999UV", 2);
		Veicolo ducati_panigale = new Moto("FZ123PE", 5);
		Veicolo fiat_doblo = new Furgone("LU888RZ", 10);

		Parcheggio p = new Parcheggio();
		p.aggiungiVeicolo(ducati_panigale);
		p.aggiungiVeicolo(fiat_doblo);
		p.aggiungiVeicolo(opel_adam);

		p.rimuoviVeicolo("FZ123PE");
		p.rimuoviVeicolo("LU888RZ");

		System.out.println("Fino ad ora il parcheggio ha guadagnato: " + p.getGuadagnoTotale() + " euro.");

		p.rimuoviVeicolo("GH123GH");
		p.rimuoviVeicolo("TZ999UV");

		System.out.println("Fino ad ora il parcheggio ha guadagnato: " + p.getGuadagnoTotale() + " euro.");
	}
}
