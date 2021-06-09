package br.licitacoesecontratos.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.licitacoesecontratos.model.Licitacoes;

public interface ILicitacoesRepositorio extends MongoRepository<Licitacoes,String>, ILicitacoesRepositorioCustomizado {
	
	public List<Licitacoes> findAllByOrderByEntidadeGovernamentalDesc();   
	
}
