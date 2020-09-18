package com.com.zalfsistemas.diario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.zalfsistemas.diario.entities.Marcacao;
import com.com.zalfsistemas.diario.repositories.MarcacaoRepository;

@Service
public class MarcacaoService {
	
	@Autowired
	private MarcacaoRepository repository;
	
	public List<Marcacao> findAll() {
		return repository.findAll();
	}

}
