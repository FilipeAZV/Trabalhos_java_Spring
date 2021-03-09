import java.util.Scanner;

public class AprendendoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		// while -> enquanto
		// laço de repetição que testa uma condição e executa os códigos internos
		// enquanto a condição for true (verdadeira)
		int vidaDoInimigo = 1000;
		while (vidaDoInimigo > 0) {
			System.out.println("Vida do inimigo: " + vidaDoInimigo);
			System.out.println("Digite o dano do seu golpe:");
			int dano = ler.nextInt();
			System.out.println("Você ataca causando " + dano + " de dano!");
			vidaDoInimigo -= dano;
		}
		System.out.println("Você derrotou o inimigo!");
		
	}
	
}
