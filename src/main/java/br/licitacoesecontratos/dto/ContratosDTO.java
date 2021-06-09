package br.licitacoesecontratos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.licitacoesecontratos.model.Contratos;
import br.licitacoesecontratos.model.Licitacoes;

// necessário serializar a classe para o funcionamento do Redis
public class ContratosDTO implements Serializable {


	private String numeroContrato;
	private String numeroProcessoLicitacao;
	private String dataInicio;
	private String dataFinal;
	private String contratante;
	private String fornecedor;
	private String Objeto;
	private BigDecimal valorProposta;
	private String cpfCnpjProponente;
	private String entidadeGovernamental;
	
	private String numeroLicitacao;
	
	private Map<String, ContratosDTO> map = new HashMap<String, ContratosDTO>();
	
	public Collection<ContratosDTO> converter(List<Licitacoes> licitacoes) {
			
			for(Licitacoes licitacao : licitacoes) {
	
				if((licitacao.getContratos() != null) && (!licitacao.getContratos().isEmpty())) {
					
					for (Contratos c : licitacao.getContratos()) {
						
						ContratosDTO dto = new ContratosDTO();
						dto.setNumeroContrato(c.getNumeroContrato());
						dto.setNumeroProcessoLicitacao(c.getNumeroProcessoLicitacao());
						dto.setDataInicio(c.getDataInicio());
						dto.setDataFinal(c.getDataFinal());
						dto.setContratante(c.getContratante());
						dto.setFornecedor(c.getFornecedor());
						dto.setObjeto(c.getObjeto());
						dto.setValorProposta(c.getValorProposta());
						dto.setCpfCnpjProponente(c.getCpfCnpjProponente());
						dto.setNumeroLicitacao(licitacao.getNumero());
						dto.setEntidadeGovernamental(licitacao.getEntidadeGovernamental());
						
						map.put(dto.getNumeroContrato(), dto);						
					}
				}
			}
			
		return map.values();
	}

	
	
	
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
	public String getCpfCnpjProponente() {
		return cpfCnpjProponente;
	}
	public void setCpfCnpjProponente(String cpfCnpjProponente) {
		this.cpfCnpjProponente = cpfCnpjProponente;
	}
	public String getNumeroLicitacao() {
		return numeroLicitacao;
	}
	public void setNumeroLicitacao(String numeroLicitacao) {
		this.numeroLicitacao = numeroLicitacao;
	}
	public String getEntidadeGovernamental() {
		return entidadeGovernamental;
	}
	public void setEntidadeGovernamental(String entidadeGovernamental) {
		this.entidadeGovernamental = entidadeGovernamental;
	}
}
