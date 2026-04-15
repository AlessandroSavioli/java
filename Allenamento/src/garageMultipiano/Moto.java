package garageMultipiano;

public class Moto extends Veicolo {
	private double tariffa = 1;

	public Moto(String targa, int orePermanenza) {
		super(targa, orePermanenza);
	}

	public double calcolaTariffa() {
		return getOrePermanenza() * tariffa;
	}
}
