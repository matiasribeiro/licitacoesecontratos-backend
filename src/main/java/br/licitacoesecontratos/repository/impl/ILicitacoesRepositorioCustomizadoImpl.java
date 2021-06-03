package br.licitacoesecontratos.repository.impl;

//imports as static
import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.licitacoesecontratos.model.Licitacoes;
import br.licitacoesecontratos.model.views.AnoVsValor;
import br.licitacoesecontratos.model.views.OrgaoVsValor;
import br.licitacoesecontratos.repository.ILicitacoesRepositorioCustomizado;

public class ILicitacoesRepositorioCustomizadoImpl implements ILicitacoesRepositorioCustomizado {

	@Autowired 
	private MongoTemplate mongoTemplate;
	
	private String entidade = "";
	
	public ILicitacoesRepositorioCustomizadoImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Licitacoes getLicitacao(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(new ObjectId(id)));
		Licitacoes licitacao = mongoTemplate.findOne(query, Licitacoes.class);
		return licitacao;
	}
	
	@Override
	public List<OrgaoVsValor> getOrgaosSumValor() {
		Aggregation agg = newAggregation(
            match(Criteria.where("nomeJuridicionado").exists(true)),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
                
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}

	@Override
	public List<OrgaoVsValor> getOrgaosSumValor(String ano) {
		Aggregation agg = newAggregation(
            match(Criteria.where("anoHomologacao").is(ano)),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
                
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}

	@Override
	public List<OrgaoVsValor> getOrgaosSumValorCovid() {
		Aggregation agg = newAggregation(
            match(Criteria.where("modalidade").is("Dispensa COVID-19 (Art. 4º da Lei 13.979/2020)")),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
                
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}

	@Override
	public List<OrgaoVsValor> getOrgaosSumValor(int entidadeGovernamental) {
		Aggregation agg = newAggregation(
            match(Criteria.where("entidadeGovernamental").is(getEntidade(entidadeGovernamental))),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}
	
	@Override
	public List<OrgaoVsValor> getOrgaosSumValor(int entidadeGovernamental, String ano) {
		
		Criteria criteria = new Criteria();

		Aggregation agg = newAggregation(
            match(criteria.andOperator(Criteria.where("entidadeGovernamental").is(getEntidade(entidadeGovernamental)), Criteria.where("anoHomologacao").is(ano))),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
                
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}

	@Override
	public List<OrgaoVsValor> getOrgaosSumValorCovid(int entidadeGovernamental) {
		
		Criteria criteria = new Criteria();
		
		Aggregation agg = newAggregation(
            match(criteria.andOperator(Criteria.where("entidadeGovernamental").is(getEntidade(entidadeGovernamental)), Criteria.where("modalidade").is("Dispensa COVID-19 (Art. 4º da Lei 13.979/2020)"))),
            group("nomeJuridicionado").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("nomeJuridicionado").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
                
        );

        AggregationResults<OrgaoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, OrgaoVsValor.class);
        List<OrgaoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}
	
	
	
	@Override
	public List<AnoVsValor> getAnosSumValor(int entidadeGovernamental) {
		Aggregation agg = newAggregation(
            match(Criteria.where("entidadeGovernamental").is(getEntidade(entidadeGovernamental))),
            group("anoHomologacao").sum("valorLicitado").as("valorTotal"),
            project("valorTotal").and("anoHomologacao").previousOperation(),
            sort(Sort.Direction.DESC, "valorTotal")
        );

        AggregationResults<AnoVsValor> groupResults = mongoTemplate.aggregate(agg, Licitacoes.class, AnoVsValor.class);
        List<AnoVsValor> result = groupResults.getMappedResults();
        
        return result;
	}

	private String getEntidade(int entidadeGovernamental) {
		if(entidadeGovernamental == Licitacoes.GOVERNO_ESTADO_PB)
			entidade = "Governo da Paraíba";
		
		if(entidadeGovernamental == Licitacoes.PREFEITURA_MUNICIPAL_JP)
			entidade = "Prefeitura Municipal de João Pessoa";
		
		return entidade;
	}
}
