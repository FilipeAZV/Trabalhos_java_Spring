import java.util.Scanner;

public class Excercicio_If_else {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu sal�rio:");
		double salario = ler.nextDouble();

		// 0 - 500 -> Sal�rio bem baixo
		// 501 - 1200 -> Sal�rio baixo
		// 1201 - 2500 - > Sal�rio m�dio
		// 2501 - 4500 - > Sal�rio alto
		// 4501 - 6500 - > Sal�rio bem alto
		// 6500 - ou + -> Bill gates, bixo � brabo..

		if (salario <= 1200) {
			System.out.println(" Sal�rio baixo");
		} else if (salario <= 2500) {
			System.out.println(" Sal�rio baixo");
		} else if (salario <= 4500) {
			System.out.println("Sal�rio m�dio");
		} else if (salario <= 6500) {
			System.out.println("Sal�io bem alto");
		} else {
			System.out.println("Bill gates, bixo � brabo!");

		}
	}

}
