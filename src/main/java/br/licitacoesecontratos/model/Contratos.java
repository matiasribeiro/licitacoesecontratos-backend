package br.licitacoesecontratos.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

public class Contratos implements Serializable {


	@Field(name="numero_contrato")
	private String numeroContrato;

	@Field(name="NUMERO_PROCESSO_LICITACAO")
	private String numeroProcessoLicitacao;
	
	@Field(name="inicio_vigencia")
	private String dataInicio;
	
	@Field(name="fim_vigencia")
	private String dataFinal;

	@Field(name="contratante")
	private String contratante;
	
	@Field(name="fornecedor")
	private String fornecedor;
	
	@Field(name="objeto_contrato")
	private String Objeto;

	@Field(name="valor_proposta")
	private String valorProposta;

	@Field(name="cpf_cnpj_proponente")
	private String cpfCnpjProponente;

	
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


	public String getValorProposta() {
		return valorProposta;
	}


	public void setValorProposta(String valorProposta) {
		this.valorProposta = valorProposta;
	}


	public String getCpfCnpjProponente() {
		return cpfCnpjProponente;
	}


	public void setCpfCnpjProponente(String cpfCnpjProponente) {
		this.cpfCnpjProponente = cpfCnpjProponente;
	}


	@Override
	public String toString() {
		return "Contratos [numeroContrato=" + numeroContrato + ", numeroProcessoLicitacao=" + numeroProcessoLicitacao
				+ ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + ", contratante=" + contratante
				+ ", fornecedor=" + fornecedor + ", Objeto=" + Objeto + ", valorProposta=" + valorProposta
				+ ", cpfCnpjProponente=" + cpfCnpjProponente + "]";
	}

	
	
	
	
	
	
	
}
