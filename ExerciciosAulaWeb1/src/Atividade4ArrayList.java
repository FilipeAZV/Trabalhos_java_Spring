
/*4 - Escreva um programa que cadastre em uma lista de valores inteiros 10 números inteiros digitados pelo usuário. Ao final, 
o programa deverá ver na lista qual o maior número e mostrá-lo ao usuário.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

//		4 - Escreva um programa que cadastre em uma lista de valores inteiros 10 números inteiros
//		digitados pelo usuário. Ao final, o programa deverá ver na lista qual o maior número e mostrá-
//		lo ao usuário.

		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número " + (i + 1));
			int numero = ler.nextInt();
			numerosInteiros.add(numero);
		}

		int maior = 0;

		for (int i = 0; i < numerosInteiros.size(); i++) {
			int numero = numerosInteiros.get(i);
			if (numero > maior) {
				maior = numero;
			}
		}

		for (int i = 0; i < numerosInteiros.size(); i++) {
			if (numerosInteiros.get(i) > maior) {
				maior = numerosInteiros.get(i);
			}
		}

		for (Integer numero : numerosInteiros) {
			if (numero > maior) {
				maior = numero;
			}
		}

		System.out.println("O maior número digitado é " + maior);

	}
}
