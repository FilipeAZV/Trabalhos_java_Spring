
//While -> Equanto -> la�o de repeti��o que testa uma condi��o e executa os c�digos internos
//Enquanto a condi��o for true (verdadeira)

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
