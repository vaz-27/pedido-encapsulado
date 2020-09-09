package entities;

public class Item {
	
	private Integer quantidade;
	private Double preco;	
	private Produto produto;
	
	public Item() {}

	public Item(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}	
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto);
		sb.append(preco + ", Quantidade: ");
		sb.append(quantidade + ", Subtotal: ");
		sb.append(subTotal());
	
		return sb.toString();
		
	}
}
