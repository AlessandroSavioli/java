package esercizio1;

public class Persona {

	// Attributi
	private String nome;
	private String cognome;
	public int età;

	// Costruttore
	public Persona(String nome, String cognome, int età) {
		this.nome = nome;
		this.cognome = cognome;

		this.età = età;
		if (età < 0 || età > 120) {
			this.età = 0;
		}
	}

	// Metodi
	public void stampa() {
		System.out.println("Scheda Persona");
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Età: " + età);
		System.out.println("------------------------");
	}

	public void setEtà(int n) {
		if (n >= 0 && n <= 120) {
			this.età = n;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEtà() {
		return età;
	}

	// Metodo main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Mario", "Rossi", 20);

		p1.stampa();
		p1.setEtà(90);
		p1.stampa();
		p1.setEtà(121);
		p1.stampa();
	}

}
