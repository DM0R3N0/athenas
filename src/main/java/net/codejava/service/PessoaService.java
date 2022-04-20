package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.model.Pessoas;
import net.codejava.repository.PessoaRepository;

@Service
@Transactional
public class PessoaService {

	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoas> listAll() {
		return repo.findAll();
	}
	
	public void save(Pessoas pessoas) {
		repo.save(pessoas);
	}
	
	public Pessoas get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	

}
