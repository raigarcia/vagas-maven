package br.com.garcia.vagas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Vaga {

	@Id
	@GeneratedValue
	private Long id;

	@Size(min = 5, message = "Nome da vaga deve ter pelo menos 5 letras ")
	private String nome;

	@Size(min = 10, message = "Descrição deve ter pelo menos 10 letras ")
	private String descricao;

	@OneToMany(mappedBy = “team”, targetEntity = Candidato.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Candidato> candidatos;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
