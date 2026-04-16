package bibliotecaDigitale;

public abstract class Risorsa {
	private String titolo;
	private String codiceUnivoco;
	private boolean isInPrestito;

	public Risorsa(String titolo, String codiceUnivoco) {
		this.titolo = titolo;
		this.codiceUnivoco = codiceUnivoco;
		this.isInPrestito = false;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public boolean getIsInPrestito() {
		return isInPrestito;
	}

	public void setIsInPrestito(boolean b) {
		isInPrestito = b;
	}

	public abstract int getDurataMassimaPrestito();
}
