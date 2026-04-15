package tetris_versione_AI;

public class PezzoL extends Pezzo {
	public PezzoL(int x, int y) {

		super(x, y, new int[][] { { 0, 0 }, { 0, -1 }, { 0, 1 }, { 1, 1 } });

	}
}
