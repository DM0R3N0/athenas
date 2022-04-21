package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.model.Pessoas;
import net.codejava.repository.PessoaRepository;

//Camada responsavel por implementar os metodos da aplicação

@Service
@Transactional
public class PessoaService {

	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoas> pesquisar() {
		return repo.findAll();
	}
	
	public void incluir(Pessoas pessoas) {
		repo.save(pessoas);
	}
	
	public Pessoas obter(long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(long id) {
		repo.deleteById(id);
	}
	

}
