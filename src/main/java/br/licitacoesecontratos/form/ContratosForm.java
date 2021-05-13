package br.licitacoesecontratos.form;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.licitacoesecontratos.model.Contratos;
import br.licitacoesecontratos.model.Licitacoes;

// necessário serializar a classe para o funcionamento do Redis
public class ContratosForm implements Serializable {


	private String numeroContrato;
	private String numeroProcessoLicitacao;
	private String dataInicio;
	private String dataFinal;
	private String contratante;
	private String fornecedor;
	private String Objeto;
	private String valorProposta;
	private String cpfCnpjProponente;
	private String entidadeGovernamental;
	
	private String numeroLicitacao;
	
	
	
	private Set<Contratos> contratos = new HashSet<Contratos>();
	private Set<ContratosForm> contratosForm = new HashSet<ContratosForm>();
	private Map<String, ContratosForm> map = new HashMap<String, ContratosForm>();
	
	public Collection<ContratosForm> converter(List<Licitacoes> licitacoes) {
			
			for(Licitacoes licitacao : licitacoes) {
	
				if((licitacao.getContratos() != null) && (!licitacao.getContratos().isEmpty())) {
					
					for (Contratos c : licitacao.getContratos()) {
						
						ContratosForm form = new ContratosForm();
						form.setNumeroContrato(c.getNumeroContrato());
						form.setNumeroProcessoLicitacao(c.getNumeroProcessoLicitacao());
						form.setDataInicio(c.getDataInicio());
						form.setDataFinal(c.getDataFinal());
						form.setContratante(c.getContratante());
						form.setFornecedor(c.getFornecedor());
						form.setObjeto(c.getObjeto());
						form.setValorProposta(c.getValorProposta());
						form.setCpfCnpjProponente(c.getCpfCnpjProponente());
						form.setNumeroLicitacao(licitacao.getNumero());
						form.setEntidadeGovernamental(licitacao.getEntidadeGovernamental());
						
						map.put(form.getNumeroContrato(), form);						
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
