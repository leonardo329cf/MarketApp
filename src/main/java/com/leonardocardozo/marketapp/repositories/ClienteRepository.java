package com.leonardocardozo.marketapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardocardozo.marketapp.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
