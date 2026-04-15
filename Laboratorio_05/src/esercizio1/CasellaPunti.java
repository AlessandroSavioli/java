package esercizio1;

public class CasellaPunti extends Casella {

	private int punti;

	public CasellaPunti(int punti) {
		super("003");
		this.punti = punti;
	}

	public void applicaEffetto(Giocatore g) {
		g.aggiornaPunteggio(punti);
	}
}
