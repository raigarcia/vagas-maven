package br.com.garcia.vagas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.garcia.vagas.dao.CandidatoDao;
import br.com.garcia.vagas.dao.VagaDao;
import br.com.garcia.vagas.model.Candidato;
import br.com.garcia.vagas.model.Vaga;

@Controller
public class VagaController {
	@Autowired
	private VagaDao dao;

	@Autowired
	private CandidatoDao candidatoDao;

	@GetMapping("menu")
	public String menuInicial() {
		return "menu-admin";
	}

	@GetMapping("novaVaga")
	public String formulario() {
		return "add-vaga-formulario";
	}

	@PostMapping("adicionaVaga")
	@Transactional
	public String adiciona(@Valid Vaga vaga, BindingResult result) {
		if (result.hasFieldErrors("nome")
				|| (result.hasFieldErrors("descricao"))) {
			return "add-vaga-formulario";
		}
		dao.adicionaVaga(vaga);
		return "add-vaga-formulario";
	}

	@GetMapping("listaVagas")
	public ModelAndView listaVaga(Vaga vaga) {
		List<Vaga> vagas = dao.lista();
		ModelAndView mv = new ModelAndView("lista-vagas");
		mv.addObject("vagas", vagas);
		return mv;
	}

	@GetMapping("removeVaga")
	@Transactional
	public String remove(Vaga vaga) {
		dao.remove(vaga);
		return "redirect:listaVagas";
	}

	@GetMapping("mostraVaga")
	public ModelAndView mostra(Vaga vaga, Long id) {
		ModelAndView mv = new ModelAndView("mostra-vaga");
		mv.addObject("vaga", dao.buscaPorId(id));
		return mv;
	}

	@PostMapping("alteraVaga")
	@Transactional
	public String alterarVaga(Vaga vaga) {
		dao.altera(vaga);
		return "redirect:listaVagas";
	}
}
