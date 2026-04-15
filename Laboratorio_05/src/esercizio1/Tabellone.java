package esercizio1;

import java.util.ArrayList;
import java.util.Random;

public class Tabellone {
	private final int N;
	private Casella[] tabelloneCaselle;
	private ArrayList<Giocatore>[] tabelloneGiocatori;

	@SuppressWarnings("unchecked")
	public Tabellone(int N) {
		this.N = N;
		this.tabelloneCaselle = new Casella[N];
		this.tabelloneGiocatori = (ArrayList<Giocatore>[]) new ArrayList[N];

		for (int i = 0; i < N; i++) {
			tabelloneGiocatori[i] = new ArrayList<Giocatore>();
		}

		Random r = new Random();

		for (int i = 0; i < N; i++) {
			if (i == 0 || i == N - 1) {
				tabelloneCaselle[i] = new CasellaVuota();
			} else {
				int scelta = r.nextInt(3);

				switch (scelta) {
				case 0:
					tabelloneCaselle[i] = new CasellaVuota();
					break;
				case 1:
					int spostamento = r.nextInt(-3, 4);
					if (spostamento == 0) {
						spostamento = 1;
					}
					tabelloneCaselle[i] = new CasellaSpostaGiocatore(spostamento);
					break;
				case 2:
					int punti = r.nextInt(-3, 4);
					if (punti == 0) {
						punti = 1;
					}
					tabelloneCaselle[i] = new CasellaPunti(punti);
					break;
				}
			}
		}
	}

	public int getN() {
		return N;
	}

	public void eseguiMossa(Giocatore g) {
		int vecchiaPos = g.getPosizione();
		int lancio = g.tiraDadi(2);

		int nuovaPos = vecchiaPos + lancio;
		nuovaPos = checkRimbalzo(nuovaPos);

		aggiornaPosizione(g, vecchiaPos, nuovaPos);

		tabelloneCaselle[nuovaPos].applicaEffetto(g);

		int posDopoEffetto = g.getPosizione();
		if (posDopoEffetto != nuovaPos) {
			posDopoEffetto = checkRimbalzo(posDopoEffetto);
			aggiornaPosizione(g, nuovaPos, posDopoEffetto);
		}
	}

	private int checkRimbalzo(int pos) {
		if (pos >= N) {
			int eccedenza = pos - (N - 1);
			return (N - 1) - eccedenza;
		}
		if (pos < 0)
			return 0;
		return pos;
	}

	public void posizionaGiocatoriInizio(Giocatore[] giocatori) {
		for (Giocatore g : giocatori) {
			g.setPosizione(0);

			tabelloneGiocatori[0].add(g);
		}
	}

	public void aggiornaPosizione(Giocatore g, int vecchiaPos, int nuovaPos) {
		tabelloneGiocatori[vecchiaPos].remove(g);
		tabelloneGiocatori[nuovaPos].add(g);

		g.setPosizione(nuovaPos);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("Casella ").append(i).append(" [").append(tabelloneCaselle[i].getClass().getSimpleName())
					.append("]: ");
			for (Giocatore g : tabelloneGiocatori[i]) {
				sb.append(g.getNome()).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
