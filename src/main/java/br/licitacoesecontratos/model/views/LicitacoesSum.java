package br.licitacoesecontratos.model.views;

import java.math.BigDecimal;

public class LicitacoesSum {
	
	//Nome da entidade governamental
	private String entidadeGovernamental;
	
	//Contagem das licitacoes
	private BigDecimal valorTotal;

	public LicitacoesSum(String entidadeGovernamental, BigDecimal valorTotal) {
		super();
		this.entidadeGovernamental = entidadeGovernamental;
		this.valorTotal = valorTotal;
	}

	public String getEntidadeGovernamental() {
		return entidadeGovernamental;
	}

	public void setEntidadeGovernamental(String entidadeGovernamental) {
		this.entidadeGovernamental = entidadeGovernamental;
	}

	public BigDecimal getTotalLicitacoes() {
		return valorTotal;
	}

	public void setTotalLicitacoes(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "LicitacoesCount [entidadeGovernamental=" + entidadeGovernamental + ", valorTotal="
				+ valorTotal + "]";
	}
	
}
