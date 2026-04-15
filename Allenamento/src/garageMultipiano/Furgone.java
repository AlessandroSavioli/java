package garageMultipiano;

public class Furgone extends Veicolo {
	private double tariffa = 3;

	public Furgone(String targa, int orePermanenza) {
		super(targa, orePermanenza);
	}

	public double calcolaTariffa() {
		return getOrePermanenza() * tariffa;
	}
}
