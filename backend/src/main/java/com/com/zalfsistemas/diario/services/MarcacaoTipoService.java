package com.com.zalfsistemas.diario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.zalfsistemas.diario.entities.MarcacaoTipo;
import com.com.zalfsistemas.diario.repositories.MarcacaoTipoRepository;

@Service
public class MarcacaoTipoService {
	
	@Autowired
	private MarcacaoTipoRepository repository;
	
	public List<MarcacaoTipo> findAll() {
		return repository.findAll();
	}

}
