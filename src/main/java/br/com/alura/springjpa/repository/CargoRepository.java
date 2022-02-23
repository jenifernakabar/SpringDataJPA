package br.com.alura.springjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springjpa.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
	

}
