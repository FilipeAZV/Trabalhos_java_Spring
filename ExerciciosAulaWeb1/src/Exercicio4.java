

//4 - Fa�a um programa em que o usu�rio digite dois valores e em seguida seja exibido um menu:
//+ Soma
//- Subtra��o
//* Multiplica��o
/// Divis�o
//s Sair
//Em seguida seja exibido na tela o resultado da opera��o escolhida entre os dois valores digitados. 
//A estrutura toda deve estar dentro de um la�o "while" e deve se repetir at� que o usu�rio digite "s" no menu.

import java.util.Scanner;

public class Exercicio4 {


	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		// Calculadora calculo

		System.out.println("Digite o 1o valor:");
		double valor1 = ler.nextDouble();
		System.out.println("Digite o 2o valor:");
		double valor2 = ler.nextDouble();
		String opcao = "x";
		// a ! (nega��o) converte true pra false e false pra true; ele inverte true/false 
		while (!opcao.equalsIgnoreCase("s")) {
			System.out.println("Escolha a opera��o:");
			System.out.println("+ Soma");
			System.out.println("- Subtra��o");
			System.out.println("* Multiplica��o");
			System.out.println("/ Divis�o");
			System.out.println("s Sair");
			opcao = ler.next();
			switch (opcao) {
			case "+":
				System.out.println("Soma dos valores: " + (valor1 + valor2));
				break;
			case "-":
				System.out.println("Subtra��o dos valores: " + (valor1 - valor2));
				break;
			case "*":
				System.out.println("Multiplica��o dos valores: " + (valor1 * valor2));
				break;
			case "/":
				System.out.println("Divis�o dos valores: " + (valor1 / valor2));
				break;
			case "s":
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		}
	}
}
		
