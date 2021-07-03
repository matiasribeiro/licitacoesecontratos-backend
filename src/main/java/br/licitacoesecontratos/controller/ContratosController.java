package br.licitacoesecontratos.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.licitacoesecontratos.dto.ContratosDTO;
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
	public Collection<ContratosDTO> listarTodos() {
		List<Licitacoes> licitacoes = licitacoesRepositorio.findAll();
		Collection<ContratosDTO> licitacaoGovDTO = new ContratosDTO().converter(licitacoes);
		return new ArrayList<>(licitacaoGovDTO);
	}
	
	@GetMapping("/fornecedor/{cpfCnpjFornecedor}")
	public Collection<ContratosDTO> listarContratosFornecedor(@PathVariable String cpfCnpjFornecedor) {
		List<Licitacoes> licitacoes = licitacoesRepositorio.getLicitacoesFornecedor(cpfCnpjFornecedor);
		Collection<ContratosDTO> contratosGovDTO = new ContratosDTO().converter(licitacoes, cpfCnpjFornecedor);
		return new ArrayList<>(contratosGovDTO);
	}
	

}
