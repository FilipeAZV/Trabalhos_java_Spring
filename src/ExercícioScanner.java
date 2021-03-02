import java.util.Scanner;

public class ExercícioScanner {
	
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
	System.out.println("Qual é a sua altura?");
	Double altura = ler.nextDouble();
	
	//Peso:
	System.out.println("Quanto voce pesa?");
	Double peso = ler.nextDouble();
	
	//Nacionalidade:
	System.out.println("Qual é a sua nacionalidade?");
	String nacionalidade = ler.next();
	
	//Telefone:
	System.out.println("Informe seu telefone:");
	String telefone = ler.next();
	
	//Idade:
	System.out.println("Informe sua idade:");
	int idade = ler.nextInt();
	
	//Endereço
	System.out.println("Em qual cidade voce reside atualmente?");
	String cidade = ler.next();
	
	//E-mail:
	System.out.println("Informe seu email:");
	String email = ler.next();
	
	//Número de residentes na casa:
	System.out.println("Quantas pessoas residem na sua casa atualmente:");
	int residem = ler.nextInt();
	
	//CPF:
	System.out.println("Informe seu CPF");
	String cpf = ler.next();
	
	//Animais de estimação:
	System.out.println("Quantos animais de estimação voce possui?");
	int animais = ler.nextInt();
	
	
	//Confirmação de dados: 
	
	System.out.println("--------------------------------------------------------------");
	System.out.println("Confirme seus dados:");
	System.out.println("--------------------------------------------------------------");
	
	System.out.println("Nome é: " +nome);
	System.out.println("Sobrenome é: " +sobrenome);
	System.out.println("Sua altura é de: " +altura);
	System.out.println("voce pesa: " +peso + "Kg");
	System.out.println("Nacionalidade: " +nacionalidade);
	System.out.println("Seu telefone é: " +telefone);
	System.out.println("Voce tem " + idade +" anos");
	System.out.println("Mora na cidade de: " +cidade);
	System.out.println("Seu e-mail é: " +email);
	System.out.println("Residem com voce: " +residem + " pessoas ");
	System.out.println("Seu CPF é: " +cpf);
	System.out.println("Possui:" + animais + " animais de estimação");
	


   	
	}



}
