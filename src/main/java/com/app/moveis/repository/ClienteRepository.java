package com.app.moveis.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.moveis.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
