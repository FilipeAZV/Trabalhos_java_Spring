
	   
import java.util.Scanner;

 //Caracteristicas (atributos)
 // Ações (Métodos)
	
public class AprendendoObjetos {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Pessoa professor = new Pessoa();
		professor.setNome("Carlos");
		professor.setIdade(33);
		professor.setAltura(1.83);
		professor.setPeso(91.2);
		professor.setCorDoCabelo("Preto");
		System.out.println("Nome do professor: " + professor.getNome());
		System.out.println("Idade do professor: " + professor.getIdade());
		System.out.println("Altura do professor: " + professor.getAltura());		
		
		//ex
		Pessoa aluno1 = new Pessoa();
		System.out.println("Nome do aluno1: " + aluno1.getNome());
		System.out.println("Idade do aluno1: " + aluno1.getIdade());
		System.out.println("Altura do aluno1: " + aluno1.getAltura());
		
		//ex
		Pessoa aluno2 = new Pessoa("Gabriela");
		System.out.println("Nome do aluno2: " + aluno2.getNome());
		
		//ex
		Pessoa aluno3 = new Pessoa("Filipe", 20, 72.2, 1.71, "Castanho");
		System.out.println("Nome do aluno3: " + aluno3.getNome());
		System.out.println("Idade do aluno3: " + aluno3.getIdade());
		System.out.println("Altura do aluno3: " + aluno3.getAltura());
		
		//ex
		Pessoa aluno4 = new Pessoa();
		System.out.println("Digite o nome do aluno4:");
		aluno4.setNome(ler.next());
		System.out.println("Digite a idade do aluno4:");
		aluno4.setIdade(ler.nextInt());
		System.out.println("Digite a altura do aluno4:");
		aluno4.setAltura(ler.nextDouble());
		System.out.println("Digite o peso do aluno4:");
		aluno4.setPeso(ler.nextDouble());
		System.out.println("Digite a cor do cabelo do aluno4:");
		aluno4.setCorDoCabelo(ler.next());
		aluno4.falar("Olá! Tudo bem?");
		System.out.println("IMC do aluno4 é: " + aluno4.imc());
		
		//ex Pessoa, Getters e Setters
		// 2 - calcular a idade da pessoa através dos atributos diaNascimento,
		// mesNascimento, anoNascimento
		// e retornar no método abaixo:
		//public int idadePeloNascimento() {
		// podem considerar o dia de hoje (25/05/2020)

		Pessoa2 aluno5 = new pessoa2();
		System.out.println("Digite o dia do seu nascimento: ");
		aluno5.setDiaNascimento(ler.nextInt());
		System.out.println("Digite o mês do seu nascimento: ");
		aluno5.setMesNascimento(ler.nextInt());
		System.out.println("Digite o ano do seu nascimento: ");
		aluno5.setAnoNascimentto(ler.nextInt());
		System.out.println("A sua idade é: " +aluno5.idadePeloNascimento);
	
	
	
		
		
		
	}

}