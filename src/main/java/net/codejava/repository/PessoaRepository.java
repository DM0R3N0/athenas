package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.model.Pessoas;

//Camada responsavel pela persistencia de Dados, no caso utilizando Spring JPA. 
// implementa parte das regras de negócio no que se refere à composição das entidades

@Repository
public interface PessoaRepository extends JpaRepository<Pessoas, Long> {

}
