
// 3 exemplos de Switch

import java.util.Scanner;

public class AprendendoSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma opção:");
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
			System.out.println("Opção inválida!");
		}

		System.out.println("Digite a nota de um aluno:");
		int nota = ler.nextInt();
		switch (nota) {
		case 0:
			System.out.println("Só Jesus na causa!");
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
			System.out.println("Nota na média!");
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
			System.out.println("Nota inválida!");
		}

		System.out.println("Digite a sigla do eu estado:");
		String estado = ler.next();
		switch (estado.toUpperCase()) {
		case "RS":
			System.out.println("Seu estado é o Rio Grande do Sul!");
			break;
		case "PR":
			System.out.println("Seu estado é o Paraná!");
			break;
		default:
			System.out.println("Estado não identificado!");
		}

	}

}
