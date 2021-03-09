import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {

		System.out.println("Digite a idade do atleta:");
		
		int idade = ler.nextInt();

		// Classificar o atleta de acordo com a seguinte tabela:
		// 0 - 15 anos -> Juvenil
		// 16 - 18 anos -> Sub-18
		// 19 - 20 anos -> Sub-20
		// 21 - 39 anos -> Profissional
		// 40 ou + -> Veterano

		if (idade <= 15) {
			System.out.println("Atleta Juvenil");
		} else if (idade <= 18) {
			System.out.println("Atleta Sub-18");
		} else if (idade <= 20) {
			System.out.println("Atleta Sub-20");
		} else if (idade <= 39) {
			System.out.println("Atleta profissional");
		} else {
			System.out.println("Atleta Veterano");

		}

	}
}
