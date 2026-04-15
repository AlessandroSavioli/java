package tetris_versione_AI;

class Board {
	private int L, A;
	private int[][] griglia;

	public Board(int l, int a) {
		this.L = l;
		this.A = a;
		this.griglia = new int[a][l];
	}

	public boolean canMove(int nx, int ny, int[][] coords) {
		for (int[] b : coords) {
			int ax = nx + b[0];
			int ay = ny + b[1];
			if (ax < 0 || ax >= L || ay >= A)
				return false;
			if (ay >= 0 && griglia[ay][ax] != 0)
				return false;
		}
		return true;
	}

	public void blocca(Pezzo p) {
		for (int[] b : p.coordinate) {
			int ay = p.y + b[1];
			if (ay >= 0)
				griglia[ay][p.x + b[0]] = 1;
		}
	}

	public void clean() {
		for (int i = A - 1; i >= 0; i--) {
			boolean piena = true;
			for (int j = 0; j < L; j++)
				if (griglia[i][j] == 0)
					piena = false;
			if (piena) {
				for (int k = i; k > 0; k--)
					griglia[k] = griglia[k - 1].clone();
				griglia[0] = new int[L];
				i++;
			}
		}
	}

	public void visualizza(Pezzo p) {
		for (int i = 0; i < A; i++) {
			System.out.print("|");
			for (int j = 0; j < L; j++) {
				boolean isPezzo = false;
				for (int[] b : p.coordinate)
					if (p.x + b[0] == j && p.y + b[1] == i)
						isPezzo = true;
				if (isPezzo)
					System.out.print(" O ");
				else
					System.out.print(griglia[i][j] == 0 ? " . " : " # ");
			}
			System.out.println("|");
		}
	}
}
