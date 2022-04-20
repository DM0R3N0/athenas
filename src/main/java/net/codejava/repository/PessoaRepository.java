package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.model.Pessoas;

public interface PessoaRepository extends JpaRepository<Pessoas, Long> {

}
