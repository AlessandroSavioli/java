package eCommerce;

public class Elettronico extends Prodotto {

	private int mesiGaranzia;

	public Elettronico(String nome, double prezzoBase, int mesiGaranzia) {
		super(nome, prezzoBase);
		this.mesiGaranzia = mesiGaranzia;
	}

	public int getMesiGaranzia() {
		return mesiGaranzia;
	}

	public double calcolaPrezzo() {
		if (mesiGaranzia > 24) {
			return getPrezzoBase() * 1.1;
		} else {
			return getPrezzoBase();
		}
	}
}
