package br.com.garcia.vagas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.garcia.vagas.model.Candidato;

@Repository
public class CandidatoDao {
	@PersistenceContext
	private EntityManager manager;

	public void adicionaCandidato(Candidato candidato) {
		manager.persist(candidato);
	}
}
