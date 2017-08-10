package br.com.garcia.vagas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.garcia.vagas.model.Candidato;
import br.com.garcia.vagas.model.Vaga;

@Repository
public class VagaDao {

	@PersistenceContext
	private EntityManager manager;

	public void adicionaVaga(Vaga vaga) {
		manager.persist(vaga);
	}

	public List<Vaga> lista() {
		return manager.createQuery("select t from Vaga t", Vaga.class)
				.getResultList();
	}

	public Vaga buscaPorId(Long id) {
		return manager.find(Vaga.class, id);
	}

	public void remove(Vaga vaga) {
		Vaga vagaAremover = buscaPorId(vaga.getId());
		manager.remove(vagaAremover);
	}

	public void altera(Vaga vaga) {
		manager.merge(vaga);
	}
}