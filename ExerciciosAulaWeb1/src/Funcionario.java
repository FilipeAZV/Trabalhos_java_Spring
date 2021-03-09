
public class Funcionario {

	private String nome;
	private double valorHora;
	private double totalHorasTrab;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double vale() {

		return (this.salario() * 6) / 100;
	}

	public double salario() {
		return this.valorHora * this.totalHorasTrab;
	}

	public double impostoRenda() {
		if (this.salario() > 1650) {
			return (this.salario() * 11) / 100;

		} else {
			return 0;
		}
	}

	public double salarioLiquido() {
		return this.salario() - this.impostoRenda() - this.vale();
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getTotalHorasTrab() {
		return totalHorasTrab;
	}

	public void setTotalHorasTrab(double totalHorasTrab) {
		this.totalHorasTrab = totalHorasTrab;
	}

}
