package eCommerce;

public class EsempioEcommerce {
	public static void main(String[] args) {
		// 1. Creazione Prodotti (Elettronica)
		// Smartphone: 500€, 36 mesi garanzia -> Dovrebbe costare 550€ (+10%)
		Prodotto smartphone = new Elettronico("Smartphone X", 500, 36);
		// Mouse: 20€, 12 mesi garanzia -> Dovrebbe costare 20€ (base)
		Prodotto mouse = new Elettronico("Mouse Wireless", 20, 12);

		// 2. Creazione Prodotti (Alimentari)
		// Latte: 2€, scade tra 2 giorni -> Dovrebbe costare 1.60€ (-20%)
		Prodotto latte = new Alimentare("Latte Bio", 2.0, 2);
		// Pasta: 1.50€, scade tra 30 giorni -> Dovrebbe costare 1.50€ (base)
		Prodotto pasta = new Alimentare("Pasta Integrale", 1.5, 30);

		// 3. Creazione Utenti
		Utente u1 = new Utente("Mario", 10); // Pochi punti
		Utente u2 = new Utente("Luigi", 60); // Molti punti (pronto per lo sconto)

		// --- TEST 1: Mario fa la spesa (Accumulo punti) ---
		Carrello carrelloMario = new Carrello();
		carrelloMario.aggiungiProdotto(smartphone); // 550
		carrelloMario.aggiungiProdotto(latte); // 1.60

		System.out.println("--- CHECKOUT MARIO (Punti iniziali: " + u1.getPuntiFedeltà() + ") ---");
		carrelloMario.checkout(u1);
		// Spesa prevista: 551.60€
		// Punti guadagnati: 55 (1 ogni 10€)
		System.out.println("Punti finali Mario: " + u1.getPuntiFedeltà());

		System.out.println("\n-----------------------------------\n");

		// --- TEST 2: Luigi fa la spesa (Sconto Fedeltà) ---
		Carrello carrelloLuigi = new Carrello();
		carrelloLuigi.aggiungiProdotto(mouse); // 20
		carrelloLuigi.aggiungiProdotto(pasta); // 1.5
		carrelloLuigi.aggiungiProdotto(new Elettronico("Monitor", 100, 12)); // 100

		System.out.println("--- CHECKOUT LUIGI (Punti iniziali: " + u2.getPuntiFedeltà() + ") ---");
		carrelloLuigi.checkout(u2);
		// Totale prodotti: 121.50€
		// Sconto fedeltà applicato: -5€ (perché aveva 60 punti)
		// Totale pagato: 116.50€
		// Punti rimasti: 10 (60-50) + 11 (nuovi punti su 116€) = 21
		System.out.println("Punti finali Luigi: " + u2.getPuntiFedeltà());
	}
}