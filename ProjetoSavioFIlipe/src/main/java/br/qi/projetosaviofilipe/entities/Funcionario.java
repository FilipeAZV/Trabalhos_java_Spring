package br.qi.projetosaviofilipe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Funcionario {

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idfuncionario")
	private Long id;

	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private int idade;
	
	@Getter
	@Setter
	private String cargo;

}
