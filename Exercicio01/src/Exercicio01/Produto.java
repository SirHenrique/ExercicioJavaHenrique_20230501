package Exercicio01;
import java.util.ArrayList;


public class Produto {
	private ArrayList<Sku> sku;
	private ArrayList<Imagem> imagem;
	private String descricao;
	private String marca;
	private String departamento;
	
	public Produto(ArrayList<Sku> sku,ArrayList<Imagem> imagem,String descricao,String marca,String departamento) {
		this.sku.addAll(sku);
		this.imagem.addAll(imagem);
		this.descricao = descricao;
		this.marca = marca;
		this.departamento = departamento;
	}

	public ArrayList<Sku> getSku() {
		return sku;
	}

	public void setSku(ArrayList<Sku> sku) {
		this.sku = sku;
	}

	public ArrayList<Imagem> getImagem() {
		return imagem;
	}

	public void setImagem(ArrayList<Imagem> imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
