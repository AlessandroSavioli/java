package velocipide;

public class Main {
	public static void main(String[] args) {
		// 1. Inizializzazione della Stazione e delle Biciclette
		Stazione stazioneCentrale = new Stazione("Piazza Duomo", 3);

		Bicicletta b1 = new Bicicletta("B-001", StatoBici.DISPONIBILE);
		Bicicletta b2 = new Bicicletta("B-002", StatoBici.DISPONIBILE);
		Bicicletta b3 = new Bicicletta("B-003", StatoBici.GUASTA);
		Bicicletta b4 = new Bicicletta("B-004", StatoBici.DISPONIBILE);

		System.out.println("--- Fase 1: Caricamento Stazione ---");
		try {
			stazioneCentrale.ancoraBici(b1);
			stazioneCentrale.ancoraBici(b2);
			stazioneCentrale.ancoraBici(b3);
			System.out
					.println("Bici caricate correttamente. Spazio rimanente: " + stazioneCentrale.getSpazioRimanente());

			// Tentativo di aggiungere una quarta bici (superando la capacità)
			stazioneCentrale.ancoraBici(b4);
		} catch (SpazioTerminatoException e) {
			System.err.println("Errore previsto: " + e.getMessage());
		}

		System.out.println("\n--- Fase 2: Inizio Noleggio ---");
		Noleggio noleggioAttivo = null;
		try {
			String codiceDaRitirare = "B-001";

			// Verifichiamo lo stato prima del ritiro
			System.out.println("Cerco di ritirare la bici: " + codiceDaRitirare);

			// Cerchiamo l'oggetto bici per passarlo al costruttore di Noleggio
			// (In un sistema reale cercheresti l'oggetto nella lista della stazione)
			Bicicletta biciRitirata = null;
			for (Bicicletta b : stazioneCentrale.getBici()) {
				if (b.getCodice().equals(codiceDaRitirare)) {
					biciRitirata = b;
					break;
				}
			}

			if (biciRitirata != null) {
				stazioneCentrale.RitiraBici(codiceDaRitirare);
				noleggioAttivo = new Noleggio(biciRitirata, "Alessandro");
				System.out.println("Noleggio iniziato per: " + codiceDaRitirare);
				System.out.println("Stato bici ora: " + biciRitirata.getStato());
			}

		} catch (BiciNonTrovataException e) {
			System.err.println("Errore: " + e.getMessage());
		}

		// 3. Simulazione del tempo che passa
		System.out.println("\n--- Fase 3: Simulazione viaggio ---");
		try {
			System.out.println("L'utente sta pedalando...");
			Thread.sleep(2000); // Aspettiamo 2 secondi per il test
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 4. Chiusura Noleggio e Calcolo Costo
		System.out.println("\n--- Fase 4: Fine Noleggio ---");
		if (noleggioAttivo != null) {
			noleggioAttivo.chiudiNoleggio(stazioneCentrale);

			// Nota: calcolaCosto usa i minuti, quindi con 2 secondi di sleep darà 0.0
			// Per testare costi reali dovresti aspettare almeno un minuto o modificare il
			// metodo in toSeconds()
			double costo = noleggioAttivo.calcolaCosto(2.50); // Tariffa 2.50€/ora

			System.out.println("Bici riconsegnata.");
			System.out.println("Costo del noleggio: " + costo + "€");
			System.out.println("Stato bici ora: " + noleggioAttivo.getBici().getStato());
			System.out.println("Spazio in stazione dopo riconsegna: " + stazioneCentrale.getSpazioRimanente());
		}

		// 5. Test tentativo di ritiro bici guasta
		System.out.println("\n--- Fase 5: Test sicurezza (Ritiro bici guasta) ---");
		try {
			stazioneCentrale.RitiraBici("B-003"); // La B-003 è GUASTA
		} catch (BiciNonTrovataException e) {
			System.err.println(e.getMessage());
		}
	}
}