package Exercicio01;

import java.util.ArrayList;

public class Sku {
	private String codigoBarras;
	private  ArrayList<Imagem> imagem;
	
	public Sku(String codigoBarras,ArrayList<Imagem> imagem) {
		this.codigoBarras = codigoBarras;
		this.imagem.addAll(imagem);
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public ArrayList<Imagem> getImagem() {
		return imagem;
	}

	public void setImagem(ArrayList<Imagem> imagem) {
		this.imagem = imagem;
	}
	
}
