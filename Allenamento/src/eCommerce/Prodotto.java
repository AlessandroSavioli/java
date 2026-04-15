package eCommerce;

public abstract class Prodotto {
	private String nome;
	private double prezzoBase;

	public Prodotto(String nome, double prezzoBase) {
		this.nome = nome;
		this.prezzoBase = prezzoBase;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzoBase() {
		return prezzoBase;
	}

	public abstract double calcolaPrezzo();
}
