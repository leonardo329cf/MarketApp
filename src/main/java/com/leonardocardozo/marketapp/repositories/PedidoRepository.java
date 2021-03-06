package com.leonardocardozo.marketapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardocardozo.marketapp.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
