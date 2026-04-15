package garageMultipiano;

public class Auto extends Veicolo {

	private double tariffa = 2;

	public Auto(String targa, int orePermanenza) {
		super(targa, orePermanenza);
	}

	public double calcolaTariffa() {
		return getOrePermanenza() * tariffa;
	}
}
