package tetris_versione_AI;

import java.util.Scanner;

public class GiocoTetris {
	public static Pezzo spawn(int l) {
		int tipo = new java.util.Random().nextInt(5);
		int startX = l / 2;
		return switch (tipo) {
		case 0 -> new PezzoL(startX, 1);
		case 1 -> new PezzoT(startX, 1);
		case 2 -> new PezzoSerpente(startX, 1);
		case 3 -> new PezzoLinea(startX, 1);
		default -> new PezzoQuadrato(startX, 1);
		};
	}

	public static void main(String[] args) {
		Board b = new Board(10, 20);
		Scanner sc = new Scanner(System.in);
		Pezzo corrente = spawn(10);

		while (true) {
			b.visualizza(corrente);
			System.out.println("Comandi: A(sx), D(dx), W(ruota), S(giù). Q per uscire.");
			String input = sc.next().toLowerCase();

			if (input.equals("q"))
				break;

			switch (input) {
			case "a" -> {
				if (b.canMove(corrente.x - 1, corrente.y, corrente.coordinate))
					corrente.left();
			}
			case "d" -> {
				if (b.canMove(corrente.x + 1, corrente.y, corrente.coordinate))
					corrente.right();
			}
			case "w" -> {
				int[][] r = corrente.getRotatedCoords();
				if (b.canMove(corrente.x, corrente.y, r))
					corrente.setCoordinate(r);
			}
			case "s" -> {
				if (b.canMove(corrente.x, corrente.y + 1, corrente.coordinate)) {
					corrente.down();
				} else {
					// Il pezzo si è piazzato!
					b.blocca(corrente);
					b.clean();
					corrente = spawn(10); // Ne facciamo nascere uno nuovo

					// Se il nuovo pezzo nasce già incastrato, GAME OVER
					if (!b.canMove(corrente.x, corrente.y, corrente.coordinate)) {
						System.out.println("GAME OVER!");
						return;
					}
				}
			}
			}
		}
	}
}