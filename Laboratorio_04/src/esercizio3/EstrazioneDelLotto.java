package esercizio3;

import java.util.Random;

public class EstrazioneDelLotto {

	private int[] estrazione = new int[5];
	private int sommaNumeriEstratti = 0;
	private int numeroEstrazioni = 0;

	public void estrai() {
		Random r = new Random();
		numeroEstrazioni++;
		for (int i = 0; i < 5; i++) {
			int numero = r.nextInt(1, 91);
			estrazione[i] = numero;
			sommaNumeriEstratti += numero;
		}
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < 5; i++) {
			if (i < 4) {
				s += estrazione[i] + ", ";
			} else {
				s += estrazione[i];
			}

		}

		return s;
	}

	public int numeriContenuti(int[] giocata) {
		int conteggio = 0;
		if (giocata.length > 10) {
			System.out.println("Le giocate possono avere al massimo 10 numeri");
			return 0;
		} else {
			for (int numeroGiocato : giocata) {
				for (int numeroUscito : estrazione) {
					if (numeroGiocato == numeroUscito) {
						conteggio++;
						break;
					}
				}
			}

			return conteggio;
		}
	}

	public boolean vincita(int[] giocata) {
		int esito = this.numeriContenuti(giocata);

		switch (esito) {
		case 0:
			System.out.println("La giocata è perdente");
			return false;
		case 1:
			System.out.println("La giocata è perdente");
			return false;
		case 2:
			System.out.println("Hai fatto ambo!");
			return true;
		case 3:
			System.out.println("Hai fatto terno!!");
			return true;
		case 4:
			System.out.println("Hai fatto quaterna!!!");
			return true;
		default:
			if (esito >= 5) {
				System.out.println("JACKPOT! CINQUINA!!");
				return true;
			} else {
				return false;
			}

		}

	}

	public int getTotaleNumeriEstratti() {
		return sommaNumeriEstratti;
	}

	public int getNumeroEstrazioni() {
		return numeroEstrazioni;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstrazioneDelLotto e = new EstrazioneDelLotto();

		int[] giocata = { 25, 37, 58, 79, 11, 23, 59, 87, 2, 15 };
		do {
			e.estrai();
			System.out.println("Estrazione: " + e.toString());
		} while (e.vincita(giocata) != true);

		System.out.println(e.getNumeroEstrazioni());
	}

}
