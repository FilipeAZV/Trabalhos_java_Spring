import java.util.Scanner;

public class ExerciciosIf {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//1- Fazer um algoritmo que peça o preço de 2 produtos que o usuário
		//está comprando. Exibir o total da compra e perguntar para quanto que
		//precisa de troco. Quando o usuário informar o valor, verificar se ele
		//é maior ou igual ao total da venda e informar quanto de troco será 
		//dado; caso o valor não seja suficiente, informar que a compra foi cancelada.
		
		System.out.println("Exercício 1:");
		System.out.println("Digite o preço do 1o produto:");
		double produto1 = ler.nextDouble();
		System.out.println("Digite o preço do 2o produto:");
		double produto2 = ler.nextDouble();
		double total = produto1 + produto2;
		System.out.println("Para quanto você precisa de troco?");
		double troco = ler.nextDouble();
		if (troco < total) {
			System.out.println("Valor insuficiente. Venda cancelada!");
		} else {
			double sobra = troco - total;
			System.out.println("Seu troco será de R$ " + sobra);
			System.out.println("Volte sempre!");
		}
		
		//2- Peça para o usuário digitar dois números inteiros e depois diga qual
		//é o maior deles.
		
		System.out.println("Exercício 2:");
		System.out.println("Digite um número inteiro:");
		int numero1 = ler.nextInt();
		System.out.println("Digite outro número inteiro:");
		int numero2 = ler.nextInt();
		if (numero1 >= numero2) {
			System.out.println("O maior número é " + numero1);
		} else {
			System.out.println("O maior número é " + numero2);
		}
		
		//3- Faça um algoritmo que leia dois valores inteiros equivalentes a hora inicial
		//e final de um jogo. Retorne o tempo de duração deste jogo sabendo que o jogo pode
		//começar em um dia e terminar em outro, e que o tempo máximo de jogo é 24 horas.

		//Exemplo 1: Jogo iniciou na hora 13 e encerrou na hora 17. Duração do jogo: 4 horas

		//Exemplo 2: Jogo iniciou na hora 22 e encerrou na hora 03. Duração do jogo: 5 horas
		
		System.out.println("Exercício 3:");
		System.out.println("Qual o horário de inicio da partida?");
		int horarioInicial = ler.nextInt();
		System.out.println("Qual o horário de término da partida?");
		int horarioFinal = ler.nextInt();
		if (horarioFinal > horarioInicial) {
			int duracao = horarioFinal - horarioInicial;
			System.out.println("A partida durou " + duracao + " hora(s).");
		} else {
			int duracao = 24 - horarioInicial + horarioFinal;
			System.out.println("A partida durou " + duracao + " hora(s).");
		}
		
		
	}
	
}
