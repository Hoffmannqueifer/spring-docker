package com.github.hoffmannqueifer.convidado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {
	
	@Autowired
	private ConvidadosRepository repository;

	@GetMapping
	public List<Convidado> getConvidados(){
		return repository.findAll();
	}
}
