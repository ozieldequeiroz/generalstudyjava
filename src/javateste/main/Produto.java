package javateste.main;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private Status status;
	private BigDecimal preco;
	private Categoria categoria;
	
	public Produto(String nome, Status status, BigDecimal preco) {
		super();
		this.nome = nome;
		this.status = status;
		this.preco = preco;
	}
	public Produto(String nome, Status status, BigDecimal preco,Categoria categoria) {
		this.categoria=categoria;
		this.nome = nome;
		this.status = status;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Status getStatus() {
		return status;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	public void inativar() {
		System.out.println("Inativando: "+getNome());
		this.status=status.INATIVO;
	}
	public Categoria getCategoria() {
		return this.categoria;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", status=" + status + ", preco=" + preco + ", categoria=" + categoria + "]";
	}
	
	

}
