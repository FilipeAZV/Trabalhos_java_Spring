import java.util.Scanner;

public class Excercicio_If_else {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu salário:");
		double salario = ler.nextDouble();

		// 0 - 500 -> Salário bem baixo
		// 501 - 1200 -> Salário baixo
		// 1201 - 2500 - > Salário médio
		// 2501 - 4500 - > Salário alto
		// 4501 - 6500 - > Salário bem alto
		// 6500 - ou + -> Bill gates, bixo é brabo..

		if (salario <= 1200) {
			System.out.println(" Salário baixo");
		} else if (salario <= 2500) {
			System.out.println(" Salário baixo");
		} else if (salario <= 4500) {
			System.out.println("Salário médio");
		} else if (salario <= 6500) {
			System.out.println("Saláio bem alto");
		} else {
			System.out.println("Bill gates, bixo é brabo!");

		}
	}

}
