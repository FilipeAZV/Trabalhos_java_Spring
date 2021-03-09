

//4 - Faça um programa em que o usuário digite dois valores e em seguida seja exibido um menu:
//+ Soma
//- Subtração
//* Multiplicação
/// Divisão
//s Sair
//Em seguida seja exibido na tela o resultado da operação escolhida entre os dois valores digitados. 
//A estrutura toda deve estar dentro de um laço "while" e deve se repetir até que o usuário digite "s" no menu.

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
		// a ! (negação) converte true pra false e false pra true; ele inverte true/false 
		while (!opcao.equalsIgnoreCase("s")) {
			System.out.println("Escolha a operação:");
			System.out.println("+ Soma");
			System.out.println("- Subtração");
			System.out.println("* Multiplicação");
			System.out.println("/ Divisão");
			System.out.println("s Sair");
			opcao = ler.next();
			switch (opcao) {
			case "+":
				System.out.println("Soma dos valores: " + (valor1 + valor2));
				break;
			case "-":
				System.out.println("Subtração dos valores: " + (valor1 - valor2));
				break;
			case "*":
				System.out.println("Multiplicação dos valores: " + (valor1 * valor2));
				break;
			case "/":
				System.out.println("Divisão dos valores: " + (valor1 / valor2));
				break;
			case "s":
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}
		
