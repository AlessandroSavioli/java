package Esercizio2;

public class Cerchio {

	// Attributi
	private int raggio;

	// Costruttore
	public Cerchio(int raggio) {
		this.raggio = raggio;
	}

	// Metodi
	public double getPerimetro() {
		return 2 * Math.PI * this.raggio;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.raggio, 2);
	}

	public int getRaggio() {
		return raggio;
	}

	// Metodo main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerchio c1 = new Cerchio(1);
		Cerchio c2 = new Cerchio(5);

		System.out.println("Il perimetro del primo cerchio è di: " + c1.getPerimetro());
		System.out.println("L'area del secondo cerchio è di: " + c2.getArea());
	}

}
