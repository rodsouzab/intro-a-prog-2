package atividade_um;

public class ItemVenda {
	Produto produto;
	int quantidade;

	public ItemVenda(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public double calcularTotal() {
		return this.produto.getPreco() * this.quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
