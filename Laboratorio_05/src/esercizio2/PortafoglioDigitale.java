package esercizio2;

public class PortafoglioDigitale extends MetodoPagamento {
	public PortafoglioDigitale(Persona intestatario) {
		super(intestatario);
	}

	public boolean paga(double importo) {
		if (getSaldo() >= importo) {
			System.out.println("Pagamento andato a buon fine!");
			accredita(-importo);

			double cashback = importo * 0.1;
			accredita(cashback);
			System.out.println("Il nuovo saldo di " + getIntestatario() + " è: " + getSaldo());
			return true;
		} else {
			System.out.println("Pagamento fallito!");
			return false;
		}
	}
}
