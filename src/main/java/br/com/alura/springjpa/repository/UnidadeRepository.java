package br.com.alura.springjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.alura.springjpa.orm.UnidadeTrabalho;

@Repository
public interface UnidadeRepository extends CrudRepository<UnidadeTrabalho, Integer> {
	

}
