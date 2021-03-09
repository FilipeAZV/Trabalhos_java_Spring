//Programa em que o usu�rio entra com o dia da semana, 1 domingo, 2 segunda..

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// modo com if e else
		System.out.println("Insira um n�mero que represente um dia da semana:");
		int diaSemana = ler.nextInt();

		/* if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("ter�a");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("Isso n�o � um dia da semana v�lido");
		}*/
		// Agora com o comando Switch:

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�o � um dia da semana v�lido");

		}

	}

}