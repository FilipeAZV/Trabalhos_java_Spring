import java.util.ArrayList;
import java.util.Scanner;

/*3 - Escreva um programa que contenha uma lista com 5 nomes pré-cadastrados. O
programa deverá dar ao usuário a opção de excluir um único nome da lista , com
valores entre 0 e 4.
Exemplo: Qual dos nomes abaixo você deseja excluir da lista?
0. Naruto
1. Itachi
2. Madara
3. Sasuke
4. Tsunade
Feita a escolha do usuário pelo número correspondente ao nome, o programa deverá mostrar
na tela os quatro nomes que restaram cadastrados na lista.*/

public class Atividade3ArrayList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<String> listaDeNomes = new ArrayList<String>();

		System.out.println("                 LISTA DE NOMES                        ");
		System.out.println("-------------------------------------------------------");
		listaDeNomes.add("Naruto");
		listaDeNomes.add("Itachi");
		listaDeNomes.add("Madara");
		listaDeNomes.add("Sasuke");
		listaDeNomes.add("Tsunade");

		System.out.println("nome 0: " + listaDeNomes.get(0));
		System.out.println("nome 1: " + listaDeNomes.get(1));
		System.out.println("nome 2: " + listaDeNomes.get(2));
		System.out.println("nome 3: " + listaDeNomes.get(3));
		System.out.println("nome 4: " + listaDeNomes.get(4));
		 
		System.out.println("--------------------------------------------------------");
		System.out.println("Para remover um nome digite um número de 0 há 4");
		int remove = ler.nextInt();
		listaDeNomes.remove(remove);
		
		System.out.println("nome 0: " + listaDeNomes.get(0));
		System.out.println("nome 1: " + listaDeNomes.get(1));
		System.out.println("nome 2: " + listaDeNomes.get(2));
		System.out.println("nome 3: " + listaDeNomes.get(3));

	}

}
