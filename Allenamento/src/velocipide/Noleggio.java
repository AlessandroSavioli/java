package velocipide;

import java.time.LocalDateTime;

public class Noleggio {
	private LocalDateTime inizio;
	private LocalDateTime fine;
	private Bicicletta bici;
	private String persona;

	public Noleggio(Bicicletta bici, String persona) {
		this.inizio = LocalDateTime.now();
		this.fine = null;
		this.bici = bici;
		this.persona = persona;
	}

	public String getPersona() {
		return persona;
	}

	public Bicicletta getBici() {
		return bici;
	}

	public double calcolaCosto(double tariffaOraria) {
		if (this.fine == null)
			return 0.0;

		double tempo = java.time.Duration.between(inizio, fine).toMinutes();

		return tempo * (tariffaOraria / 60);
	}

	public void chiudiNoleggio(Stazione s) {
		fine = LocalDateTime.now();
		try {
			s.ancoraBici(bici);
			bici.setStato(StatoBici.DISPONIBILE);
		} catch (SpazioTerminatoException e) {
			System.out.println(e.getMessage());
		}
	}
}
