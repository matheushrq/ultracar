package com.veiculos.ultracar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veiculos.ultracar.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	Veiculo findById(long id);
}
