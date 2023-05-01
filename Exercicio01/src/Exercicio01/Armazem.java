package Exercicio01;

import java.util.ArrayList;

public class Armazem {
	private ArrayList<Produto> produto;
	private int saldoEstoque;
	
	public Armazem(ArrayList<Produto> produto, int saldoEstoque) {
		this.produto.addAll(produto);
		this.saldoEstoque = saldoEstoque;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public int getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(int saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}
}
