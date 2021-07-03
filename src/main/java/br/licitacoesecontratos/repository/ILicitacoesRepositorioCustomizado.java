package br.licitacoesecontratos.repository;

import java.util.List;

import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.model.views.AnoEntidadeGovernamentalValor;
import br.licitacoesecontratos.model.views.AnoVsValor;
import br.licitacoesecontratos.model.views.LicitacoesCount;
import br.licitacoesecontratos.model.views.LicitacoesSum;
import br.licitacoesecontratos.model.views.OrgaoVsValor;

public interface ILicitacoesRepositorioCustomizado {
	
	//Busca uma licitação pelo ID
	public Licitacoes getLicitacao(String id);
	
	public List<LicitacoesCount> getLicitacoesTotal();
	
	public List<LicitacoesSum> getLicitacoesSoma();
	
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
	
	//Lista todos os anos vs somatório de valores das licitações por entidade governamental
	public List<AnoVsValor> getAnosSumValor(int entidadeGovernamental);
	
	//Lista todos os anos vs somatório de valores dos contratos por entidade governamental
	public List<AnoVsValor> getContratosAnosSumValor(int entidadeGovernamental);
	
	public List<AnoEntidadeGovernamentalValor> getAnosSumValorTotal();
	
	public List<AnoEntidadeGovernamentalValor> getContratosAnosEntidadeGovernamentalSumValor();
	
	public List<Licitacoes> getLicitacoesFornecedor(String cpfCnpjFornecedor); 
	
	public List<Licitacoes> getLicitacoesOrgao(String idJuridicionado);  
}
