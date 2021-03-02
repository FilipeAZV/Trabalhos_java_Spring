import java.util.ArrayList;
import java.util.Scanner;

public class AprendendoForEach {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Paulo");
		nomes.add("Roger");
		nomes.add("Carlos");
		nomes.add("Carlos");

		System.out.println("For tradicional: ");

		for (int i = 0; i < nomes.size(); i++) { // i++ = i+1
			String nome = nomes.get(i);
			System.out.println((i + 1) + "° Nome: " + nome);

		}

		System.out.println("For EACH:");

		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}

		System.out.println("Digite um nome para pesquisar: ");
		String nomeDigitado = ler.next();

		System.out.println("Pesquisa multipla");

		// : -> in ou em
		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeDigitado)) {
				System.out.println("Nome encontrado: " + nome);
			}
		}

		System.out.println("Pesquisa unica");
		// boolean => true ou false

		boolean nomeEncontrado = false;

		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeDigitado)) {
				nomeEncontrado = true;
			}
		}

		if (nomeEncontrado) {
			System.out.println("Nome encontrado com sucesso!");
		} else {
			System.out.println("Nome não encontrado");
		}

		System.out.println("Pesquisa numerada");

		int encontrados = 0;

		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeDigitado)) {
				// fazem a mesma coisa
				// encontrados += 1;
				// encontrados = encontrados + 1;
				encontrados++;
			}
		}

		System.out.println(encontrados + " resultado(s) encontrado(s)");

		System.out.println("Pesquisa multipla posicionada");
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).equalsIgnoreCase(nomeDigitado)) {
				System.out.println("Nome encontrado na posição: " + i);
			}
		}

		System.out.println("--------------------------------------------");
		System.out.println("Pesquisa Megazord");

		int resultados = 0;

		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).equalsIgnoreCase(nomeDigitado)) {
				System.out.println("Nome encontrado na posição: " + i);
				resultados++;
			}
		}
		if (resultados == 0) {
			System.out.println("Nenhum resultado(s) encontrado(s)");
		} else {
			System.out.println(resultados + " resultado(s) encontrado(s)");
		}

	}
}
