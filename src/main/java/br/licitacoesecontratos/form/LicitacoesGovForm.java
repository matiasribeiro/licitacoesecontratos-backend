package br.licitacoesecontratos.form;

import java.util.ArrayList;
import java.util.List;

import br.licitacoesecontratos.model.Licitacoes;

public class LicitacoesGovForm {
	
	private String numero;
	
	private String objetivo;

	private String modalidade;
	
	private String valorLicitado;
	
	private List<LicitacoesGovForm> licitacoesForm = new ArrayList<LicitacoesGovForm>();
	
	
	
	public List<LicitacoesGovForm> converter(List<Licitacoes> licitacoes) {
		
		for(Licitacoes licitacao : licitacoes) {
			
			LicitacoesGovForm form = new LicitacoesGovForm();
			form.setNumero(licitacao.getNumero());
			form.setObjetivo(licitacao.getObjetivo());
			form.setModalidade(licitacao.getModalidade());
			form.setValorLicitado(licitacao.getValorLicitado());
			licitacoesForm.add(form);
		}
		return licitacoesForm;
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
	public String getValorLicitado() {
		return valorLicitado;
	}
	public void setValorLicitado(String valorLicitado) {
		this.valorLicitado = valorLicitado;
	}
	
}
