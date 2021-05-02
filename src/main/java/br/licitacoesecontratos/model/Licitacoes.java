package br.licitacoesecontratos.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "licitacoes")
public class Licitacoes implements Serializable{


	private static final long serialVersionUID = 1L;

	@Field(name="numero_licitacao")
	private String numero;
	
	@Field(name="objeto_licitacao")
	private String objetivo;

	@Field(name="nome_modalidade_licitacao")
	private String modalidade;
	
	@Field(name="valor_licitado_licitacao")
	private  String valorLicitado;
	
	
	
	
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
