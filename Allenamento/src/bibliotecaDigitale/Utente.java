package bibliotecaDigitale;

import java.util.ArrayList;

public class Utente {
	private String nome;
	private int numeroTessera;
	private ArrayList<Risorsa> risorseInPrestito;

	public Utente(String nome, int numeroTessera) {
		this.nome = nome;
		this.numeroTessera = numeroTessera;
		risorseInPrestito = new ArrayList<Risorsa>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTessera() {
		return numeroTessera;
	}

	public ArrayList<Risorsa> getRisorseInPrestito() {
		return risorseInPrestito;
	}

	public void aggiungiRisorsaInPrestito(Risorsa r) {
		risorseInPrestito.add(r);
	}

	public void rimuoviRisorsaInPrestito(Risorsa r) {
		risorseInPrestito.remove(r);
	}

}
