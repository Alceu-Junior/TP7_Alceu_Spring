package br.edu.infnet.TP7_Alceu_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastraController {
	
	@GetMapping("/cadastra")
	public String cadastra() {
		
		return "cadastra";
	}

}
