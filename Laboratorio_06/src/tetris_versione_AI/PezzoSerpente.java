package tetris_versione_AI;

public class PezzoSerpente extends Pezzo {

	public PezzoSerpente(int x, int y) {
		super(x, y, new int[][] { { 0, 0 }, { 1, 0 }, { 0, 1 }, { -1, 1 } });

	}
}
