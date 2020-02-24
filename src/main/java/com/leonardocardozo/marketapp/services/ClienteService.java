package com.leonardocardozo.marketapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardocardozo.marketapp.entities.Cliente;
import com.leonardocardozo.marketapp.repositories.ClienteRepository;
import com.leonardocardozo.marketapp.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> lista = repo.findById(id);
		return lista.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()
				));
	}
}
