package cinema;

import java.util.ArrayList;

public class GestoreCinema {
	private ArrayList<SalaCinema> sale;
	
	public GestoreCinema() {
		sale = new ArrayList<SalaCinema>();
	}
	
	public void aggiungiSala(SalaCinema s) {
		sale.add(s);
	}
	
	public double incassoTotale() {
		double incasso = 0;
		
		for (SalaCinema sala : sale) {
			Posto [][] posti_sala = sala.getPosti();
			for (int i = 0; i < 10; i ++) {
				for (int j = 0; j < 10; j++) {
					if (posti_sala[i][j].isOccupato()) {
						incasso += sala.GetPrezzoBiglietto();
					}
				}
			}
		}
		
		return incasso;
	}
}
