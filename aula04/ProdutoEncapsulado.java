package aula04;

public class ProdutoEncapsulado {
	private String nome;
	private float preco;
	private String descricao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String mostraNomeProduto() {
		return nome;
	}
	public String mostraPreco() {
		return Float.toString(preco);
	}
	public void mostradescricaoProduto() {
		System.out.println(descricao);
	}
}
