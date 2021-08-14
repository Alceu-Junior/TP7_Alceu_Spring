package br.edu.infnet.TP7_Alceu_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.TP7_Alceu_spring.repository.ContatoRepository;
import br.edu.infnet.TP7_Alceu_spring.usuarios.Contato;

@RestController
@RequestMapping("/addcadastro")
public class AddCadastroController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@PostMapping
	private void cadastrar(@RequestBody Contato contato) {
		
		contatoRepository.adiciona(contato);
		
	}
}
