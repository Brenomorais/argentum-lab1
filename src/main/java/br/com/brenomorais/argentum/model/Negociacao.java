package br.com.brenomorais.argentum.model;

import java.time.LocalDateTime;

public final class Negociacao {
	
	private final double preco;
	private final int quantidade;
	private final LocalDateTime  data;	
		
	public Negociacao(double preco, int quantidade, LocalDateTime data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
	
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public LocalDateTime getData() {
		return data;
	}
	public double getVolume() {
		return this.preco * this.quantidade;
	}
	
}
