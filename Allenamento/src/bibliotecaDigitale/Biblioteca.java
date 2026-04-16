package bibliotecaDigitale;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Risorsa> risorsePossedute;

	public Biblioteca() {
		risorsePossedute = new ArrayList<Risorsa>();
	}

	public void aggiungiRisorsa(Risorsa r) {
		risorsePossedute.add(r);
	}

	public void prestaRisorsa(Utente u, String codice) {
		for (Risorsa r : risorsePossedute) {
			if (r.getCodiceUnivoco().equals(codice)) {
				if (r.getIsInPrestito() == false) {
					if (u.getRisorseInPrestito().size() < 3) {
						u.aggiungiRisorsaInPrestito(r);
						r.setIsInPrestito(true);
						System.out.println("L'utente " + u.getNome() + " ha preso in prestito la risorsa "
								+ r.getClass().getSimpleName() + ": " + r.getTitolo()
								+ ". Dovrà restituirla entro il giorno "
								+ (LocalDate.now().plusDays(r.getDurataMassimaPrestito())));
						return;
					} else {
						System.out.println("L'utente " + u.getNome() + " ha già 3 risorse in prestito!");
						return;
					}

				} else {
					System.out.println("La risorsa cercata è già in prestito!");
					return;
				}
			}
		}

		System.out.println("La risorsa cercata non è presente in questa biblioteca");
	}

	public void ritiraRisorsa(Utente u, String codice) {
		for (Risorsa r : u.getRisorseInPrestito()) {
			if (r.getCodiceUnivoco().equals(codice)) {
				u.rimuoviRisorsaInPrestito(r);
				r.setIsInPrestito(false);
				System.out.println(
						"Risorsa " + r.getClass().getSimpleName() + ": " + r.getTitolo() + " ritirata correttamente!");
				return;
			}
		}

		System.out.println("L'utente sta cercando di restituire una risorsa che non ha.");
	}
}
