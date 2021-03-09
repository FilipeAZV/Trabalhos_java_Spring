import java.util.ArrayList;
import java.util.Scanner;

//2 - Escreva um programa que receba cinco apelidos diferentes digitados pelo usuário. Todos os
//nomes deverão ser armazenados em um ArrayList de Strings. O programa deverá mostrar os
//apelidos cadastrados em ordem inversa a qual foram cadastrados, ou seja, do último para o
//primeiro.

public class Atividade2ArrayList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<String> apelidos = new ArrayList<>();

		System.out.println("Digite o 1 apelido: ");
		String apelido = ler.next();
		apelidos.add(apelido);
		System.out.println("Digite o 2 apelido: ");
		String apelido1 = ler.next();
		apelidos.add(apelido1);
		System.out.println("Digite o 3 apelido: ");
		String apelido2 = ler.next();
		apelidos.add(apelido2);
		System.out.println("Digite o 4 apelido: ");
		String apelido3 = ler.next();
		apelidos.add(apelido3);
		System.out.println("Digite o 5 apelido: ");
		String apelido4 = ler.next();
		apelidos.add(apelido4);

		if (apelido.isEmpty()) {
			System.out.println("Nenhum apelido cadastrado!");
		} else {
			System.out.println("Apelidos cadastrados (na ordem inversa):");
			for (int i = apelidos.size()-1; i >= 0; i--) {
				System.out.println(apelidos.get(i));
			}
		}

	}
}