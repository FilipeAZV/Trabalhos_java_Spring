import java.util.Scanner;

public class TrabalhoIMC_Filipe_Azevedo {

	public static void main(String[] args) {

		//Fa�a um programa que leia o peso e a altura do usu�rio. Ap�s, calcule o IMC (�ndice 
		//de massa corporal) da pessoa de acordo com a seguinte f�rmula:
		//imc = peso / (altura * altura)
		
		//Informe para o usu�rio qual o seu IMC e depois classifique-o de acordo com a 
		//tabela da imagem em anexo e informe esta classifica��o tamb�m.
		
		//Aten��o: fa�a este trabalho em uma nova classe Java (por exemplo: Trabalho1.java 
		//ou TrabalhoIMC.java) e entregue aqui o arquivo .java finalizado.
		
		//MEDIDOR IMC 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = ler.nextDouble();
		
		System.out.println("Digite sua altura");
		double altura = ler.nextDouble();
		
		double imc = peso / (altura*altura);

		if (imc < 17) { 
			System.out.println(" Seu IMC �: " +imc+ " Muito abaixo do peso, vai comer feij�o meu " );
		} else if (imc < 18.5) {
			System.out.println(" Seu IMC �:" +imc+ " Abaixo do peso, te cuite vivente! ");
		} else if (imc < 25) {
			System.out.println(" Seu IMC �:" +imc+ " voce est� com o peso normal, show! ");
		} else if (imc < 30) {
			System.out.println(" Seu IMC �: "+imc+ " voce est� acima do peso ");
		} else if (imc < 35) {
			System.out.println(" Seu IMC �: " +imc+" Gordo, te cuida ai! ");
		} else if (imc < 40) {
			System.out.println("Seu IMC �: " +imc+ " Obeso 2 (Severa), vai var umas corridas, se n�o explode!");
		} else {
			System.out.println("Seu IMC �:" +imc+ " Obesidade 3, m�rbida! balofo! ");
			
			
	
	
				
		}
		
	
		
		
		
		
		
		
		
		
	}
}