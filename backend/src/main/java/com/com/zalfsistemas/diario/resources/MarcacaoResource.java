package com.com.zalfsistemas.diario.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.zalfsistemas.diario.entities.Marcacao;
import com.com.zalfsistemas.diario.services.MarcacaoService;

@RestController
@RequestMapping(value = "/marcacoes")
public class MarcacaoResource {
	
	@Autowired
	private MarcacaoService service;
	
	@GetMapping
	public ResponseEntity<List<Marcacao>> findAll() {
		List<Marcacao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
