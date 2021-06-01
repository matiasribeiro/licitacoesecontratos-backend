package br.licitacoesecontratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.licitacoesecontratos.form.LicitacoesForm;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.model.views.OrgaoVsValor;
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
	
	
	@GetMapping("/orgaos")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValores() {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor();
		return ResponseEntity.ok(orgaosVsValores);
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValores(@PathVariable int entidadeGovernamental) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(entidadeGovernamental);
		return ResponseEntity.ok(orgaosVsValores);
	}
	
	@GetMapping("/orgaos/{ano}")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValoresAno(@PathVariable String ano) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(ano);
		return ResponseEntity.ok(orgaosVsValores);
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos/{ano}")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValoresAno(@PathVariable int entidadeGovernamental, @PathVariable String ano) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(entidadeGovernamental, ano);
		return ResponseEntity.ok(orgaosVsValores);
	}
	
	@GetMapping("/orgaos/covid")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValoresCovid() {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValorCovid();
		return ResponseEntity.ok(orgaosVsValores);
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos/covid")
	public ResponseEntity<List<OrgaoVsValor>> listarOrgaosVsValoresCovid(@PathVariable int entidadeGovernamental) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValorCovid(entidadeGovernamental);
		return ResponseEntity.ok(orgaosVsValores);
	}
}
