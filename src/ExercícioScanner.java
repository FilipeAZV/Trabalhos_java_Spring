import java.util.Scanner;

public class Exerc�cioScanner {
	
	public static void main(String[] args) {
	
	//CADASTRO: 
	
	//Nome:
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe seu nome:");
	String nome = ler.next();
	
	//Sobrenome:
	System.out.println("Informe seu sobrenome:");
	String sobrenome = ler.next();
	
	//Atura:
	System.out.println("Qual � a sua altura?");
	Double altura = ler.nextDouble();
	
	//Peso:
	System.out.println("Quanto voce pesa?");
	Double peso = ler.nextDouble();
	
	//Nacionalidade:
	System.out.println("Qual � a sua nacionalidade?");
	String nacionalidade = ler.next();
	
	//Telefone:
	System.out.println("Informe seu telefone:");
	String telefone = ler.next();
	
	//Idade:
	System.out.println("Informe sua idade:");
	int idade = ler.nextInt();
	
	//Endere�o
	System.out.println("Em qual cidade voce reside atualmente?");
	String cidade = ler.next();
	
	//E-mail:
	System.out.println("Informe seu email:");
	String email = ler.next();
	
	//N�mero de residentes na casa:
	System.out.println("Quantas pessoas residem na sua casa atualmente:");
	int residem = ler.nextInt();
	
	//CPF:
	System.out.println("Informe seu CPF");
	String cpf = ler.next();
	
	//Animais de estima��o:
	System.out.println("Quantos animais de estima��o voce possui?");
	int animais = ler.nextInt();
	
	
	//Confirma��o de dados: 
	
	System.out.println("--------------------------------------------------------------");
	System.out.println("Confirme seus dados:");
	System.out.println("--------------------------------------------------------------");
	
	System.out.println("Nome �: " +nome);
	System.out.println("Sobrenome �: " +sobrenome);
	System.out.println("Sua altura � de: " +altura);
	System.out.println("voce pesa: " +peso + "Kg");
	System.out.println("Nacionalidade: " +nacionalidade);
	System.out.println("Seu telefone �: " +telefone);
	System.out.println("Voce tem " + idade +" anos");
	System.out.println("Mora na cidade de: " +cidade);
	System.out.println("Seu e-mail �: " +email);
	System.out.println("Residem com voce: " +residem + " pessoas ");
	System.out.println("Seu CPF �: " +cpf);
	System.out.println("Possui:" + animais + " animais de estima��o");
	


   	
	}



}
