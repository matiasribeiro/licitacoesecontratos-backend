package br.licitacoesecontratos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contratos {

	@JsonProperty("NUMERO_CONTRATO")
	private String NUMERO_CONTRATO;

	@JsonProperty("NUMERO_PROCESSO_LICITACAO")
	private String NUMERO_PROCESSO_LICITACAO;
	
	@JsonProperty("DATA_INICIO")
	private String DATA_INICIO;
	
	@JsonProperty("DATA_FINAL")
	private String DATA_FINAL;
	
	@JsonProperty("DURACAO_MESES")
	private String DURACAO_MESES;
	
	@JsonProperty("ORGAO")
	private String ORGAO;
	
	@JsonProperty("FORNECEDOR")
	private String FORNECEDOR;
	
	@JsonProperty("OBJETIVO")
	private String OBJETIVO;
	
	@JsonProperty("VALOR_ORIGEM")
	private String VALOR_ORIGEM;
	
	@JsonProperty("VALOR_TOTAL")
	private String VALOR_TOTAL;
	
	@JsonProperty("CPF_CNPJ")
	private String CPF_CNPJ;
	
	@JsonProperty("nome_proponente")
	private String nome_proponente;
	
	@JsonProperty("cpf_cnpj_proponente")
	private String cpf_cnpj_proponente;

	@JsonProperty("valor_proposta")
	private String valor_proposta;

	
	public Contratos() {}
	
	
	public String getNUMERO_CONTRATO() {
		return NUMERO_CONTRATO;
	}

	public void setNUMERO_CONTRATO(String nUMERO_CONTRATO) {
		NUMERO_CONTRATO = nUMERO_CONTRATO;
	}

	public String getNUMERO_PROCESSO_LICITACAO() {
		return NUMERO_PROCESSO_LICITACAO;
	}

	public void setNUMERO_PROCESSO_LICITACAO(String nUMERO_PROCESSO_LICITACAO) {
		NUMERO_PROCESSO_LICITACAO = nUMERO_PROCESSO_LICITACAO;
	}

	public String getDATA_INICIO() {
		return DATA_INICIO;
	}

	public void setDATA_INICIO(String dATA_INICIO) {
		DATA_INICIO = dATA_INICIO;
	}

	public String getDATA_FINAL() {
		return DATA_FINAL;
	}

	public void setDATA_FINAL(String dATA_FINAL) {
		DATA_FINAL = dATA_FINAL;
	}

	public String getDURACAO_MESES() {
		return DURACAO_MESES;
	}

	public void setDURACAO_MESES(String dURACAO_MESES) {
		DURACAO_MESES = dURACAO_MESES;
	}

	public String getORGAO() {
		return ORGAO;
	}

	public void setORGAO(String oRGAO) {
		ORGAO = oRGAO;
	}

	public String getFORNECEDOR() {
		return FORNECEDOR;
	}

	public void setFORNECEDOR(String fORNECEDOR) {
		FORNECEDOR = fORNECEDOR;
	}

	public String getOBJETIVO() {
		return OBJETIVO;
	}

	public void setOBJETIVO(String oBJETIVO) {
		OBJETIVO = oBJETIVO;
	}

	public String getVALOR_ORIGEM() {
		return VALOR_ORIGEM;
	}

	public void setVALOR_ORIGEM(String vALOR_ORIGEM) {
		VALOR_ORIGEM = vALOR_ORIGEM;
	}

	public String getVALOR_TOTAL() {
		return VALOR_TOTAL;
	}

	public void setVALOR_TOTAL(String vALOR_TOTAL) {
		VALOR_TOTAL = vALOR_TOTAL;
	}

	public String getCPF_CNPJ() {
		return CPF_CNPJ;
	}

	public void setCPF_CNPJ(String cPF_CNPJ) {
		CPF_CNPJ = cPF_CNPJ;
	}

	public String getNome_proponente() {
		return nome_proponente;
	}

	public void setNome_proponente(String nome_proponente) {
		this.nome_proponente = nome_proponente;
	}

	public String getCpf_cnpj_proponente() {
		return cpf_cnpj_proponente;
	}

	public void setCpf_cnpj_proponente(String cpf_cnpj_proponente) {
		this.cpf_cnpj_proponente = cpf_cnpj_proponente;
	}

	public String getValor_proposta() {
		return valor_proposta;
	}

	public void setValor_proposta(String valor_proposta) {
		this.valor_proposta = valor_proposta;
	}

	@Override
	public String toString() {
		return "Contratos [NUMERO_CONTRATO=" + NUMERO_CONTRATO + ", NUMERO_PROCESSO_LICITACAO="
				+ NUMERO_PROCESSO_LICITACAO + ", DATA_INICIO=" + DATA_INICIO + ", DATA_FINAL=" + DATA_FINAL
				+ ", DURACAO_MESES=" + DURACAO_MESES + ", ORGAO=" + ORGAO + ", FORNECEDOR=" + FORNECEDOR + ", OBJETIVO="
				+ OBJETIVO + ", VALOR_ORIGEM=" + VALOR_ORIGEM + ", VALOR_TOTAL=" + VALOR_TOTAL + ", CPF_CNPJ="
				+ CPF_CNPJ + ", nome_proponente=" + nome_proponente + ", cpf_cnpj_proponente=" + cpf_cnpj_proponente
				+ ", valor_proposta=" + valor_proposta + "]";
	}
	
	
	
	
	
	
}
