import java.util.Scanner;

public class ExerciciosIf {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//1- Fazer um algoritmo que pe�a o pre�o de 2 produtos que o usu�rio
		//est� comprando. Exibir o total da compra e perguntar para quanto que
		//precisa de troco. Quando o usu�rio informar o valor, verificar se ele
		//� maior ou igual ao total da venda e informar quanto de troco ser� 
		//dado; caso o valor n�o seja suficiente, informar que a compra foi cancelada.
		
		System.out.println("Exerc�cio 1:");
		System.out.println("Digite o pre�o do 1o produto:");
		double produto1 = ler.nextDouble();
		System.out.println("Digite o pre�o do 2o produto:");
		double produto2 = ler.nextDouble();
		double total = produto1 + produto2;
		System.out.println("Para quanto voc� precisa de troco?");
		double troco = ler.nextDouble();
		if (troco < total) {
			System.out.println("Valor insuficiente. Venda cancelada!");
		} else {
			double sobra = troco - total;
			System.out.println("Seu troco ser� de R$ " + sobra);
			System.out.println("Volte sempre!");
		}
		
		//2- Pe�a para o usu�rio digitar dois n�meros inteiros e depois diga qual
		//� o maior deles.
		
		System.out.println("Exerc�cio 2:");
		System.out.println("Digite um n�mero inteiro:");
		int numero1 = ler.nextInt();
		System.out.println("Digite outro n�mero inteiro:");
		int numero2 = ler.nextInt();
		if (numero1 >= numero2) {
			System.out.println("O maior n�mero � " + numero1);
		} else {
			System.out.println("O maior n�mero � " + numero2);
		}
		
		//3- Fa�a um algoritmo que leia dois valores inteiros equivalentes a hora inicial
		//e final de um jogo. Retorne o tempo de dura��o deste jogo sabendo que o jogo pode
		//come�ar em um dia e terminar em outro, e que o tempo m�ximo de jogo � 24 horas.

		//Exemplo 1: Jogo iniciou na hora 13 e encerrou na hora 17. Dura��o do jogo: 4 horas

		//Exemplo 2: Jogo iniciou na hora 22 e encerrou na hora 03. Dura��o do jogo: 5 horas
		
		System.out.println("Exerc�cio 3:");
		System.out.println("Qual o hor�rio de inicio da partida?");
		int horarioInicial = ler.nextInt();
		System.out.println("Qual o hor�rio de t�rmino da partida?");
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
