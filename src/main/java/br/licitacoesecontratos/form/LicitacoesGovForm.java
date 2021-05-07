package br.licitacoesecontratos.form;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.licitacoesecontratos.model.Contratos;
import br.licitacoesecontratos.model.Licitacoes;

public class LicitacoesGovForm {
	
	private String numero;
	private String objetivo;
	private String modalidade;
	private String valorLicitado;
	private String protocolo;
	private String municipio;
	private String codigoUnidadeGestora;
	private String idJuridicionado;
	private String nomeJuridicionado;
	private String valorEstimado;
	private String dataHomologacao;
	private String anoHomologacao;
	private String nomeEstagioProcessual;
	private String nomeSetorAtual;
	private String url;
	private String entidadeGovernamental;
	private String numeroProcesso;
	
	
	private List<Contratos> contratos = new ArrayList<>();
	private List<LicitacoesGovForm> licitacoesForm = new ArrayList<LicitacoesGovForm>();
	
	
	
	public List<LicitacoesGovForm> converter(List<Licitacoes> licitacoes) throws JsonProcessingException {
		
		for(Licitacoes licitacao : licitacoes) {

			LicitacoesGovForm form = new LicitacoesGovForm();
			form.setNumero(licitacao.getNumero());
			form.setObjetivo(licitacao.getObjetivo());
			form.setModalidade(licitacao.getModalidade());
			form.setValorLicitado(licitacao.getValorLicitado());
			
			form.setProtocolo(licitacao.getProtocolo());
			form.setMunicipio(licitacao.getMunicipio().replace("NaN", ""));
			form.setCodigoUnidadeGestora(licitacao.getCodigoUnidadeGestora());
			form.setIdJuridicionado(licitacao.getIdJuridicionado());
			form.setNomeJuridicionado(licitacao.getNomeJuridicionado());
			form.setValorEstimado(licitacao.getValorEstimado().replace("NaN", ""));
			form.setDataHomologacao(licitacao.getDataHomologacao());
			form.setAnoHomologacao(licitacao.getAnoHomologacao());
			form.setNomeEstagioProcessual(licitacao.getNomeEstagioProcessual());
			form.setNomeSetorAtual(licitacao.getNomeSetorAtual());
			form.setUrl(licitacao.getUrl());
			form.setEntidadeGovernamental(licitacao.getEntidadeGovernamental());
			form.setNumeroProcesso(licitacao.getNumeroProcesso());
			
			//form.setContratos(licitacao.getContratos());

			licitacoesForm.add(form);
		}
		return licitacoesForm;
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
	public String getValorLicitado() {
		return valorLicitado;
	}
	public void setValorLicitado(String valorLicitado) {
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




	public String getCodigoUnidadeGestora() {
		return codigoUnidadeGestora;
	}




	public void setCodigoUnidadeGestora(String codigoUnidadeGestora) {
		this.codigoUnidadeGestora = codigoUnidadeGestora;
	}




	public String getIdJuridicionado() {
		return idJuridicionado;
	}




	public void setIdJuridicionado(String idJuridicionado) {
		this.idJuridicionado = idJuridicionado;
	}




	public String getNomeJuridicionado() {
		return nomeJuridicionado;
	}




	public void setNomeJuridicionado(String nomeJuridicionado) {
		this.nomeJuridicionado = nomeJuridicionado;
	}




	public String getValorEstimado() {
		return valorEstimado;
	}




	public void setValorEstimado(String valorEstimado) {
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
