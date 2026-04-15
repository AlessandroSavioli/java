package tetris_versione_AI;

public class PezzoT extends Pezzo {

	public PezzoT(int x, int y) {
		super(x, y, new int[][] { { 0, 0 }, { -1, 0 }, { 1, 0 }, { 0, 1 } });

	}
}
