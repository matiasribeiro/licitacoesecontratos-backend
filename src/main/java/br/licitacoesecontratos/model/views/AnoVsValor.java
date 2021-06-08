package br.licitacoesecontratos.model.views;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnoVsValor  implements Serializable {
	
	//Ano da licitação
	private String anoHomologacao;
	
	//Somatório do valor de todas as licitações do orgão
	private BigDecimal valorTotal;

	public AnoVsValor(String anoHomologacao, BigDecimal valorTotal) {
		super();
		this.anoHomologacao = anoHomologacao;
		this.valorTotal = valorTotal;
	}

	public String getAnoHomologacao() {
		return anoHomologacao;
	}

	public void setAnoHomologacao(String anoHomologacao) {
		this.anoHomologacao = anoHomologacao;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "AnoVsValor [anoHomologacao=" + anoHomologacao + ", valorTotal=" + valorTotal + "]";
	}

}
