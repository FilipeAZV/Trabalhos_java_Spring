
//		1 - Crie uma classe chamada Cliente com os atributos: id, nome, idade, telefone. Faça um
//		programa para solicitar os dados de quatro clientes e armazenar em um ArrayList de Cliente.
//		Em seguida exiba os dados de todos os clientes via System.out.println(), formatando cada
//		objeto separado por linhas.

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1ArrayList {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	for(int i = 0;i<4;i++) {
	

		System.out.println("Cadastrando novo cliente:");
		Cliente novoCliente = new Cliente();
		System.out.println("Digite o id do cliente:");
		novoCliente.setId(ler.nextInt());
		System.out.println("Digite o nome do cliente:");
		novoCliente.setNome(ler.next());
		System.out.println("Digite a idade do cliente:");
		novoCliente.setIdade(ler.nextInt());
		System.out.println("Digite o telefone do cliente:");
		novoCliente.setTelefone(ler.next());
		clientes.add(novoCliente);
		System.out.println("Cliente cadastrado!");
		}
		for (Cliente cliente : clientes) {
			System.out.println("Id do cliente: " + cliente.getId());
			System.out.println("Nome do cliente: " + cliente.getNome());
			System.out.println("Idade do cliente: " + cliente.getIdade());
			System.out.println("Telefone do cliente: " + cliente.getTelefone());
		}

		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			System.out.println("Id do cliente: " + cliente.getId());
			System.out.println("Nome do cliente: " + cliente.getNome());
			System.out.println("Idade do cliente: " + cliente.getIdade());
			System.out.println("Telefone do cliente: " + cliente.getTelefone());
		}

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("Id do cliente: " + clientes.get(i).getId());
			System.out.println("Nome do cliente: " + clientes.get(i).getNome());
			System.out.println("Idade do cliente: " + clientes.get(i).getIdade());
			System.out.println("Telefone do cliente: " + clientes.get(i).getTelefone());
		}

	}

}
