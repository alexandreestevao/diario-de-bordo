package com.com.zalfsistemas.diario.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.zalfsistemas.diario.entities.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

	Optional<Colaborador> findByCpf(String cpf);

}
