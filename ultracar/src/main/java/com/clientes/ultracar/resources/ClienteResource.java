package com.clientes.ultracar.resources;

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

import com.clientes.ultracar.models.Cliente;
import com.clientes.ultracar.repository.ClienteRepository;

@RestController
@RequestMapping(value="/api")
public class ClienteResource {
	@Autowired
	ClienteRepository clienterepository;
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){
		return clienterepository.findAll();
	}
	@GetMapping("/clientes/{id}")
	public Cliente listaClienteUnico(@PathVariable(value="id") long id){
		return clienterepository.findById(id);
	}
	@PostMapping("/clientes")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {
		return clienterepository.save(cliente);
	}
	@DeleteMapping("/clientes")
	public void deletaCliente(@RequestBody Cliente cliente) {
		clienterepository.delete(cliente);
	}
	@PutMapping("/clientes")
	public Cliente alteraCliente(@RequestBody Cliente cliente) {
		return clienterepository.save(cliente);
	}
}