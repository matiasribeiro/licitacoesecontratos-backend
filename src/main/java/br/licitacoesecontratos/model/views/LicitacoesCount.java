package br.licitacoesecontratos.model.views;

public class LicitacoesCount {
	
	//Nome da entidade governamental
	private String entidadeGovernamental;
	
	//Contagem das licitacoes
	private int totalLicitacoes;

	public LicitacoesCount(String entidadeGovernamental, int totalLicitacoes) {
		super();
		this.entidadeGovernamental = entidadeGovernamental;
		this.totalLicitacoes = totalLicitacoes;
	}

	public String getEntidadeGovernamental() {
		return entidadeGovernamental;
	}

	public void setEntidadeGovernamental(String entidadeGovernamental) {
		this.entidadeGovernamental = entidadeGovernamental;
	}

	public int getTotalLicitacoes() {
		return totalLicitacoes;
	}

	public void setTotalLicitacoes(int totalLicitacoes) {
		this.totalLicitacoes = totalLicitacoes;
	}

	@Override
	public String toString() {
		return "LicitacoesCount [entidadeGovernamental=" + entidadeGovernamental + ", totalLicitacoes="
				+ totalLicitacoes + "]";
	}
	
}
