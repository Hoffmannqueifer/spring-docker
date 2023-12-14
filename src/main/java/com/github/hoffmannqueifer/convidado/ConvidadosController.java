package com.github.hoffmannqueifer.convidado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {

	@GetMapping
	public List<Convidado> getConvidados(){
		List<Convidado> list = new ArrayList<Convidado>();
		list.add(new Convidado("hoffmann", "12345678901"));
		list.add(new Convidado("bruno", "99876543211"));
		return list;
	}
}
