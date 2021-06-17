package com.project.amigoSecreto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.amigoSecreto.model.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
	
	public List<Grupo> findAllByIdPessoaContaining(Long idPessoa);
	

}
