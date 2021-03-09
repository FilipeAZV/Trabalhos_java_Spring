
//3- Construa um algoritmo que, tendo como dados de entrada o preço de um produto e seu código de origem,
//mostre o preço junto de sua procedência. Caso o código não seja nenhum dos especificados, 
//o produto deve ser encarado como importado. A tabela das procedências é a seguinte:

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println(" Informe o código de origem do produto ");
		int CodOrigem = ler.nextInt();
		System.out.println("Infome o preço do produto");
		double precoProd = ler.nextDouble();

		if (CodOrigem == 1) {
			System.out.println("Procedencia Sul ");
			System.out.printf(" Valor: %.2f", precoProd);
		} else if (CodOrigem == 2) {
			System.out.println("Procedencia Norte");
			System.out.printf(" Valor: %.2f", precoProd);
		} else if (CodOrigem == 3) {
			System.out.println("Procedencia Leste");
			System.out.printf(" Valor: %.2f", precoProd);
		} else if (CodOrigem == 4) {
			System.out.println("Procedencia Oeste");
			System.out.printf(" Valor: %.2f", precoProd);
		} else if ((CodOrigem == 5) || (CodOrigem == 6)) {
			System.out.println("Procedencia nordeste");
			System.out.printf(" Valor: %.2f", precoProd);
		} else {
			System.out.println(" Produto importado ");
		}

		// (%.2f) Curisidade do Savio
		// % -> formatar dois números depois da vírgula
		// 2f -> Mostra dois números depois da vírgula
	}
}
