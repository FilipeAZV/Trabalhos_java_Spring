import java.util.Scanner;

public class AprendendoScanner {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite seu apelido");
		
		//next é próximo
		//Ler .next() pega a palavra digitada pelo usuário no console como uma String
		String apelido = ler.next();
		System.out.println("Seu apelido é: " + apelido);
		System.out.println("Digite sua idade:");
		
		//ler. nextInt() pega o próximo número inteiro digitando pelo usúario no console 
		int idade = ler .nextInt();
		System.out.println("Voce tem " + idade + " anos");
		System.out.println("Digite sua altura:");
		
		//ler .nextDouble() pega o próximo número com vírgula digitado pelo usuário no console 
		//no console, digitamos o double com , ao invés de . 
		double altura = ler .nextDouble();
		System.out.println("Voce tem " + altura + "m de altura");
		
		
	
		
	
		
		
	
     }

}
