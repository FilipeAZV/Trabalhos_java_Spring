import java.util.Scanner;

public class Exercicio_If_Else {

	public static void main(String[] args) {
		
		//Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Informe um valor qualquer");
		 int valor = ler.nextInt();
		 
		 if (valor > 0) {
			 System.out.println(" o valor "+valor+" � positivo");
			 
		 } else { 
			 System.out.println(" O valor "+valor+" � negativo");
			 
		//Ordem de precedencia matem�tica
			 
		// primeiro se resolve os ()
		// Depois a potencia
		// Depois a multiplica��o ou o divis�o do que vier primeiro
		//% (resto da divis�o) usa-se para verificar se o n�mero � par ou �mpar
		// + e - ser�o as �ltimas a serem feitas, tanto faz a ordem
			 
		
		//Verificar se um n�mero � �mpar ou par
			 
			 int n1;
			 int n2;
			 
			 if (n1 % 2 == 0) { 
				 System.out.println("Esse n�mero � par");
				 
			 } else { 
				 System.out.println("Esse n�mero � �mpar");
				 
				 		
				 
			 }
		
			 
		 }
		 
		
		
		
	}
}
