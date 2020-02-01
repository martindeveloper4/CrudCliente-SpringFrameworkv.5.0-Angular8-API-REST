package com.martinspringbootapirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.martinspringbootapirest.entity.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long>{
	
	
}
