import java.util.ArrayList;
import java.util.Scanner;

public class ExercitandoArrayList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> filmes = new ArrayList<String>();
		int menu = 0;
		while (menu != 9) {
			System.out.println("-----------------------------------------------------------");
			System.out.println(":                Escolha uma op��o:                       :");
			System.out.println("-----------------------------------------------------------");
			System.out.println(":        1- Cadastrar um filme                            :");
			System.out.println(":        2- Consultar quantidade de filmes cadastrados    :");
			System.out.println(":        3- Consultar um filme                            :");
			System.out.println(":        4- Remover um filme                              :");
			System.out.println("         5- Consultar todos os filmes cadastrados         : ");
			System.out.println(":        9- Sair                                          :");
			System.out.println("-----------------------------------------------------------");
			menu = ler.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digite o nome do filme:");
				ler.nextLine();
				String filme = ler.nextLine();
				filmes.add(filme);
				System.out.println("Filme adicionado com sucesso.");
				break;
			case 2:
				if (filmes.isEmpty()) {
					System.out.println("Nenhum filme cadastrado!");
				} else {
					System.out.println("H� " + filmes.size() + " filme(s) cadastrado(s).");
				}
				break;
			case 3:
				if (filmes.isEmpty()) {
					System.out.println("Nenhum filme cadastrado!");
				} else {
					System.out.println("Digite o n�mero do filme a ser consultado: (come�a em 0)");
					int numero = ler.nextInt();
					if (numero < filmes.size()) {
						System.out.println("Filme: " + filmes.get(numero));
					} else {
						System.out.println("Op��o inv�lida!");
					}
				}
				break;
			case 4:
				if (filmes.isEmpty()) {
					System.out.println("Nenhum filme cadastrado!");
				} else {
					System.out.println("Digite o n�mero do filme a ser exclu�do: (come�a em 0)");
					int numero = ler.nextInt();
					if (numero < filmes.size()) {
						filmes.remove(numero);
						System.out.println("Filme exclu�do com sucesso!");
					} else {
						System.out.println("Op��o inv�lida!");
					}
				}
			case 5:
				if (filmes.isEmpty()) {
					System.out.println("Nenhum filme cadastrado");
				} else {
					System.out.println("Filmes cadastrados:");
					for (int i = 0; i < filmes.size(); i++) {
						System.out.println(filmes.get(i));
					}
				}
				break;
			case 9:
				System.out.println("Tchau!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		}

	}

}