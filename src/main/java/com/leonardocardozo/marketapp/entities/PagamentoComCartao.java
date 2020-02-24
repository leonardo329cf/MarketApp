package com.leonardocardozo.marketapp.entities;

import javax.persistence.Entity;

import com.leonardocardozo.marketapp.entities.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeparcelas;

	
	public PagamentoComCartao() {
		super();
	}
	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeparcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroDeparcelas = numeroDeparcelas;
	}
	
	
	public Integer getNumeroDeparcelas() {
		return numeroDeparcelas;
	}
	public void setNumeroDeparcelas(Integer numeroDeparcelas) {
		this.numeroDeparcelas = numeroDeparcelas;
	}
}
