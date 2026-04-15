package esercizio1;

public class GiocoDellOca {
	private Tabellone tabellone;
	private Giocatore[] giocatori;

	public GiocoDellOca(int nCaselle, String[] nomiGiocatori) {
		this.tabellone = new Tabellone(nCaselle);
		this.giocatori = new Giocatore[nomiGiocatori.length];

		for (int i = 0; i < nomiGiocatori.length; i++) {
			giocatori[i] = new Giocatore(nomiGiocatori[i], 0);
		}

		// Mettiamo tutti sulla casella di partenza
		tabellone.posizionaGiocatoriInizio(giocatori);
	}

	public void gioca() {
		boolean partitaFinita = false;
		int turno = 1;

		while (!partitaFinita) {
			System.out.println("--- TURNO " + turno + " ---");

			for (Giocatore g : giocatori) {
				tabellone.eseguiMossa(g);
				System.out.println(g.getNome() + " si trova ora sulla casella " + g.getPosizione() + " con "
						+ g.getPunti() + " punti.");

				// Controllo vittoria (chi arriva esattamente all'ultima casella)
				if (g.getPosizione() == tabellone.getN() - 1) {
					System.out.println("\n!!!! " + g.getNome().toUpperCase() + " HA VINTO IL GIOCO DELL'OCA !!!!");
					partitaFinita = true;
					break;
				}
			}

			System.out.println(tabellone.toString()); // Visualizziamo lo stato del tabellone
			turno++;
		}
	}

	public static void main(String[] args) {
		String[] nomi = { "Mario", "Luigi", "Peach" };
		GiocoDellOca gioco = new GiocoDellOca(30, nomi);
		gioco.gioca();
	}
}
