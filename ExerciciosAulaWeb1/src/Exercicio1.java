import java.util.Scanner;

//1- Fa�a um algoritmo que leia o Nome, Valor Hora e Total de Horas Trabalhadas de um funcion�rio. Calcule e exiba:
//a) O sal�rio bruto; 
//b) O valor de Vale Transporte (6% do Sal�rio Bruto);
//c) O desconto de Imposto de Renda (11% do Sal�rio Bruto para sal�rios superiores a R$ 1650,00 ou ZERO caso o contr�rio);
//d) O sal�rio l�quido.

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.setNome(ler.next());
		System.out.println("Digite o valor que o funcion�rio ganha por hora: ");
		funcionario.setValorHora(ler.nextInt());
		System.out.println(" Digite o total de horas trabalhadas ");
		funcionario.setTotalHorasTrab(ler.nextInt());
		System.out.println(" Seu sal�rio bruto � de: " + funcionario.salario());
		System.out.println(" Valor do vale transporte � de: " + funcionario.vale());
		System.out.println("Imposto de renda ser�: " + funcionario.impostoRenda());
		System.out.println(" Seu sal�rio liquido � de: " + funcionario.salarioLiquido());;
	}
	
	
}
