import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {

		// CORRIGIDOS
		// Fazer um algoritmo que peça o preço de 2 produtos que o usuário está
		// comprando. Exibir o total
		// da compra e perguntar para quanto que precisa de troco. Quando o usuário
		// informar o valor,
		// verificar se ele é maior ou igual ao total da venda e informar quanto de
		// troco será dado; caso o
		// valor não seja suficiente, informar que a compra foi cancelada.

		// OBS: para aumentar e diminuir a fonte aperte crtl + e crtl -

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o preço do item 1:");
		double item1 = ler.nextDouble();

		System.out.println("Isira o preço do item 2:");
		double item2 = ler.nextDouble();

		double total = item1 + item2;
		System.out.println("quanto que vc precisa de troco?");
		double troco = ler.nextDouble();

		double total3 = troco - total;

		if (troco >= total) {
			System.out.println("O valor total a ser devolvido é R$" + total3 + "Reais");
		} else {
			System.out.println(" valor insuficiente, venda cancelada");
		}

	}
}
