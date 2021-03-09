
// 3 exemplos de Switch

import java.util.Scanner;

public class AprendendoSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma op��o:");
		System.out.println("1- Dizer oi");
		System.out.println("2- Dizer tchau");
		System.out.println("3- Dizer boa noite");
		int opcao = ler.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Oi!");
			break;
		case 2:
			System.out.println("Tchau!");
			break;
		case 3:
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}

		System.out.println("Digite a nota de um aluno:");
		int nota = ler.nextInt();
		switch (nota) {
		case 0:
			System.out.println("S� Jesus na causa!");
		case 1:
		case 2:
		case 3:
			System.out.println("Nota muito baixa! vai estudar vivente!!");
			break;
		case 4:
		case 5:
			System.out.println("Nota baixa!");
			break;
		case 6:
			System.out.println("Nota na m�dia!");
			break;
		case 7:
		case 8:
			System.out.println("Nota alta!");
			break;
		case 9:
		case 10:
			System.out.println("Nota muito alta!");
			break;
		default:
			System.out.println("Nota inv�lida!");
		}

		System.out.println("Digite a sigla do eu estado:");
		String estado = ler.next();
		switch (estado.toUpperCase()) {
		case "RS":
			System.out.println("Seu estado � o Rio Grande do Sul!");
			break;
		case "PR":
			System.out.println("Seu estado � o Paran�!");
			break;
		default:
			System.out.println("Estado n�o identificado!");
		}

	}

}
