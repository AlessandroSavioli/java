package esercizio2;

import java.util.ArrayList;

public class SistemaPagamenti {

	private ArrayList<MetodoPagamento> metodiAccettati;

	public SistemaPagamenti() {
		this.metodiAccettati = new ArrayList<MetodoPagamento>();
	}

	public void aggiungiMetodo(MetodoPagamento m) {
		this.metodiAccettati.add(m);
	}

	public void eseguiPagamenti(double importo) {
		for (MetodoPagamento metodo : metodiAccettati) {
			metodo.paga(importo);
		}
	}

	public static void main(String[] args) {
		Persona as = new Persona("Alessandro", "Savioli");
		PortafoglioDigitale pd_as = new PortafoglioDigitale(as);
		pd_as.accredita(2000);
		Persona mr = new Persona("Mario", "Rossi");
		ContoBancario cb_mr = new ContoBancario(mr);
		cb_mr.accredita(1500);

		SistemaPagamenti sp = new SistemaPagamenti();
		sp.aggiungiMetodo(cb_mr);
		sp.aggiungiMetodo(pd_as);

		sp.eseguiPagamenti(1700);
	}
}
