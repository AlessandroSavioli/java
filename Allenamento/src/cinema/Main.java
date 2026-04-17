package cinema;

public class Main {
    public static void main(String[] args) {
        GestoreCinema cinema = new GestoreCinema();
        
        // Creiamo una sala per il nuovo film di Oppenheimer
        SalaCinema sala1 = new SalaCinema("Oppenheimer", 8.50);
        cinema.aggiungiSala(sala1);
        
        System.out.println("--- Mappa Iniziale ---");
        System.out.println(sala1.visualizzaMappa());
        
        try {
            // Prenotiamo un po' di posti
            sala1.prenota(0, 0); // Angolo in alto a sx
            sala1.prenota(5, 5); // Centro
            sala1.prenota(0, 0); // ERRORE: Già occupato!
        } catch (PostoOccupatoException e) {
            System.err.println("ATTENZIONE: " + e.getMessage());
        }
        
        System.out.println("\n--- Mappa Aggiornata ---");
        System.out.println(sala1.visualizzaMappa());
        
        System.out.println("Incasso totale cinema: €" + cinema.incassoTotale());
    }
}