import java.util.Scanner;

public class AprendendoScanner {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite seu apelido");
		
		//next � pr�ximo
		//Ler .next() pega a palavra digitada pelo usu�rio no console como uma String
		String apelido = ler.next();
		System.out.println("Seu apelido �: " + apelido);
		System.out.println("Digite sua idade:");
		
		//ler. nextInt() pega o pr�ximo n�mero inteiro digitando pelo us�ario no console 
		int idade = ler .nextInt();
		System.out.println("Voce tem " + idade + " anos");
		System.out.println("Digite sua altura:");
		
		//ler .nextDouble() pega o pr�ximo n�mero com v�rgula digitado pelo usu�rio no console 
		//no console, digitamos o double com , ao inv�s de . 
		double altura = ler .nextDouble();
		System.out.println("Voce tem " + altura + "m de altura");
		
		
	
		
	
		
		
	
     }

}
