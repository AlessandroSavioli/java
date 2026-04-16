package bibliotecaDigitale;

public class TestBiblioteca {
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		Utente u = new Utente("Alessandro", 1001);

		// Aggiungiamo risorse alla biblioteca
		b.aggiungiRisorsa(new Libro("Il Signore degli Anelli", "L001", 1200));
		b.aggiungiRisorsa(new Libro("Java: Guida Completa", "L002", 800));
		b.aggiungiRisorsa(new DVD("Inception", "D001", 148));
		b.aggiungiRisorsa(new DVD("Interstellar", "D002", 169));

		System.out.println("--- TEST PRESTITI ---");
		b.prestaRisorsa(u, "L001"); // Libro: 30 giorni
		b.prestaRisorsa(u, "D001"); // DVD: 7 giorni
		b.prestaRisorsa(u, "L002"); // Terzo prestito: OK

		System.out.println("\n--- TEST LIMITE 3 RISORSE ---");
		b.prestaRisorsa(u, "D002"); // Dovrebbe fallire perché ha già 3 risorse

		System.out.println("\n--- TEST RESTITUZIONE ---");
		b.ritiraRisorsa(u, "L001");

		System.out.println("\n--- TEST NUOVO PRESTITO DOPO RESTITUZIONE ---");
		b.prestaRisorsa(u, "D002"); // Ora dovrebbe funzionare!
	}
}
