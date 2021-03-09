public class Pessoa {

	///////////////////////////////////////////// ATRIBUTOS///////////////////////////////////////////////////
	// Métodos: são as ações
	// Atributos: Nome, idade, peso, altura, cor do cabelo
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private String corDoCabelo;

	/////////////////////////////////////////////// MÉTODOS////////////////////////////////////////////////////
	// criar o método construtor em branco
	public Pessoa() {
		this.nome = "Nome indefinido";
		this.corDoCabelo = "Cor indefinida";
	}

	// método construtor recebendo o nome como parâmetro/argumento
	public Pessoa(String nome) {
		this.nome = nome;
		this.corDoCabelo = "Cor indefinida";
	}

	// método construtor recebendo vários parâmetros/argumentos
	public Pessoa(String nome, int idade, double peso, double altura, String corDoCabelo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.corDoCabelo = corDoCabelo;
	}

	// getters e setters
	// get -> pegar, buscar
	// set -> definir, colocar
	// anatomia de um método:
	// public/private void/tipoDeRetorno nomeDoMetodo(nenhum ou quantos parametros
	// for utilizar) { }
	public String getNome() {
		return this.nome;
	}

	// void -> vazio em inglês, ou seja, método sem retorno
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCorDoCabelo() {
		return this.corDoCabelo;
	}

	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}

	public void falar(String mensagem) {
		System.out.println(this.nome + " diz:");
		System.out.println(mensagem);
	}

}
