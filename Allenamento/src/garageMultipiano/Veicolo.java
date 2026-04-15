package garageMultipiano;

public abstract class Veicolo {
	private String targa;
	private int orePermanenza;

	public Veicolo(String targa, int orePermanenza) {
		this.targa = targa;
		this.orePermanenza = orePermanenza;
	}

	public String getTarga() {
		return targa;
	}

	public int getOrePermanenza() {
		return orePermanenza;
	}

	public abstract double calcolaTariffa();

}
