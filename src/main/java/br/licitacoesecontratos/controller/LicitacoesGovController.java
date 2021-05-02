package br.licitacoesecontratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.licitacoesecontratos.form.LicitacoesGovForm;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.repository.ILicitacoesGovRepositorio;


@RestController
@RequestMapping(value = "/licitacoes")
@CrossOrigin(origins = "*", maxAge = 3600)
public class LicitacoesGovController {

	@Autowired
	private ILicitacoesGovRepositorio licitacoesRepositorio;
	
	
	@GetMapping
	public List<LicitacoesGovForm> listarTodas() {
		
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		List<LicitacoesGovForm> licitacaoGovForm = new LicitacoesGovForm().converter(licitacoes);
		
		return licitacaoGovForm;
	}
	
	
}
