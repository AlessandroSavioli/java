package velocipide;

public class Bicicletta {
	private String codice;
	private StatoBici stato;

	public Bicicletta(String codice, StatoBici stato) {
		this.codice = codice;
		this.stato = stato;
	}

	public String getCodice() {
		return codice;
	}

	public StatoBici getStato() {
		return stato;
	}

	public void setStato(StatoBici nuovoStato) {
		this.stato = nuovoStato;
	}

	public String toString() {
		return "ID bici: " + codice + "\nStato: " + stato;
	}
}
