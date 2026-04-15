package esercizio1;

public abstract class Casella {

	private String id;

	public Casella(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public abstract void applicaEffetto(Giocatore g);

}
