
public class AprendendoVariaveis {

	public static void main (String[] args) {
		
		System.out.println("Olá");
		System.out.println("Bora testar isso aqui");
		
		//variavéis são criadas sempre assim: tipo nome = valor; 
		int idade = 20; 
		int n1 = 2;
		int n2 = 5;
		
		//podemos utilizar o + (soma) com números para somá-los
		int resultado = n1 + n2;
		
		//podemos utilizar o + junto com textos para juntar informações em um texto só 
		//isso é chamado de concatenar / concatenação 
		System.out.println("Resultado da soma de n1 e n2: " + resultado + "!");
		
		// operações matáticas: + (soma) - (subtração) * (multiplicação) / (divisão) 
		int subtracao = n2 - n1; 
		int multiplicacao = n1 * 3;
		int divisao = n2 / n1; 
		System.out.println("Resultado da multiplicação: " + multiplicacao);
		System.out.println("Resultado da divisão: " + divisao);
		
		//string é o tipo de variavél que armazena textos (qualquer tipo de caracter)
		String nome = "Filipe Azevedo";
		String nome2 = "Levi Azevedo";
		System.out.println("O nome armazenado na variável nome é: " + nome);
		System.out.println("O nome armazenado na variável nome2 é: " + nome2);
		
		//Tipos de variavéis que armazenam números com vírgula (ponto flutuante):
		//float e double 
		//lembrete: usar . ao invés de , 
		double altura = 1.83; 
		double peso = 81.22;
		double valor = 55.20;
		System.out.println("Valor: R$ " + valor);
		
		//int = para números sem a vírgula
		//double = para números com vírgula 
		
	}

}

