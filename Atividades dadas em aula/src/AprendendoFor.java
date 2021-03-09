import java.util.ArrayList;
import java.util.Scanner;

public class AprendendoFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> marcas = new ArrayList<String>();
		
		// for (inicia um contador; avalia uma condi��o; incrementa ou diminui o contador)
		// inicia um contador -> normalmente � um int e chamado de i que come�a com valor 0
		// avalia uma condi��o -> normalmente � avaliado o contador com <, <=, ==, > ou >=
		// incrementa ou diminui o contador -> i++ ou i--
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite uma marca:");
			marcas.add(ler.next());
		}
		
		System.out.println("Quantidade de marcas cadastradas: " + marcas.size());
		
		System.out.println("Todas as marcas que foram cadastradas:");
		for (int i = 0; i < marcas.size(); i++) {
			System.out.println(marcas.get(i));
		}
	}
	
}
