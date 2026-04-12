package esercizio4;

import java.util.HashSet;
import java.util.Set;

public class Programmatore {
	private String nome, cognome, azienda;
	private Set<String> linguaggi;

	public Programmatore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.azienda = "";
		this.linguaggi = new HashSet<String>();
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public void addLinguaggio(String linguaggio) {
		this.linguaggi.add(linguaggio);
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getAzienda() {
		return azienda;
	}

	public Set<String> getLinguaggi() {
		return linguaggi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmatore p1 = new Programmatore("Bjarne", "Stroustrup");
		Programmatore p2 = new Programmatore("Brian", "Kernighan");
		Programmatore p3 = new Programmatore("James", "Gosling");
		p1.addLinguaggio("C");
		p1.addLinguaggio("C++");
		p1.setAzienda("Morgan Stanley");
		p2.addLinguaggio("C");
		p2.addLinguaggio("Javascript");
		p3.addLinguaggio("Java");
		p3.addLinguaggio("Python");

		// Stampa Morgan Stanley
		System.out.println(p1.getAzienda());
		// Stampa C Javascript
		System.out.println(p2.getLinguaggi());
	}

}
