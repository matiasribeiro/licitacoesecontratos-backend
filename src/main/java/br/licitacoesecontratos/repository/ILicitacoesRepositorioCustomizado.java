package br.licitacoesecontratos.repository;

import java.util.List;

import br.licitacoesecontratos.model.views.OrgaoVsValor;

public interface ILicitacoesRepositorioCustomizado {
	
	//Lista todos os orgãos vs somatório de valores das licitações
	public List<OrgaoVsValor> getOrgaosSumValor();
	
	//Lista todos os orgãos vs somatório de valores das licitações por entidade governamental
	public List<OrgaoVsValor> getOrgaosSumValor(int entidadeGovernamental);
	
	//Lista todos os orgãos vs somatório de valores das licitações por ano
	public List<OrgaoVsValor> getOrgaosSumValor(String ano);
	
	//Lista todos os orgãos vs somatório de valores das licitações por entidade governamental e ano
	public List<OrgaoVsValor> getOrgaosSumValor(int entidadeGovernamental, String ano);
	
	//Lista todos os orgãos vs somatório de valores das licitações por dispensa COVID-19
	public List<OrgaoVsValor> getOrgaosSumValorCovid();
	
	//Lista todos os orgãos vs somatório de valores das licitações por entidade governamental e dispensa COVID-19
	public List<OrgaoVsValor> getOrgaosSumValorCovid(int entidadeGovernamental);
}
