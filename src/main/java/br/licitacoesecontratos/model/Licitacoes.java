package br.licitacoesecontratos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "licitacoes_prod")
public class Licitacoes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final int GOVERNO_ESTADO_PB = 1;
	public static final int PREFEITURA_MUNICIPAL_JP = 2;

	@Field(name="_id")
	private ObjectId id;
	
	@Field(name="numero_licitacao")
	private String numero;
	
	@Field(name="objeto_licitacao")
	private String objetivo;

	@Field(name="nome_modalidade_licitacao")
	private String modalidade;
	
	@Field(name="valor_licitado_licitacao")
	private  BigDecimal valorLicitado;
	
	@Field(name="protocolo_licitacao")
	private String protocolo;
	
	@Field(name="nome_municipio")
	private String municipio;
	
	@Field(name="cd_ugestora")
	private int codigoUnidadeGestora;
	
	@Field(name="jurisdicionado_id")
	private int idJuridicionado;
	
	@Field(name="nome_jurisdicionado")
	private String nomeJuridicionado;
	
	@Field(name="valor_estimado_licitacao")
	private String valorEstimado;
	
	@Field(name="data_homologacao_licitacao")
	private String dataHomologacao;
	
	@Field(name="ano_homologacao_licitacao")
	private String anoHomologacao;
	
	@Field(name="nome_estagio_processual_licitacao")
	private String nomeEstagioProcessual;
	
	@Field(name="nome_setor_atual_licitacao")
	private String nomeSetorAtual;
	
	@Field(name="url")
	private String url;
	
	@Field(name="entidade_governamental")
	private String entidadeGovernamental;
	
	@Field(name="NUMERO_PROCESSO_LICITACAO")
	private String numeroProcesso;
	
	@Field(name="contratos")
	private List<Contratos> contratos;
	
	public Licitacoes() {}
	
	

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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

	public List<Contratos> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contratos> contratos) {
		this.contratos = contratos;
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



	@Override
	public String toString() {
		return "Licitacoes [id=" + id + ", numero=" + numero + ", objetivo=" + objetivo + ", modalidade=" + modalidade
				+ ", valorLicitado=" + valorLicitado + ", protocolo=" + protocolo + ", municipio=" + municipio
				+ ", codigoUnidadeGestora=" + codigoUnidadeGestora + ", idJuridicionado=" + idJuridicionado
				+ ", nomeJuridicionado=" + nomeJuridicionado + ", valorEstimado=" + valorEstimado + ", dataHomologacao="
				+ dataHomologacao + ", anoHomologacao=" + anoHomologacao + ", nomeEstagioProcessual="
				+ nomeEstagioProcessual + ", nomeSetorAtual=" + nomeSetorAtual + ", url=" + url
				+ ", entidadeGovernamental=" + entidadeGovernamental + ", numeroProcesso=" + numeroProcesso
				+ ", contratos=" + contratos + "]";
	}

	
	
	
	
}
