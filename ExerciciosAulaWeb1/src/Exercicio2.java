import java.util.Scanner;

//2- Fa�a um algoritmo que leia a primeira letra do estado civil de uma pessoa e, 
//usando o comando switch, informe o estado civil conforme tabela abaixo:
//S - solteiro
//C - Casado
//D - Divorciado
//V - Vi�vo

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual seu estado civil?:");
		String estadoCivil = ler.next().toUpperCase();
		switch (estadoCivil) {
		case "S":
			System.out.println("voce � solteiro ");
			break;
		case "C":
			System.out.println("Voce � casado ");
			break;
		case "D":
			System.out.println("Voce � Divorciado ");
			break;
		case "V":
			System.out.println("Voce � Vi�vo ");
			break;
		default:
			System.out.println(" op��o inv�lida ");
		}

	}
}
