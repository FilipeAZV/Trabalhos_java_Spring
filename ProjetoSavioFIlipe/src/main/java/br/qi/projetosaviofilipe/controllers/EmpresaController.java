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

import br.qi.projetosaviofilipe.entities.Empresa;
import br.qi.projetosaviofilipe.repositories.EmpresaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

@Controller
@Api(description = "CRUD = Create, Read, Update, Delete")
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;

	@ApiOperation(value = "Pesquisa todas as empresas")
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Empresa>> listEmpresas() {
		List<Empresa> empresas = empresaRepository.findAll();
		ResponseEntity<List<Empresa>> resposta = new ResponseEntity<List<Empresa>>(empresas, new HttpHeaders(),
				HttpStatus.OK);
		return resposta;
	}

	@ApiOperation(value = "Cadastra uma empresa")
	@PostMapping(produces = "application/json")
	public ResponseEntity<Empresa> addEmpresa(@RequestBody Empresa empresa) {
		Empresa empresaSalva = empresaRepository.save(empresa);
		ResponseEntity<Empresa> resposta = new ResponseEntity<Empresa>(empresaSalva, new HttpHeaders(),
				HttpStatus.CREATED);
		return resposta;
	}
	@ApiOperation(value="Exclui uma empresa pelo seu id")
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<Empresa> deleteEmpresa(@PathVariable("id") Long id) {
		empresaRepository.deleteById(id);
		ResponseEntity<Empresa> resposta = new ResponseEntity<Empresa>(HttpStatus.OK);
		return resposta;
	}
	@ApiOperation(value="Altera uma empresa")
	@PutMapping(produces="application/json")
	public ResponseEntity<Empresa> updateEmpresa(@RequestBody Empresa empresa) throws NotFoundException {
		if(empresa.getId() == null) {
			throw new NotFoundException("informe o id da empresa a ser alterada");
		} else if (empresaRepository.existsById(empresa.getId()) == false) {
			throw new NotFoundException("Não existe empresa cadastrada com esse id");
		} else {
			Empresa empresaAlterada = empresaRepository.save(empresa);
			ResponseEntity<Empresa> resposta = new ResponseEntity<Empresa>(empresaAlterada, new HttpHeaders(), HttpStatus.OK);
			return resposta;
		}
	}
}
