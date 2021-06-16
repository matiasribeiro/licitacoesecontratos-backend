package br.licitacoesecontratos.model.views;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnoEntidadeGovernamentalValor  implements Serializable {
	
	private String anoHomologacao;
	
	private String entidadeGovernamental;
	
	private BigDecimal valorTotal;

	public AnoEntidadeGovernamentalValor(String anoHomologacao, String entidadeGovernamental, BigDecimal valorTotal) {
		super();
		this.anoHomologacao = anoHomologacao;
		this.entidadeGovernamental = entidadeGovernamental;
		this.valorTotal = valorTotal;
	}

	public String getAnoHomologacao() {
		return anoHomologacao;
	}

	public void setAnoHomologacao(String anoHomologacao) {
		this.anoHomologacao = anoHomologacao;
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
		return "AnoEntidadeGovernamentalValor [anoHomologacao=" + anoHomologacao + ", entidadeGovernamental="
				+ entidadeGovernamental + ", valorTotal=" + valorTotal + "]";
	}
	
}
