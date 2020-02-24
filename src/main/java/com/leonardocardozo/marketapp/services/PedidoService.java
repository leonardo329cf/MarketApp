package com.leonardocardozo.marketapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardocardozo.marketapp.entities.Pedido;
import com.leonardocardozo.marketapp.repositories.PedidoRepository;
import com.leonardocardozo.marketapp.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> lista = repo.findById(id);
		return lista.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()
				));
	}
}
