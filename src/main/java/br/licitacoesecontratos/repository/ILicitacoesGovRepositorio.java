package br.licitacoesecontratos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.licitacoesecontratos.model.Licitacoes;

public interface ILicitacoesGovRepositorio extends MongoRepository<Licitacoes,String>{
	
	Optional<Licitacoes> findByNumero(String numero);

}
