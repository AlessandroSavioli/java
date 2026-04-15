package esercizio2;

public class ContoBancario extends MetodoPagamento {
	public ContoBancario(Persona intestatario) {
		super(intestatario);
	}

	public boolean paga(double importo) {
		if (getSaldo() >= importo) {
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
