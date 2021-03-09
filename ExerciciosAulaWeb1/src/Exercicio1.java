import java.util.Scanner;

//1- Faça um algoritmo que leia o Nome, Valor Hora e Total de Horas Trabalhadas de um funcionário. Calcule e exiba:
//a) O salário bruto; 
//b) O valor de Vale Transporte (6% do Salário Bruto);
//c) O desconto de Imposto de Renda (11% do Salário Bruto para salários superiores a R$ 1650,00 ou ZERO caso o contrário);
//d) O salário líquido.

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		System.out.println("Digite o nome do funcionário: ");
		funcionario.setNome(ler.next());
		System.out.println("Digite o valor que o funcionário ganha por hora: ");
		funcionario.setValorHora(ler.nextInt());
		System.out.println(" Digite o total de horas trabalhadas ");
		funcionario.setTotalHorasTrab(ler.nextInt());
		System.out.println(" Seu salário bruto é de: " + funcionario.salario());
		System.out.println(" Valor do vale transporte é de: " + funcionario.vale());
		System.out.println("Imposto de renda será: " + funcionario.impostoRenda());
		System.out.println(" Seu salário liquido é de: " + funcionario.salarioLiquido());;
	}
	
	
}
