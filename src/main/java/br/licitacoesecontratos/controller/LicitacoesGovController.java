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

import br.licitacoesecontratos.form.LicitacoesGovForm;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.repository.ILicitacoesGovRepositorio;


@RestController
@RequestMapping(value = "/licitacoes")
@CrossOrigin(origins = "*")
public class LicitacoesGovController {

	@Autowired
	private ILicitacoesGovRepositorio licitacoesRepositorio;
	
	@Autowired
	RedisCacheManager redisCacheManager;
	
	
	@GetMapping
	@Cacheable(value = "listarTodasLicitacoes", key="#root.method.name")
	public List<LicitacoesGovForm> listarTodas() throws JsonProcessingException {
		
		
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		List<LicitacoesGovForm> licitacaoGovForm = new LicitacoesGovForm().converter(licitacoes);
		
		return licitacaoGovForm;
	}
	
	
	
}
