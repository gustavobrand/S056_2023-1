package aula04;

public class ProdutoTesteEncapsulado {

	public static void main(String[] args) {
		ProdutoEncapsulado p1 = new ProdutoEncapsulado();
		ProdutoEncapsulado p2 = new ProdutoEncapsulado();
		p1.setNome("Tomate");
		p1.setPreco(1.0f);
		p1.setDescricao("Tomate cereja");
		
		p2.setNome("Ma�a");
		p2.setPreco(2.0f);
		p2.setDescricao("Ma�a Gala");
		
		System.out.println("Nome : " + p1.mostraNomeProduto() + 
				           ", Pre�o: R$" + p1.mostraPreco());
		p1.mostradescricaoProduto();
		
		System.out.println("Nome : " + p2.mostraNomeProduto() + 
		           ", Pre�o: R$" + p2.mostraPreco());
		p2.mostradescricaoProduto();

		
		
		

	}

}
