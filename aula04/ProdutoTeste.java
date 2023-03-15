package aula04;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.nome = "Tomate";
		p1.preco = 1.0f;
		p1.descricao = "Tomate cereja";
		p2.nome = "Maça";
		p2.preco = 2.0f;
		p2.descricao = "Maça Gala";
		
		System.out.println("Nome : " + p1.mostraNomeProduto() + 
				           ", Preço: R$" + p1.mostraPreco());
		p1.mostradescricaoProduto();
		
		System.out.println("Nome : " + p2.mostraNomeProduto() + 
		           ", Preço: R$" + p2.mostraPreco());
		p2.mostradescricaoProduto();

		
		
		

	}

}
