import java.util.Scanner;

//5- Crie uma classe chamada �Carro�. Coloque nesta classe os atributos privados: modelo, marca, anoFabricacao, cor e quilometragem (escolham corretamente o tipo de vari�vel para cada atributo). 
//Crie um construtor completo (que receba valor para todos atributos) e todos os m�todos getters e setters. 
//Crie uma outra classe com m�todo main e crie um objeto da classe Carro nela, pedindo para o usu�rio digitar o modelo, 
//arca, o ano de fabrica��o, 
//a cor e a quilometragem deste carro e exiba as informa��es digitadas na tela usando o System.out.println.

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		System.out.println("Digite o modelo do carro:");
		carro1.setModelo(ler.next());
		System.out.println("Digite a marca do carro:");
		carro1.setMarca(ler.next());
		System.out.println("Digite o ano de fabrica��o do carro:");
		carro1.setAnoFabricacao(ler.nextInt());
		System.out.println("Digite a cor do carro:");
		carro1.setCor(ler.next());
		System.out.println("Digite a quilometragem do carro:");
		carro1.setQuilometragem(ler.nextDouble());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Ano: " + carro1.getAnoFabricacao());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Quilometragem: " + carro1.getQuilometragem());
	}	
}
