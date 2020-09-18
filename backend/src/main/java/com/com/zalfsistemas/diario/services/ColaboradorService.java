package com.com.zalfsistemas.diario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.zalfsistemas.diario.entities.Colaborador;
import com.com.zalfsistemas.diario.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {
	
	@Autowired
	private ColaboradorRepository repository;
	
	public List<Colaborador> findAll() {
		return repository.findAll();
	}

	public Colaborador findByCpf(String cpf) {
	    Optional<Colaborador> obj = repository.findByCpf(cpf); 
	    return obj.get();
	}
	
}
