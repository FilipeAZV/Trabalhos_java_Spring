
public class AprendendoVariaveis {

	public static void main (String[] args) {
		
		System.out.println("Ol�");
		System.out.println("Bora testar isso aqui");
		
		//variav�is s�o criadas sempre assim: tipo nome = valor; 
		int idade = 20; 
		int n1 = 2;
		int n2 = 5;
		
		//podemos utilizar o + (soma) com n�meros para som�-los
		int resultado = n1 + n2;
		
		//podemos utilizar o + junto com textos para juntar informa��es em um texto s� 
		//isso � chamado de concatenar / concatena��o 
		System.out.println("Resultado da soma de n1 e n2: " + resultado + "!");
		
		// opera��es mat�ticas: + (soma) - (subtra��o) * (multiplica��o) / (divis�o) 
		int subtracao = n2 - n1; 
		int multiplicacao = n1 * 3;
		int divisao = n2 / n1; 
		System.out.println("Resultado da multiplica��o: " + multiplicacao);
		System.out.println("Resultado da divis�o: " + divisao);
		
		//string � o tipo de variav�l que armazena textos (qualquer tipo de caracter)
		String nome = "Filipe Azevedo";
		String nome2 = "Levi Azevedo";
		System.out.println("O nome armazenado na vari�vel nome �: " + nome);
		System.out.println("O nome armazenado na vari�vel nome2 �: " + nome2);
		
		//Tipos de variav�is que armazenam n�meros com v�rgula (ponto flutuante):
		//float e double 
		//lembrete: usar . ao inv�s de , 
		double altura = 1.83; 
		double peso = 81.22;
		double valor = 55.20;
		System.out.println("Valor: R$ " + valor);
		
		//int = para n�meros sem a v�rgula
		//double = para n�meros com v�rgula 
		
	}

}

