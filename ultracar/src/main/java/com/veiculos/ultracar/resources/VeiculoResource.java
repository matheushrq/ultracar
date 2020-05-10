package com.veiculos.ultracar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veiculos.ultracar.models.Veiculo;
import com.veiculos.ultracar.repository.VeiculoRepository;

@RestController
@RequestMapping(value="/api")
public class VeiculoResource {
	@Autowired
	VeiculoRepository veiculorepository;
	@GetMapping("/veiculos")
	public List<Veiculo> listaVeiculos(){
		return veiculorepository.findAll();
	}
	@GetMapping("/veiculos/{id}")
	public Veiculo listaVeiculoUnico(@PathVariable(value="id") long id){
		return veiculorepository.findById(id);
	}
	
	@PostMapping("/veiculos")
	public Veiculo salvaVeiculo(@RequestBody Veiculo veiculo) {
		return veiculorepository.save(veiculo);
	}
	@DeleteMapping("/veiculos")
	public void deletaVeiculo(@RequestBody Veiculo veiculo) {
		veiculorepository.delete(veiculo);
	}
	@PutMapping("/veiculos")
	public Veiculo alteraVeiculo(@RequestBody Veiculo veiculo) {
		return veiculorepository.save(veiculo);
	}
}