
/*4 - Escreva um programa que cadastre em uma lista de valores inteiros 10 n�meros inteiros digitados pelo usu�rio. Ao final, 
o programa dever� ver na lista qual o maior n�mero e mostr�-lo ao usu�rio.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

//		4 - Escreva um programa que cadastre em uma lista de valores inteiros 10 n�meros inteiros
//		digitados pelo usu�rio. Ao final, o programa dever� ver na lista qual o maior n�mero e mostr�-
//		lo ao usu�rio.

		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o n�mero " + (i + 1));
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

		System.out.println("O maior n�mero digitado � " + maior);

	}
}
