
import java.util.ArrayList;

public class Personagem {

	private String nome;
	private int vida;
	private ArrayList<Equipamento> equipamentos;
	
	public Personagem() {
		this.nome = "Sem nome";
		this.vida = 200;
		this.equipamentos = new ArrayList<Equipamento>();
	}
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
		this.equipamentos = new ArrayList<Equipamento>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public ArrayList<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	public void addEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
	}
	
	public int poderDeAtaque() {
		int ataque = 1;
		for (Equipamento equipamento : this.equipamentos) {
			ataque += equipamento.getAtaque();
		}
		return ataque;
	}
	
	public int poderDeDefesa() {
		int defesa = 0;
		for (Equipamento equipamento : this.equipamentos) {
			defesa += equipamento.getDefesa();
		}
		return defesa;
	}
	
}