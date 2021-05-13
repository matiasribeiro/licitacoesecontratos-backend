package br.licitacoesecontratos.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.licitacoesecontratos.form.ContratosForm;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.repository.ILicitacoesRepositorio;

@RestController
@RequestMapping(value = "/contratos")
@CrossOrigin(origins = "*")
public class ContratosController {
	
	@Autowired
	private ILicitacoesRepositorio licitacoesRepositorio;
	

	@GetMapping
	@Cacheable(value = "listarTodosContratos", key="#root.method.name")
	public Collection<ContratosForm> listarTodos() {
		
		
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		Collection<ContratosForm> licitacaoGovForm = new ContratosForm().converter(licitacoes);
		
		
		
		return new ArrayList<>(licitacaoGovForm);
	}
	
	
	

}
