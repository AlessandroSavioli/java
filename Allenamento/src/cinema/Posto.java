package cinema;

public class Posto {
	private int riga, numero;
	private boolean occupato;
	
	public Posto(int riga, int numero) {
		this.riga = riga;
		this.numero = numero;
		this.occupato = false;
	}
	
	public int getRiga() {
		return riga;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean isOccupato() {
		return occupato;
	}
	
	public void occupa() {
		occupato = true;
	}
	
	public void libera() {
		occupato = false;
	}
	
}
