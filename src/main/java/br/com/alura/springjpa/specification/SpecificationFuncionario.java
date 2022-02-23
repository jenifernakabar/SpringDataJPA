package br.com.alura.springjpa.specification;

import java.time.LocalDate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.data.jpa.domain.Specification;

import br.com.alura.springjpa.orm.Funcionario;

public class SpecificationFuncionario {

		public static Specification<Funcionario> nome(String nome) {
			return (root, criteriaQuery, criteriaBuilder) ->
			criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
		}
		
		public static Specification<Funcionario> cpf(String cpf) {
			return (root, criteriaQuery, criteriaBuilder) ->
			criteriaBuilder.equal(root.get("cpf"),  cpf);
		}
		
		public static Specification<Funcionario> salario(Double salario) {
			return (root, criteriaQuery, criteriaBuilder) ->
			criteriaBuilder.greaterThan(root.get("salario"), salario);
		}
		
		public static Specification<Funcionario> dataContracao(LocalDate dataContratacao) {
			return (root, criteriaQuery, criteriaBuilder) ->
			criteriaBuilder.greaterThan(root.get("dataContratacao"), dataContratacao);
		}
}
