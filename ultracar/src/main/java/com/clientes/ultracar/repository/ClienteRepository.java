package com.clientes.ultracar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.ultracar.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);
}
