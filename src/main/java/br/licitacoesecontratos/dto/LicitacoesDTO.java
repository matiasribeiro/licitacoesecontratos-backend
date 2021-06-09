package br.licitacoesecontratos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.licitacoesecontratos.model.Contratos;
import br.licitacoesecontratos.model.Licitacoes;

public class LicitacoesDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String numero;
	private String objetivo;
	private String modalidade;
	private BigDecimal valorLicitado;
	private String protocolo;
	private String municipio;
	private int codigoUnidadeGestora;
	private int idJuridicionado;
	private String nomeJuridicionado;
	private BigDecimal valorEstimado;
	private String dataHomologacao;
	private String anoHomologacao;
	private String nomeEstagioProcessual;
	private String nomeSetorAtual;
	private String url;
	private String entidadeGovernamental;
	private String numeroProcesso;
	
	
	private List<Contratos> contratos = new ArrayList<>();
	private List<LicitacoesDTO> licitacoesDTO = new ArrayList<LicitacoesDTO>();
	
	
	
	public List<LicitacoesDTO> converter(List<Licitacoes> licitacoes) throws JsonProcessingException {
		
		for(Licitacoes licitacao : licitacoes) {

			LicitacoesDTO dto = new LicitacoesDTO();
			
			dto.setId(licitacao.getId().toString());
			dto.setNumero(licitacao.getNumero());
			dto.setObjetivo(licitacao.getObjetivo());
			dto.setModalidade(licitacao.getModalidade());
			dto.setValorLicitado(licitacao.getValorLicitado());
			
			dto.setProtocolo(licitacao.getProtocolo());
			dto.setMunicipio(licitacao.getMunicipio().replace("NaN", ""));
			dto.setCodigoUnidadeGestora(licitacao.getCodigoUnidadeGestora());
			dto.setIdJuridicionado(licitacao.getIdJuridicionado());
			dto.setNomeJuridicionado(licitacao.getNomeJuridicionado());
			dto.setValorEstimado(BigDecimal.valueOf(Double.parseDouble(licitacao.getValorEstimado().replace("NaN", "0"))));
			dto.setDataHomologacao(licitacao.getDataHomologacao());
			dto.setAnoHomologacao(licitacao.getAnoHomologacao());
			dto.setNomeEstagioProcessual(licitacao.getNomeEstagioProcessual());
			dto.setNomeSetorAtual(licitacao.getNomeSetorAtual());
			dto.setUrl(licitacao.getUrl());
			dto.setEntidadeGovernamental(licitacao.getEntidadeGovernamental());
			dto.setNumeroProcesso(licitacao.getNumeroProcesso());
			
			licitacoesDTO.add(dto);
		}
		return licitacoesDTO;
	}
	
	public LicitacoesDTO converter(Licitacoes licitacao) throws JsonProcessingException {
		

		LicitacoesDTO dtoLicitacoes = new LicitacoesDTO();
		
		dtoLicitacoes.setId(licitacao.getId().toString());
		dtoLicitacoes.setNumero(licitacao.getNumero());
		dtoLicitacoes.setObjetivo(licitacao.getObjetivo());
		dtoLicitacoes.setModalidade(licitacao.getModalidade());
		dtoLicitacoes.setValorLicitado(licitacao.getValorLicitado());
		
		dtoLicitacoes.setProtocolo(licitacao.getProtocolo());
		dtoLicitacoes.setMunicipio(licitacao.getMunicipio().replace("NaN", ""));
		dtoLicitacoes.setCodigoUnidadeGestora(licitacao.getCodigoUnidadeGestora());
		dtoLicitacoes.setIdJuridicionado(licitacao.getIdJuridicionado());
		dtoLicitacoes.setNomeJuridicionado(licitacao.getNomeJuridicionado());
		dtoLicitacoes.setValorEstimado(BigDecimal.valueOf(Double.parseDouble(licitacao.getValorEstimado().replace("NaN", "0"))));
		dtoLicitacoes.setDataHomologacao(licitacao.getDataHomologacao());
		dtoLicitacoes.setAnoHomologacao(licitacao.getAnoHomologacao());
		dtoLicitacoes.setNomeEstagioProcessual(licitacao.getNomeEstagioProcessual());
		dtoLicitacoes.setNomeSetorAtual(licitacao.getNomeSetorAtual());
		dtoLicitacoes.setUrl(licitacao.getUrl());
		dtoLicitacoes.setEntidadeGovernamental(licitacao.getEntidadeGovernamental());
		dtoLicitacoes.setNumeroProcesso(licitacao.getNumeroProcesso());
		
		return dtoLicitacoes;
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public BigDecimal getValorLicitado() {
		return valorLicitado;
	}

	public void setValorLicitado(BigDecimal valorLicitado) {
		this.valorLicitado = valorLicitado;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getCodigoUnidadeGestora() {
		return codigoUnidadeGestora;
	}

	public void setCodigoUnidadeGestora(int codigoUnidadeGestora) {
		this.codigoUnidadeGestora = codigoUnidadeGestora;
	}

	public int getIdJuridicionado() {
		return idJuridicionado;
	}

	public void setIdJuridicionado(int idJuridicionado) {
		this.idJuridicionado = idJuridicionado;
	}

	public String getNomeJuridicionado() {
		return nomeJuridicionado;
	}

	public void setNomeJuridicionado(String nomeJuridicionado) {
		this.nomeJuridicionado = nomeJuridicionado;
	}

	public BigDecimal getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(BigDecimal valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

	public String getDataHomologacao() {
		return dataHomologacao;
	}

	public void setDataHomologacao(String dataHomologacao) {
		this.dataHomologacao = dataHomologacao;
	}

	public String getAnoHomologacao() {
		return anoHomologacao;
	}

	public void setAnoHomologacao(String anoHomologacao) {
		this.anoHomologacao = anoHomologacao;
	}

	public String getNomeEstagioProcessual() {
		return nomeEstagioProcessual;
	}

	public void setNomeEstagioProcessual(String nomeEstagioProcessual) {
		this.nomeEstagioProcessual = nomeEstagioProcessual;
	}

	public String getNomeSetorAtual() {
		return nomeSetorAtual;
	}

	public void setNomeSetorAtual(String nomeSetorAtual) {
		this.nomeSetorAtual = nomeSetorAtual;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEntidadeGovernamental() {
		return entidadeGovernamental;
	}

	public void setEntidadeGovernamental(String entidadeGovernamental) {
		this.entidadeGovernamental = entidadeGovernamental;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public List<Contratos> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contratos> contratos) {
		this.contratos = contratos;
	}
	
}
