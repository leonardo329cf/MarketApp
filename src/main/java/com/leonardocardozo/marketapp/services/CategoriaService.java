package com.leonardocardozo.marketapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardocardozo.marketapp.entities.Categoria;
import com.leonardocardozo.marketapp.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> lista = repo.findById(id);
		return lista.orElseThrow(null);
	}
}
