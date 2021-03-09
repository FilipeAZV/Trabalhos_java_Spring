import java.util.Scanner;

public class Exercicios2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
//		1- Fa�a um algoritmo que leia o Nome, Valor Hora e Total de Horas Trabalhadas de um
//		funcion�rio. Calcule e exiba:
//		a) O sal�rio bruto;
//		b) O valor de Vale Transporte (6% do Sal�rio Bruto);
//		c) O desconto de Imposto de Renda (11% do Sal�rio Bruto para sal�rios superiores a R$
//		1650,00 ou ZERO caso o contr�rio);
//		d) O sal�rio l�quido.
		System.out.println("Escreva o nome do funcion�rio:");
		String nomeFuncionario = ler.next();
		System.out.println("Quanto ele ganha por hora?");
		double valorHora = ler.nextDouble();
		System.out.println("Quantas horas ele trabalhou?");
		int horasTrabalhadas = ler.nextInt();
		double salarioBruto = horasTrabalhadas * valorHora;
		System.out.println("Sal�rio bruto: " + salarioBruto);
		double valeTransporte = salarioBruto * 0.06;
		System.out.println("Desconto vale transporte: " + valeTransporte);
//		double descontoIR = 0;
//		if (salarioBruto > 1650) {
//			descontoIR = salarioBruto * 0.11;
//		}
		double descontoIR = salarioBruto > 1650 ? salarioBruto * 0.11 : 0; //stonks
		System.out.println("Desconto Imposto de Renda: " + descontoIR);
		double salarioLiquido = salarioBruto - valeTransporte - descontoIR;
		System.out.println("Sal�rio L�quido: " + salarioLiquido);
		
//		2- Fa�a um algoritmo que leia a primeira letra do estado civil de uma pessoa e, usando o
//		comando switch, informe o estado civil conforme tabela abaixo:
//		S - solteiro
//		C - Casado
//		D - Divorciado
//		V - Vi�vo
		System.out.println("Digite a letra inicial do seu estado civil:");
		String letra = ler.next();
		switch (letra.toUpperCase()) {
		case "S":
			System.out.println("Solteiro");
			break;
		case "C":
			System.out.println("Casado");
			break;
		case "D":
			System.out.println("Divorciado");
			break;
		case "V":
			System.out.println("Vi�vo");
			break;
		default:
			System.out.println("Estado civil n�o reconhecido");
		}
		
//		3- Construa um algoritmo que, tendo como dados de entrada o pre�o de um produto e seu
//		c�digo de origem, mostre o pre�o junto de sua proced�ncia. Caso o c�digo n�o seja nenhum
//		dos especificados, o produto deve ser encarado como importado. A tabela das proced�ncias �
//		a seguinte:
		System.out.println("Digite o pre�o do produto:");
		double precoProduto = ler.nextDouble();
		System.out.println("Digite o c�digo de origem:");
		int codigoOrigem = ler.nextInt();
		switch (codigoOrigem) {
		case 1:
			System.out.println("Pre�o: " + precoProduto + " - Sul");
			break;
		case 2:
			System.out.println("Pre�o: " + precoProduto + " - Norte");
			break;
		case 3:
			System.out.println("Pre�o: " + precoProduto + " - Leste");
			break;
		case 4:
			System.out.println("Pre�o: " + precoProduto + " - Oeste");
			break;
		case 5: 
		case 6:
			System.out.println("Pre�o: " + precoProduto + " - Nordeste");
			break;
		default:
			System.out.println("Pre�o: " + precoProduto + " - Importado");
			break;
		}
		
//		4- Fa�a um programa em que o usu�rio digite dois valores e em seguida seja exibido um menu:
//			+ Soma
//			- Subtra��o
//			* Multiplica��o
//			/ Divis�o
//			s Sair
//			Em seguida seja exibido na tela o resultado da opera��o escolhida entre os dois valores
//			digitados. A estrutura toda deve estar dentro de um la�o "while" e deve se repetir at� que o
//			usu�rio digite "s" no menu.
		System.out.println("Digite o 1o valor:");
		double valor1 = ler.nextDouble();
		System.out.println("Digite o 2o valor:");
		double valor2 = ler.nextDouble();
		String opcao = "x";
		// a ! (nega��o) converte true pra false e false pra true; ele inverte true/false 
		while (!opcao.equalsIgnoreCase("s")) {
			System.out.println("Escolha a opera��o:");
			System.out.println("+ Soma");
			System.out.println("- Subtra��o");
			System.out.println("* Multiplica��o");
			System.out.println("/ Divis�o");
			System.out.println("s Sair");
			opcao = ler.next();
			switch (opcao) {
			case "+":
				System.out.println("Soma dos valores: " + (valor1 + valor2));
				break;
			case "-":
				System.out.println("Subtra��o dos valores: " + (valor1 - valor2));
				break;
			case "*":
				System.out.println("Multiplica��o dos valores: " + (valor1 * valor2));
				break;
			case "/":
				System.out.println("Divis�o dos valores: " + (valor1 / valor2));
				break;
			case "s":
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		}
		
//		5- Crie uma classe chamada �Carro�. Coloque nesta classe os atributos privados: modelo,
//		marca, anoFabricacao, cor e quilometragem (escolham corretamente o tipo de vari�vel para
//		cada atributo). Crie um construtor completo (que receba valor para todos atributos) e todos
//		os m�todos getters e setters. Crie uma outra classe com m�todo main e crie um objeto da
//		classe Carro nela, pedindo para o usu�rio digitar o modelo, a marca, o ano de fabrica��o, a cor
//		e a quilometragem deste carro e exiba as informa��es digitas na tela usando o
//		System.out.println.
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
		
		System.out.println("Digite o modelo do carro:");
		String modelo = ler.next();
		System.out.println("Digite a marca do carro:");
		String marca = ler.next();
		System.out.println("Digite o ano de fabrica��o do carro:");
		int anoFabricacao = ler.nextInt();
		System.out.println("Digite a cor do carro:");
		String cor = ler.next();
		System.out.println("Digite a quilometragem do carro:");
		double quilometragem = ler.nextDouble();
		Carro carro2 = new Carro(modelo, marca, anoFabricacao, cor, quilometragem);
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Ano: " + carro2.getAnoFabricacao());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Quilometragem: " + carro2.getQuilometragem());
						
	}

}
