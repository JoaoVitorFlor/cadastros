package br.com.cadastro.register.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cadastro.register.model.Registered;

public interface RegisteredRepository extends CrudRepository<Registered, Long> {

}
