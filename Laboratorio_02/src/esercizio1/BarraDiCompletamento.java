package esercizio1;

public class BarraDiCompletamento {

	// Attributi
	private double percentuale;

	// Costruttore
	public BarraDiCompletamento(double percentuale) {
		this.percentuale = percentuale;
		if (percentuale < 0 || percentuale > 100) {
			this.percentuale = 0;
		}
	}

	// Metodi
	public double getPercentuale() {
		return percentuale;
	}

	public void incrementa(double incremento) {
		percentuale += incremento;
		if (percentuale > 100) {
			percentuale = 100;
		}
	}

	public String toString() {
		return "Il caricamento è al " + Math.round(percentuale) + "% \n|" + ("*".repeat((int) Math.round(percentuale)))
				+ ("-".repeat((int) (100 - Math.round(percentuale)))) + "|";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarraDiCompletamento b = new BarraDiCompletamento(0);
		b.incrementa(20);
		b.incrementa(25);
		System.out.println(b.toString());
	}

}
