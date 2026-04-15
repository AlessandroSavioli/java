package esercizio2;

public abstract class MetodoPagamento {
	private Persona intestatario;
	private double saldo;

	public MetodoPagamento(Persona intestatario) {
		this.intestatario = intestatario;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getIntestatario() {
		return intestatario.toString();
	}

	public abstract boolean paga(double importo);

	public void accredita(double importo) {
		saldo += importo;
	}

}
