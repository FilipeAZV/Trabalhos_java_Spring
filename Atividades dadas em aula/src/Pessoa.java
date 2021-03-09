
public class Pessoa {

	// Atributos: Nome, idade, peso, altura, cor do cabelo
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private String corDoCabelo;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	// criar o m�todo construtor em branco
	public Pessoa() {
		this.nome = "Nome indefinido";
		this.corDoCabelo = "Cor indefinida";
	}

	// m�todo construtor recebendo o nome como par�metro/argumento
	public Pessoa(String nome) {
		this.nome = nome;
		this.corDoCabelo = "Cor indefinida";
	}

	// m�todo construtor recebendo v�rios par�metros/argumentos
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
	// anatomia de um m�todo:
	// public/private void/tipoDeRetorno nomeDoMetodo(nenhum ou quantos parametros
	// for utilizar) { }
	public String getNome() {
		return this.nome;
	}

	// void -> vazio em ingl�s, ou seja, m�todo sem retorno
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
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
	
	

	public int getDiaNascimento() {
		return this.diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return this.mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return this.anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void falar(String mensagem) {
		System.out.println(this.nome + " diz:");
		System.out.println(mensagem);
	}

	public double imc() {
		return this.peso / (this.altura * this.altura);
	}

	public String classificacaoImc() {
		if (this.imc() < 17) {
			return "Muito abaixo do peso, vai comer feij�o meu ";
		} else if (this.imc() < 18.5) {
			return "Abaixo do peso";
		} else if (this.imc() < 25) {
			return "Voce est� com o peso normal";
		} else if (this.imc() < 30) {
			return "Voce est� acima do peso";
		} else if (this.imc() < 35) {
			return "Obesidade 1, te cuida!";
		} else if (this.imc() < 40) {
			return "Obesidade 2 (Severa), vai var umas corridas, se n�o explode!";
		} else {
			return "Obesidade 3, m�rbida!";
		}
	}
	
	// 1 - fazer os getter e setters dos atributos diaNascimento, mesNascimento, anoNascimento
	
	// 2 - calcular a idade da pessoa atrav�s dos atributos diaNascimento, mesNascimento, anoNascimento
	// e retornar no m�todo abaixo:
	public int idadePeloNascimento() {
		//podem considerar o dia de hoje (25/05/2020)
		//simulando que nasceu 28/05/2000
		int idade = 2020 - this.anoNascimento;
		if (this.mesNascimento > 5) {
			idade -= 1;
		} else if (this.mesNascimento == 5) {
			if (this.diaNascimento > 25) {
				idade -= 1;
			}
		}
		return idade;
	}

}
