package br.qi.projetosaviofilipe.controllers;

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

import br.qi.projetosaviofilipe.entities.Funcionario;
import br.qi.projetosaviofilipe.repositories.FuncionarioRepository;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@ApiOperation(value="Pesquisa todos os funcionários")
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Funcionario>> ListFuncionarios() {
		List<Funcionario> funcionarios = funcionarioRepository.findAll();
		ResponseEntity<List<Funcionario>> resposta = new ResponseEntity<List<Funcionario>>(funcionarios, new HttpHeaders(), HttpStatus.OK);
		return resposta; 
	}
	
	@ApiOperation(value="Cadastra um funcionário")
	@PostMapping(produces = "application/json")
	public ResponseEntity<Funcionario> addFuncionario(@RequestBody Funcionario funcionario){
		funcionarioRepository.save(funcionario);
		ResponseEntity<Funcionario> resposta = new ResponseEntity<Funcionario>(funcionario, new HttpHeaders(), HttpStatus.CREATED);
		return resposta;
	}
	
	@ApiOperation(value="Exclui um funcionário pelo seu id")	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<Funcionario> deleteFuncionario(@PathVariable("id") Long id) {
		funcionarioRepository.deleteById(id);
		ResponseEntity<Funcionario> resposta = new ResponseEntity<Funcionario>(HttpStatus.OK);
		return resposta;	
	}
	
	@PutMapping(produces = "application/json")
	public ResponseEntity<Funcionario> updateFuncionario(@RequestBody Funcionario funcionario) throws NotFoundException {
		if (funcionario.getId() == null) {
			throw new NotFoundException("Informe o id do funcionário a ser alterada!");
		} else if (funcionarioRepository.existsById(funcionario.getId()) == false) {
			throw new NotFoundException("Não existe funcionário cadastrado com este id!");
		} else {
			Funcionario funcionarioAlterado = funcionarioRepository.save(funcionario);
			ResponseEntity<Funcionario> resposta = new ResponseEntity<Funcionario>(funcionarioAlterado, new HttpHeaders(), HttpStatus.OK);
			return resposta;
		}
	}

	
	
	
}//classe
