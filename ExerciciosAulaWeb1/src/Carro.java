
public class Carro {
	private String modelo;
	private String marca;
	private int anoFabricacao;
	private String cor;
	private double quilometragem;

	public Carro() {
			
		}

	public Carro(String modelo, String marca, int anoFabricacao, String cor, double quilometragem) {
			this.modelo = modelo;
			this.marca = marca;
			this.anoFabricacao = anoFabricacao;
			this.cor = cor;
			this.quilometragem = quilometragem;
		}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getQuilometragem() {
		return this.quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
}
