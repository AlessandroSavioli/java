package esercizio1;

import java.util.Random;

public class Giocatore {
	private String nome;
	private int posizione;
	private int punti;

	public Giocatore(String nome, int posizione) {
		this.nome = nome;
		this.posizione = posizione;
		this.punti = 0;
	}

	public int getPosizione() {
		return posizione;
	}

	public int getPunti() {
		return punti;
	}

	public String getNome() {
		return nome;
	}

	public void aggiornaPunteggio(int valore) {
		if (punti + valore < 0) {
			punti = 0;
		} else {
			punti += valore;
		}
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public int tiraDadi(int dadi) {
		Random r = new Random();

		int numero = 0;
		for (int i = 0; i < dadi; i++) {
			numero += r.nextInt(1, 7);
		}

		return numero;
	}
}
