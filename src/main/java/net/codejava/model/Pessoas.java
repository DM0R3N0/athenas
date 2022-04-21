package net.codejava.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Camada que ela é responsável por obter os dados convertendo-os em conceitos significativos para sua aplicação, 
//assim como, processar, validar, associar e qualquer outra tarefa relativa ao tratamento dos dados.

@Entity
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

	
	
	
	public Pessoas() {	
		
	}
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	


}
