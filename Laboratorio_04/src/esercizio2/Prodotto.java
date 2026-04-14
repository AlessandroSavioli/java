package esercizio2;

public abstract class Prodotto {

	private double prezzo;
	private String id;

	public Prodotto(double prezzo, String id) {
		this.prezzo = prezzo;
		this.id = id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
}
