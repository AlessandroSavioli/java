package eCommerce;

public class Alimentare extends Prodotto {

	private int giorniAllaScadenza;

	public Alimentare(String nome, double prezzoBase, int giorniAllaScadenza) {
		super(nome, prezzoBase);
		this.giorniAllaScadenza = giorniAllaScadenza;
	}

	public int getGiorniAllaScadenza() {
		return giorniAllaScadenza;
	}

	public double calcolaPrezzo() {
		if (giorniAllaScadenza < 5) {
			return getPrezzoBase() * 0.8;
		} else {
			return getPrezzoBase();
		}
	}
}
