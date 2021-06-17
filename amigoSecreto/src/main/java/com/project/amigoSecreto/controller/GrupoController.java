package com.project.amigoSecreto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.amigoSecreto.model.Grupo;
import com.project.amigoSecreto.repository.GrupoRepository;

@RestController
@RequestMapping("/grupos")
@CrossOrigin("*")
public class GrupoController {
	
	@Autowired
	private GrupoRepository repository;

	@GetMapping
	public ResponseEntity<List<Grupo>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{idPessoa}")
	public ResponseEntity<Grupo> getById(@PathVariable Long idPessoa){
		return repository.findById(idPessoa).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<Grupo> post ( @RequestBody Grupo grupo){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(grupo));
		
	}
	@DeleteMapping("/{idPessoa}")
	public void delete (@PathVariable Long idPessoa) {
		repository.deleteById(idPessoa);
	}
	
	@PutMapping
	public ResponseEntity<Grupo> put (@RequestBody Grupo grupo){
		return ResponseEntity.ok(repository.save(grupo));
	}
}
