package bibliotecaDigitale;

public class Libro extends Risorsa {
	private int numeroPagine;

	public Libro(String nome, String codiceUnivoco, int numeroPagine) {
		super(nome, codiceUnivoco);
		this.numeroPagine = numeroPagine;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public int getDurataMassimaPrestito() {
		return 30;
	}
}
