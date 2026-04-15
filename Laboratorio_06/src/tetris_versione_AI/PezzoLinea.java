package tetris_versione_AI;

public class PezzoLinea extends Pezzo {

	public PezzoLinea(int x, int y) {
		super(x, y, new int[][] { { 0, 0 }, { 0, -1 }, { 0, 1 }, { 0, 2 } });

	}
}
