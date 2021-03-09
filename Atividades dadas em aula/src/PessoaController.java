package br.qi.aprendendospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.qi.aprendendospring.entities.Pessoa;
import br.qi.aprendendospring.repositories.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

@Controller
@Api(description="Operações do serviço relacionadas a entidade Pessoa do banco de dados")
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@ApiOperation(value="Lista todas as pessoas cadastradas")
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Pessoa>> listPessoas() {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		ResponseEntity<List<Pessoa>> resposta = new ResponseEntity<List<Pessoa>>(pessoas, new HttpHeaders(), HttpStatus.OK);
		return resposta;
	}
	
	@ApiOperation(value="Pesquisa uma pessoa pelo seu id")
	@GetMapping(path="/{id}", produces="application/json")
	public ResponseEntity<Pessoa> getPessoa(@PathVariable("id") Long id) throws NotFoundException {
		if (pessoaRepository.findById(id).isPresent() == false) {
			throw new NotFoundException("Não foi encontrada uma pessoa com o id informado!");
		} else {
			Pessoa pessoa = pessoaRepository.findById(id).get();
			ResponseEntity<Pessoa> resposta = new ResponseEntity<Pessoa>(pessoa, new HttpHeaders(), HttpStatus.OK);
			return resposta;
		}
	}
	
	@ApiOperation(value="Cadastra uma pessoa")
	@PostMapping(produces = "application/json")
	public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		ResponseEntity<Pessoa> resposta = new ResponseEntity<Pessoa>(pessoaSalva, new HttpHeaders(), HttpStatus.CREATED);
		return resposta;
	}
	
	@ApiOperation(value="Exclui uma pessoa pelo id")
	@DeleteMapping(path="/{id}", produces="application/json")
	public ResponseEntity<Pessoa> deletePessoa(@PathVariable("id") Long id) {
		pessoaRepository.deleteById(id);
		ResponseEntity<Pessoa> resposta = new ResponseEntity<Pessoa>(HttpStatus.OK);
		return resposta;
	}
	
	@ApiOperation(value="Altera uma pessoa pelo id")
	@PutMapping(produces="application/json")
	public ResponseEntity<Pessoa> updatePessoa(@RequestBody Pessoa pessoa) throws NotFoundException {
		if (pessoa.getId() == null) {
			throw new NotFoundException("Informe o id da pessoa a ser alterada!");
		} else if (pessoaRepository.existsById(pessoa.getId()) == false) {
			throw new NotFoundException("Não existe pessoa cadastrada com este id!");
		} else {
			Pessoa pessoaAlterada = pessoaRepository.save(pessoa);
			ResponseEntity<Pessoa> resposta = new ResponseEntity<Pessoa>(pessoaAlterada, new HttpHeaders(), HttpStatus.OK);
			return resposta;
		}
	}
	
}
