package esercizi2_3;

public class Colore {

	// Attributi
	private int r, g, b;

	public static final Colore BIANCO = new Colore(255, 255, 255);
	public static final Colore NERO = new Colore(0, 0, 0);

	public Colore(int r, int g, int b) {
		if (valido(r) && valido(g) && valido(b)) {
			this.r = r;
			this.g = g;
			this.b = b;
		} else {
			this.r = 0;
			this.g = 0;
			this.b = 0;
		}

	}

	private boolean valido(int valore) {
		return valore >= 0 && valore <= 255;
	}

	public String toString() {
		return "(" + r + ", " + g + ", " + b + ")";
	}

}
