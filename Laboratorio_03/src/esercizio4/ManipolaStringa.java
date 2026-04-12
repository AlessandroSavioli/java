package esercizio4;

public class ManipolaStringa {

	private String testo;

	public ManipolaStringa(String testo) {
		this.testo = testo;
	}

	public boolean contiene(String parola) {
		return testo.contains(parola);
	}

	public String primaParola() {
		int spazio = testo.indexOf(" ");

		if (spazio == -1) {
			return testo;
		} else {
			return testo.substring(0, spazio);
		}

	}

	public void sostituisci(String a, String b) {
		if (testo.contains(a)) {
			testo = testo.replace(a, b);
		}
	}

	public String toString() {
		return testo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipolaStringa s = new ManipolaStringa("Java è un linguaggio potente");
		System.out.println(s);
		System.out.println(s.contiene("linguaggio"));
		System.out.println(s.primaParola());
		s.sostituisci("Java", "Python");
		System.out.println(s);
	}

}
