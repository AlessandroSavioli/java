package esercizi2_3;

public class Rettangolo {
	private int x, y;
	private int base, altezza;
	private Colore colore;

	// Costruttore
	public Rettangolo(int x, int y, int base, int altezza) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altezza = altezza;
		this.colore = Colore.NERO;
	}

	// Metodi
	public void trasla(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public String toString() {
		return "(" + x + ", " + y + ") -> (" + (x + base) + ", " + (y + altezza) + "), Colore: " + colore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r = new Rettangolo(0, 0, 20, 10);
		System.out.println(r);

		r.trasla(10, 5);
		System.out.println(r);

		Colore blu = new Colore(0, 0, 255);
		r.setColore(blu);
		System.out.println(r);
	}

}
