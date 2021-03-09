
//While -> Equanto -> laço de repetição que testa uma condição e executa os códigos internos
//Enquanto a condição for true (verdadeira)

import java.util.Scanner;

public class AprendendoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vidaDoInimigo = 1000;
		while(vidaDoInimigo > 0) { 
			System.out.println("Vida do inimigo: " + vidaDoInimigo);
			System.out.println("Digite o dano do seu golpe:");
			int dano = ler.nextInt();
			System.out.println("Voce ataca causando " + dano + " de dano!");
			vidaDoInimigo -= dano; 
			
			System.out.println("Voce derrotou o inimigo!");
		}
	}
}
