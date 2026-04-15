package eCommerce;

public class Utente {

	private String nome;
	private int puntiFedeltà;

	public Utente(String nome, int puntiFedeltà) {
		this.nome = nome;
		this.puntiFedeltà = puntiFedeltà;
	}

	public String getNome() {
		return nome;
	}

	public int getPuntiFedeltà() {
		return puntiFedeltà;
	}

	public void sottraiPunti(int punti) {
		if (puntiFedeltà - punti >= 0) {
			puntiFedeltà -= punti;
		} else {
			System.out.println("Non puoi usare più punti di quelli che hai!");
		}
	}

	public void aggiungiPunti(double importo) {
		puntiFedeltà += (int) importo / 10;
	}
}
