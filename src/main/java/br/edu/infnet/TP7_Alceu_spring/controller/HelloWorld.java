package br.edu.infnet.TP7_Alceu_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");
		return "hello";
	}
}
