package br.licitacoesecontratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.licitacoesecontratos.form.LicitacoesForm;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.repository.ILicitacoesRepositorio;


@RestController
@RequestMapping(value = "/licitacoes")
@CrossOrigin(origins = "*")
public class LicitacoesController {

	@Autowired
	private ILicitacoesRepositorio licitacoesRepositorio;
	
	@Autowired
	RedisCacheManager redisCacheManager;
	
	
	@GetMapping
	@Cacheable(value = "listarTodasLicitacoes", key="#root.method.name")
	public List<LicitacoesForm> listarTodas() throws JsonProcessingException {
		
		
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		List<LicitacoesForm> licitacaoGovForm = new LicitacoesForm().converter(licitacoes);
		
		return licitacaoGovForm;
	}
	
	
	
	
	
}
