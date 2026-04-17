package cinema;

public class SalaCinema {
	private String nomeFilm;
	private double prezzoBiglietto;
	private Posto[][] posti;
	
	public SalaCinema(String nomeFilm, double prezzoBiglietto) {
		this.nomeFilm = nomeFilm;
		this.prezzoBiglietto = prezzoBiglietto;
		posti = new Posto[10][10];	// Tutte le sale avranno 10 righe con 10 posti
		
		for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 10; j++) {
	            posti[i][j] = new Posto(i, j); 
	        }
	    }
	}
	
	public String getNomeFilm() {
		return nomeFilm;
	}
	
	public double GetPrezzoBiglietto() {
		return prezzoBiglietto;
	}
	
	public Posto[][] getPosti() {
		return posti;
	}
	
	public String visualizzaMappa() {
		String mappa = "";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (posti[i][j].isOccupato()) {
					mappa += "[X]";
				} else {
					mappa += "[ ]";
				}
			}
			mappa += "\n";
		}
		
		return mappa;
	}
	
	public void prenota(int r, int n) throws PostoOccupatoException {
		if (r > 9 || r < 0 || n > 9 || n < 0) {
			System.out.println("Il posto che vuoi prenotare non esiste!");
			return;
		} else {
			if (posti[r][n].isOccupato()) {
				throw new PostoOccupatoException("Il posto è già occupato!");
			} else {
				posti[r][n].occupa();
				System.out.println("Posto occupato, prezzo: " + prezzoBiglietto);
			}
			
		}
	}
	
}
