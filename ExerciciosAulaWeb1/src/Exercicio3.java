
//3- Construa um algoritmo que, tendo como dados de entrada o pre�o de um produto e seu c�digo de origem,
//mostre o pre�o junto de sua proced�ncia. Caso o c�digo n�o seja nenhum dos especificados, 
//o produto deve ser encarado como importado. A tabela das proced�ncias � a seguinte:

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println(" Informe o c�digo de origem do produto ");
		int CodOrigem = ler.nextInt();
		System.out.println("Infome o pre�o do produto");
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
		// % -> formatar dois n�meros depois da v�rgula
		// 2f -> Mostra dois n�meros depois da v�rgula
	}
}
