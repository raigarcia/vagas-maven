package br.com.garcia.vagas.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.garcia.vagas.dao.CandidatoDao;
import br.com.garcia.vagas.dao.VagaDao;
import br.com.garcia.vagas.model.Candidato;

@Controller
public class CandidatoController {

	@Autowired
	private VagaDao dao;

	@Autowired
	CandidatoDao daoCandidato;

	@GetMapping("candidatoForm")
	public ModelAndView candidatoForm(Long id) {
		ModelAndView mv = new ModelAndView("form-candidato");
		mv.addObject("vaga", dao.buscaPorId(id));
		return mv;
	}

	@PostMapping("criaCandidato")
	@Transactional
	public String aplicaVaga(Candidato candidato) {
		daoCandidato.adicionaCandidato(candidato);
		return "redirect:listaVagas";
	}
}
