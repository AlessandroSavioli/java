package esercizio1;

public class ContaToken {

	public static int contaToken(String testo, String word) {
		testo = testo.toLowerCase();
		String[] tokens = testo.split(" ");
		int occorrenze = 0;
		word = word.toLowerCase();

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals(word)) {
				occorrenze++;
			}
		}

		return occorrenze;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ContaToken.contaToken("ciao mondo ! ciao Ciao ciao !", "Ciao"));

	}

}
