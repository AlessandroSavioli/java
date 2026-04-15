package tetris_versione_AI;

public abstract class Pezzo {
	protected int x, y;
	protected int[][] coordinate;

	public Pezzo(int x, int y, int[][] forma) {
		this.x = x;
		this.y = y;
		this.coordinate = forma;
	}

	public void left() {
		x--;
	}

	public void right() {
		x++;
	}

	public void down() {
		y++;
	}

	// Restituisce come sarebbero le coordinate se ruotassimo (per testare la
	// collisione)
	public int[][] getRotatedCoords() {
		int[][] temp = new int[coordinate.length][2];
		for (int i = 0; i < coordinate.length; i++) {
			temp[i][0] = -coordinate[i][1];
			temp[i][1] = coordinate[i][0];
		}
		return temp;
	}

	public int[][] getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(int[][] nuoveCoords) {
		this.coordinate = nuoveCoords;
	}
}
