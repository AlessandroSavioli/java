package esercizio1;

public class CasellaSpostaGiocatore extends Casella {

	private int salto;

	public CasellaSpostaGiocatore(int salto) {
		super("002");
		this.salto = salto;
	}

	public void applicaEffetto(Giocatore g) {

		int nuovaPosizione = g.getPosizione() + salto;

		g.setPosizione(nuovaPosizione);
	}
}
