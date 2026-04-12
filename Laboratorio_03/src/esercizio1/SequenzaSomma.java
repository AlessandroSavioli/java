package esercizio1;

public class SequenzaSomma {

	public static void sommaDuePrecedenti(int a, int b, int N) {
		System.out.print(a + ", " + b);
		int prev1 = a;
		int prev2 = b;

		for (int i = 0; i < N; i++) {
			int next = prev1 + prev2;

			System.out.print(", " + next);
			prev1 = prev2;
			prev2 = next;
		}

		System.out.println();
	}

	public static void main(String[] args) {
		SequenzaSomma.sommaDuePrecedenti(2, 3, 6);
	}
}
