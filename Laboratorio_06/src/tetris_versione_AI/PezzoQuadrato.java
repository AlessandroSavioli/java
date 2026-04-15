package tetris_versione_AI;

public class PezzoQuadrato extends Pezzo {
	public PezzoQuadrato(int x, int y) {
		super(x, y, new int[][] { { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } });
	}

	@Override
	public int[][] getRotatedCoords() {
		return getCoordinate();
	}
}