package com.com.zalfsistemas.diario.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.zalfsistemas.diario.entities.MarcacaoTipo;
import com.com.zalfsistemas.diario.services.MarcacaoTipoService;

@RestController
@RequestMapping(value = "/marcacaotipos")
public class MarcacaoTipoResource {
	
	@Autowired
	private MarcacaoTipoService service;
	
	@GetMapping
	public ResponseEntity<List<MarcacaoTipo>> findAll() {
		List<MarcacaoTipo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
