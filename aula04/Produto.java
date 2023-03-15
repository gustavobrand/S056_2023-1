package aula04;

public class Produto {
	String nome;
	float preco;
	String descricao;
	
	String mostraNomeProduto() {
		return nome;
	}
	String mostraPreco() {
		return Float.toString(preco);
	}
	void mostradescricaoProduto() {
		System.out.println(descricao);
	}
}
