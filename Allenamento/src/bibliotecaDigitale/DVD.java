package bibliotecaDigitale;

public class DVD extends Risorsa {
	private int durataMinuti;

	public DVD(String nome, String codiceUnivoco, int durataMinuti) {
		super(nome, codiceUnivoco);
		this.durataMinuti = durataMinuti;
	}

	public int getDurataMinuti() {
		return durataMinuti;
	}

	public int getDurataMassimaPrestito() {
		return 7;
	}
}
