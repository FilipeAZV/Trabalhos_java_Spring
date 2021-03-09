package br.qi.projetosaviofilipe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idpessoa")
	@Getter
	private Long id;

	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private String fundador;

	@Getter
	@Setter
	private int AnoFundação;

}
