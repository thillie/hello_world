package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nhamburguer";
	}

}
