package com.com.zalfsistemas.diario.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.zalfsistemas.diario.entities.Marcacao;

public interface MarcacaoRepository extends JpaRepository<Marcacao, Long> {
	
	Optional<Marcacao> findByCpf(String cpf);	

}
