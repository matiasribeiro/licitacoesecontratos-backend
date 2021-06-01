package br.licitacoesecontratos.model.views;

public class OrgaoVsValor {
	
	//Nome do orgão da administração
	private String nomeJuridicionado;
	
	//Somatório do valor de todas as licitações do orgão
	private Double valorTotal;

	public OrgaoVsValor(String nomeJuridicionado, Double valorTotal) {
		super();
		this.nomeJuridicionado = nomeJuridicionado;
		this.valorTotal = valorTotal;
	}

	public String getNomeJuridicionado() {
		return nomeJuridicionado;
	}

	public void setNomeJuridicionado(String nomeJuridicionado) {
		this.nomeJuridicionado = nomeJuridicionado;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "OrgaoVsValor [nomeJuridicionado=" + nomeJuridicionado + ", valorTotal=" + valorTotal + "]";
	}
	
	
	
}
