package entities;

public class Produto {
	// atributos
	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;

	// construtor sem argumentos
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	// construtor com entrada de argumentos
	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {

		return "IdProduto: " + idProduto + ", Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
	}
}
