
// Atividade loiane.training

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println(" Me diga a sua idade");

		int idade = ler.nextInt();

		if (idade >= 18) {
			System.out.println(" Voce é menor de idade, vai estudar!");

		} else {
			System.out.println(" Bom nesse caso voce tem: " + idade + " anos é maior de idade, ai sim! ");
		}

		
	}
}
