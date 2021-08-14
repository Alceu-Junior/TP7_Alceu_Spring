package br.edu.infnet.TP7_Alceu_spring.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.TP7_Alceu_spring.repository.ContatoRepository;
import br.edu.infnet.TP7_Alceu_spring.usuarios.Contato;

@RestController
@RequestMapping({"/contatos"})
public class ContatoController {
    
    @Autowired
    private ContatoRepository repository;
    
    @GetMapping
    public Collection<Contato> listarContatos() {
        
        return repository.listar();
    }
    
    @GetMapping(path = {"/{id}"})
    public Contato obterContato(@PathVariable int id) {
        
        return repository.obter(id);
    }
    
}
