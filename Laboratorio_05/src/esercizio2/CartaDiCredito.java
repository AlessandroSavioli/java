package esercizio2;

public class CartaDiCredito extends MetodoPagamento {
	private double limite;

	public CartaDiCredito(Persona intestatario, double limite) {
		super(intestatario);
		this.limite = limite;
	}

	public boolean paga(double importo) {
		if (getSaldo() + limite >= importo) {
			System.out.println("Pagamento andato a buon fine!");
			accredita(-importo);
			System.out.println("Il nuovo saldo di " + getIntestatario() + " è: " + getSaldo());
			return true;
		} else {
			System.out.println("Pagamento fallito!");
			return false;
		}
	}
}
