package net.codejava.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Date nasc;
	private Long cpf;
	private String sexo;
	private String altura;
	private String peso;

	
	
	
	public Pessoas() {	}
	
	@SuppressWarnings("unused")
	private Pessoas(Long id, String pNome, Date pNasc, Long pCpf, String pSexo, String pAltura, String pPeso) {
		super();
		this.id = id;
		this.nome = pNome;
		this.nasc = pNasc;
		this.cpf = pCpf;
		this.sexo = pSexo;
		this.altura = pAltura;
		this.peso = pPeso;
	}
	


}
