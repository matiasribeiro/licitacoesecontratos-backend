package br.licitacoesecontratos.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.licitacoesecontratos.dto.LicitacoesDTO;
import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.model.views.AnoEntidadeGovernamentalValor;
import br.licitacoesecontratos.model.views.AnoVsValor;
import br.licitacoesecontratos.model.views.LicitacoesCount;
import br.licitacoesecontratos.model.views.LicitacoesSum;
import br.licitacoesecontratos.model.views.OrgaoVsValor;
import br.licitacoesecontratos.repository.ILicitacoesRepositorio;


@RestController
@RequestMapping(value = "/licitacoes")
@CrossOrigin(origins = "*")
public class LicitacoesController implements Serializable {

	private static final long serialVersionUID = 2156526032483281623L;
	
	@Autowired
	private ILicitacoesRepositorio licitacoesRepositorio;
	
	@Autowired
	RedisCacheManager redisCacheManager;
	
	
	@GetMapping
	@Cacheable(value = "listarTodasLicitacoes", key="#root.method.name")
	public List<LicitacoesDTO> listarTodas() throws JsonProcessingException {
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		List<LicitacoesDTO> licitacoesDTO = new LicitacoesDTO().converter(licitacoes);
		return licitacoesDTO;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LicitacoesDTO> listarLicitacao(@PathVariable String id) throws JsonProcessingException {
		
		try {
			Licitacoes licitacao = licitacoesRepositorio.getLicitacao(id);
			LicitacoesDTO licitacoesDTO = new LicitacoesDTO().converter(licitacao);
			return ResponseEntity.ok(licitacoesDTO);
			
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
	@GetMapping("/total")
//	@Cacheable(value = "listarLicitacoesTotal", key="#root.method.name")
	public List<LicitacoesCount> listarLicitacoesTotal() {
		List<LicitacoesCount> licitacoesTotal = licitacoesRepositorio.getLicitacoesTotal();
		return licitacoesTotal;
	}
	
	@GetMapping("/soma")
//	@Cacheable(value = "listarLicitacoesSoma", key="#root.method.name")
	public List<LicitacoesSum> listarLicitacoesSoma() {
		List<LicitacoesSum> licitacoesSoma = licitacoesRepositorio.getLicitacoesSoma();
		return licitacoesSoma;
	}
	
	@GetMapping("/orgaos")
//	@Cacheable(value = "listarOrgaosVsValores", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValores() {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor();
		return orgaosVsValores;
	}
	
	@GetMapping("/{entidadeGovernamental}/anos")
	public List<AnoVsValor> listarAnosVsValores(@PathVariable int entidadeGovernamental) {
		List<AnoVsValor> anosVsValores = licitacoesRepositorio.getAnosSumValor(entidadeGovernamental);
		return anosVsValores;
	}
	
	
	@GetMapping("/anos")
	public List<AnoEntidadeGovernamentalValor> getAnosSumValorTotal() {
		List<AnoEntidadeGovernamentalValor> anosVsValores = licitacoesRepositorio.getAnosSumValorTotal();
		return anosVsValores;
	}
	
	@GetMapping("/{entidadeGovernamental}/contratos/anos")
	public List<AnoVsValor> listarAnosVsValoresContratos(@PathVariable int entidadeGovernamental) {
		List<AnoVsValor> anosVsValores = licitacoesRepositorio.getContratosAnosSumValor(entidadeGovernamental);
		return anosVsValores;
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos")
//	@Cacheable(value = "listarOrgaosVsValores", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValores(@PathVariable int entidadeGovernamental) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(entidadeGovernamental);
		return orgaosVsValores;
	}
	
	@GetMapping("/orgaos/{ano}")
	//@Cacheable(value = "listarOrgaosVsValoresAno", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValoresAno(@PathVariable String ano) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(ano);
		return orgaosVsValores;
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos/{ano}")
	//@Cacheable(value = "listarOrgaosVsValoresAno", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValoresAno(@PathVariable int entidadeGovernamental, @PathVariable String ano) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValor(entidadeGovernamental, ano);
		return orgaosVsValores;
	}
	
	@GetMapping("/orgaos/covid")
//	@Cacheable(value = "listarOrgaosVsValoresCovid", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValoresCovid() {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValorCovid();
		return orgaosVsValores;
	}
	
	@GetMapping("/{entidadeGovernamental}/orgaos/covid")
//	@Cacheable(value = "listarOrgaosVsValoresCovid", key="#root.method.name")
	public List<OrgaoVsValor> listarOrgaosVsValoresCovid(@PathVariable int entidadeGovernamental) {
		List<OrgaoVsValor> orgaosVsValores = licitacoesRepositorio.getOrgaosSumValorCovid(entidadeGovernamental);
		return orgaosVsValores;
	}
	
	
	
}


