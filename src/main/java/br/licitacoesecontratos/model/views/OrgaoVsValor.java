package br.licitacoesecontratos.model.views;

import java.math.BigDecimal;

public class OrgaoVsValor {
	
	//Nome do orgão da administração
	private String nomeJuridicionado;
	
	//Somatório do valor de todas as licitações do orgão
	private BigDecimal valorTotal;

	public OrgaoVsValor(String nomeJuridicionado, BigDecimal valorTotal) {
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

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "OrgaoVsValor [nomeJuridicionado=" + nomeJuridicionado + ", valorTotal=" + valorTotal + "]";
	}
	
}
