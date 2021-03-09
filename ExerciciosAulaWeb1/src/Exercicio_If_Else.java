import java.util.Scanner;

public class Exercicio_If_Else {

	public static void main(String[] args) {
		
		//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Informe um valor qualquer");
		 int valor = ler.nextInt();
		 
		 if (valor > 0) {
			 System.out.println(" o valor "+valor+" é positivo");
			 
		 } else { 
			 System.out.println(" O valor "+valor+" é negativo");
			 
		//Ordem de precedencia matemática
			 
		// primeiro se resolve os ()
		// Depois a potencia
		// Depois a multiplicação ou o divisão do que vier primeiro
		//% (resto da divisão) usa-se para verificar se o número é par ou ímpar
		// + e - serão as últimas a serem feitas, tanto faz a ordem
			 
		
		//Verificar se um número é ímpar ou par
			 
			 int n1;
			 int n2;
			 
			 if (n1 % 2 == 0) { 
				 System.out.println("Esse número é par");
				 
			 } else { 
				 System.out.println("Esse número é ímpar");
				 
				 		
				 
			 }
		
			 
		 }
		 
		
		
		
	}
}
