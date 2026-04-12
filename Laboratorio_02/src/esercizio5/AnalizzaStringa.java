package esercizio5;

public class AnalizzaStringa {
	private String testo;

	public AnalizzaStringa(String testo) {
		this.testo = testo;
	}

	public int lunghezza() {
		return testo.length();
	}

	public char iesimoCarattere(int i) {
		return testo.charAt(i);
	}

	public char primoCarattere() {
		return this.iesimoCarattere(0);
	}

	public char ultimoCarattere() {
		return this.iesimoCarattere(this.lunghezza() - 1);
	}

	public String maiuscolo() {
		return testo.toUpperCase();
	}

	public String minuscolo() {
		return testo.toLowerCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnalizzaStringa s = new AnalizzaStringa("Programmazione");

		System.out.println(s.lunghezza());
		System.out.println("Primo carattere: " + s.primoCarattere());
		System.out.println("Ultimo carattere: " + s.ultimoCarattere());
		System.out.println("In uppercase: " + s.maiuscolo());
		System.out.println("In lowercase: " + s.minuscolo());

	}

}
