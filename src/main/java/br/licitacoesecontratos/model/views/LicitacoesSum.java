package br.licitacoesecontratos.model.views;

import java.io.Serializable;
import java.math.BigDecimal;

public class LicitacoesSum  implements Serializable {
	
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

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "LicitacoesCount [entidadeGovernamental=" + entidadeGovernamental + ", valorTotal="
				+ valorTotal + "]";
	}
	
}
