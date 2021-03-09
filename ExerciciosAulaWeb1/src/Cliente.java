
public class Cliente {

	// 1 - Crie uma classe chamada Cliente com os atributos: id, nome, idade,
	// telefone. Faça um programa para solicitar os
	// dados de quatro clientes e armazenar em um ArrayList de Cliente. Em
	// seguida exiba os dados de todos os clientes via System.out.println(),
	// formatando cada objeto separado por linhas.

	// id, nome, idade, telefone
	private int id;
	private String nome;
	private int idade;
	private String telefone;

	public Cliente() {

	}

	public Cliente(int id, String nome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
