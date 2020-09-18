package com.com.zalfsistemas.diario.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.zalfsistemas.diario.entities.Colaborador;
import com.com.zalfsistemas.diario.services.ColaboradorService;

@RestController
@RequestMapping(value = "/colaboradores")
public class ColaboradorResource {
	
	@Autowired
	private ColaboradorService service;
	
	@GetMapping
	public ResponseEntity<List<Colaborador>> findAll() {
		List<Colaborador> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{cpf}")
	public ResponseEntity<Colaborador> findByCpf(@PathVariable String cpf) {
		Colaborador obj = service.findByCpf(cpf);
	    return ResponseEntity.ok().body(obj);
	}

}
