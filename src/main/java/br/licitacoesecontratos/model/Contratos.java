package br.licitacoesecontratos.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

public class Contratos implements Serializable {


	@Field(name="numero_contrato")
	private String numeroContrato;

	@Field(name="numero_processo_licitatorio")
	private String numeroProcessoLicitacao;
	
	@Field(name="data_inicio_vigencia")
	private String dataInicio;
	
	@Field(name="data_termino_vigencia")
	private String dataFinal;

	@Field(name="contratante")
	private String contratante;
	
	@Field(name="fornecedor")
	private String fornecedor;
	
	@Field(name="objeto_contrato")
	private String Objeto;

	@Field(name="valor_proposta")
	private BigDecimal valorProposta;
	
	@Field(name="valor_total")
	private BigDecimal valorTotal;
	
	@Field(name="codigo_contrato")
	private String codigoContrato;
	
	@Field(name="numero_registro_cge")
	private String numeroRegistroCGE;
	
	@Field(name="municipio")
	private String municipio;
	
	@Field(name="nome_gestor_contrato")
	private String nomeGestorContrato;
	
	@Field(name="numero_portaria")
	private String numeroPortaria;
	
	@Field(name="data_publicacao_portaria")
	private String dataPublicacaoPortaria;
	
	@Field(name="url_contrato")
	private String url;

	@Field(name="cpf_cnpj_fornecedor")
	private String cpfCnpjFornecedor;

	
	public Contratos() {}


	public String getNumeroContrato() {
		return numeroContrato;
	}


	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}


	public String getNumeroProcessoLicitacao() {
		return numeroProcessoLicitacao;
	}


	public void setNumeroProcessoLicitacao(String numeroProcessoLicitacao) {
		this.numeroProcessoLicitacao = numeroProcessoLicitacao;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public String getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}


	public String getContratante() {
		return contratante;
	}


	public void setContratante(String contratante) {
		this.contratante = contratante;
	}


	public String getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}


	public String getObjeto() {
		return Objeto;
	}


	public void setObjeto(String objeto) {
		Objeto = objeto;
	}


	public BigDecimal getValorProposta() {
		return valorProposta;
	}


	public void setValorProposta(BigDecimal valorProposta) {
		this.valorProposta = valorProposta;
	}


	public String getCpfCnpjFornecedor() {
		return cpfCnpjFornecedor;
	}


	public void setCpfCnpjFornecedor(String cpfCnpjFornecedor) {
		this.cpfCnpjFornecedor = cpfCnpjFornecedor;
	}


	public BigDecimal getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getCodigoContrato() {
		return codigoContrato;
	}


	public void setCodigoContrato(String codigoContrato) {
		this.codigoContrato = codigoContrato;
	}


	public String getNumeroRegistroCGE() {
		return numeroRegistroCGE;
	}


	public void setNumeroRegistroCGE(String numeroRegistroCGE) {
		this.numeroRegistroCGE = numeroRegistroCGE;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getNomeGestorContrato() {
		return nomeGestorContrato;
	}


	public void setNomeGestorContrato(String nomeGestorContrato) {
		this.nomeGestorContrato = nomeGestorContrato;
	}


	public String getNumeroPortaria() {
		return numeroPortaria;
	}


	public void setNumeroPortaria(String numeroPortaria) {
		this.numeroPortaria = numeroPortaria;
	}


	public String getDataPublicacaoPortaria() {
		return dataPublicacaoPortaria;
	}


	public void setDataPublicacaoPortaria(String dataPublicacaoPortaria) {
		this.dataPublicacaoPortaria = dataPublicacaoPortaria;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Contratos [numeroContrato=" + numeroContrato + ", numeroProcessoLicitacao=" + numeroProcessoLicitacao
				+ ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + ", contratante=" + contratante
				+ ", fornecedor=" + fornecedor + ", Objeto=" + Objeto + ", valorProposta=" + valorProposta
				+ ", valorTotal=" + valorTotal + ", codigoContrato=" + codigoContrato + ", numeroRegistroCGE="
				+ numeroRegistroCGE + ", municipio=" + municipio + ", nomeGestorContrato=" + nomeGestorContrato
				+ ", numeroPortaria=" + numeroPortaria + ", dataPublicacaoPortaria=" + dataPublicacaoPortaria + ", url="
				+ url + ", cpfCnpjFornecedor=" + cpfCnpjFornecedor + "]";
	}
	
}
