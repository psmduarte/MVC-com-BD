package com.duarte.basededados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duarte.basededados.entidade.Funcionarios;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {

	List<Funcionarios> findByNome(String nome);
	
	List<Funcionarios> findByNif(String nif);
	
	
}
