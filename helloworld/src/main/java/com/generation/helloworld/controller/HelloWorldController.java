package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	@GetMapping
	public String ola() {
		return "Olá mundo!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nhamburguer";
	}
	
	@GetMapping("bsms")
	public String competenciasComportmentais() {
		return "Comunicação, \nProatividade, \nOrientação ao detalhe, \nTrabalho em equipe";
	}
	
	@GetMapping("objetivosdeaprendizagem")
	public String objetivosDaSemana() {
		return "Exercer os seguintes objetivos: \nRever os conteúdos estudados durante a semana,\nTirar dúvidas com mais frequência, \nRealizar exercícios para a melhorar fixação dos conteúdos.";
	}

}
