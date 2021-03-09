import java.util.ArrayList;
import java.util.Scanner;

/*5 - Escreva um programa que permita ao usu�rio cadastrar, no m�ximo, 6 n�meros inteiros
DIFERENTES em uma lista (cada n�mero em uma posi��o). O programa n�o poder� permitir
que n�meros j� cadastrados sejam inseridos na lista.arro e exiba as informa��es digitas na tela
usando o System.out.println.*/

public class Atividade5ArrayList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		while (numeros.size() < 6) {

			for (int i = 0; i < 6; i++) {
				System.out.println("Digite um n�mero inteiro: ");

				int n = ler.nextInt();
				if (n < 0) {
					System.out.println("Numero negativo");
				} else if (!numeros.contains(n)) {
					numeros.add(n);
					System.out.println("Numero adicionado com sucesso!");
				} else {
					System.out.println("Esse n�mero j� foi adicionado");
				}
			}
		}
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}
}
