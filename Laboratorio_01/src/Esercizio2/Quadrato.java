package Esercizio2;

public class Quadrato {

	// Attributi
	private int lato;

	// Costruttore
	public Quadrato(int lato) {
		this.lato = lato;
	}

	// Metodi
	public int getPerimetro() {
		return (4 * this.lato);

	}

	public int getLato() {
		return lato;
	}

	// Metodo main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrato q1 = new Quadrato(4);

		int perimetro = q1.getPerimetro();
		System.out.println("Il perimetro è: " + perimetro);
	}

}
