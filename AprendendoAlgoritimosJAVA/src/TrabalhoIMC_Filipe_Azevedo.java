import java.util.Scanner;

public class TrabalhoIMC_Filipe_Azevedo {

	public static void main(String[] args) {

		//Faça um programa que leia o peso e a altura do usuário. Após, calcule o IMC (índice 
		//de massa corporal) da pessoa de acordo com a seguinte fórmula:
		//imc = peso / (altura * altura)
		
		//Informe para o usuário qual o seu IMC e depois classifique-o de acordo com a 
		//tabela da imagem em anexo e informe esta classificação também.
		
		//Atenção: faça este trabalho em uma nova classe Java (por exemplo: Trabalho1.java 
		//ou TrabalhoIMC.java) e entregue aqui o arquivo .java finalizado.
		
		//MEDIDOR IMC 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = ler.nextDouble();
		
		System.out.println("Digite sua altura");
		double altura = ler.nextDouble();
		
		double imc = peso / (altura*altura);

		if (imc < 17) { 
			System.out.println(" Seu IMC é: " +imc+ " Muito abaixo do peso, vai comer feijão meu " );
		} else if (imc < 18.5) {
			System.out.println(" Seu IMC é:" +imc+ " Abaixo do peso, te cuite vivente! ");
		} else if (imc < 25) {
			System.out.println(" Seu IMC é:" +imc+ " voce está com o peso normal, show! ");
		} else if (imc < 30) {
			System.out.println(" Seu IMC é: "+imc+ " voce está acima do peso ");
		} else if (imc < 35) {
			System.out.println(" Seu IMC é: " +imc+" Gordo, te cuida ai! ");
		} else if (imc < 40) {
			System.out.println("Seu IMC é: " +imc+ " Obeso 2 (Severa), vai var umas corridas, se não explode!");
		} else {
			System.out.println("Seu IMC é:" +imc+ " Obesidade 3, mórbida! balofo! ");
			
			
	
	
				
		}
		
	
		
		
		
		
		
		
		
		
	}
}