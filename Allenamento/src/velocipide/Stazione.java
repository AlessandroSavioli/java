package velocipide;

import java.util.ArrayList;

public class Stazione {
	private String nome;
	private int capacitaMassima;
	private ArrayList<Bicicletta> bici;

	public Stazione(String nome, int capacitaMassima) {
		this.nome = nome;
		this.capacitaMassima = capacitaMassima;

		bici = new ArrayList<Bicicletta>();
	}

	public String getNome() {
		return nome;
	}

	public int getCapacitaMassima() {
		return capacitaMassima;
	}

	public ArrayList<Bicicletta> getBici() {
		return bici;
	}

	public int getSpazioRimanente() {
		return capacitaMassima - bici.size();
	}

	public void ancoraBici(Bicicletta b) throws SpazioTerminatoException {
		if (getSpazioRimanente() > 0) {
			bici.add(b);
		} else {
			throw new SpazioTerminatoException("La stazione è piena");
		}
	}

	public void RitiraBici(String c) throws BiciNonTrovataException {
		for (Bicicletta bicicletta : bici) {
			if (bicicletta.getCodice().equals(c)) {
				if (bicicletta.getStato() == StatoBici.DISPONIBILE) {
					bici.remove(bicicletta);
					bicicletta.setStato(StatoBici.IN_USO);
					return;
				} else {
					System.out.println("La bici che si vuole ritirare è " + bicicletta.getStato());
					return;
				}
			}
		}
		throw new BiciNonTrovataException("La bici che si vuole ritirare non è in questa stazione");

	}
}
