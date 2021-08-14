package br.edu.infnet.TP7_Alceu_spring.repository;

import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

import br.edu.infnet.TP7_Alceu_spring.usuarios.Contato;


@Repository
public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos;
    
    public ContatoRepository() {
        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Alceu Lima", "alceu@alceu.com", "43331212"));
        contatos.put(2, new Contato(2, "Osvaldo Inf", "osvaldo@alceu.com", "43431212"));
        contatos.put(3, new Contato(3, "Renan Inf", "renan@alceu.com", "43331232"));
    }
    
    public Collection<Contato>listar() {
        
        return this.contatos.values();
    }
    
    public Contato obter(int id) {
        
        return this.contatos.get(id);
    }
    
    public void adiciona(Contato contato) {
    	contatos.put(null, contato);
    }
    
}
