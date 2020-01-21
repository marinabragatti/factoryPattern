package com.gft.model;

public abstract class Livraria {

	private String nome;
	
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void comprarItem() {
		System.out.println(getNome() + " está disponível para venda por R$ " + getPreco());
	}
	
	public void alugarItem() {
		System.out.println(getNome() + " está diponível para alugar por R$ " + (getPreco() - 20));
	}
}
