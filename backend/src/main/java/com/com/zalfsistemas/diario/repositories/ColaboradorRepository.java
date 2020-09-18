package com.com.zalfsistemas.diario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.zalfsistemas.diario.entities.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, cpf> {

}
