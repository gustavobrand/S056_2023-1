package aula04;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador meucomputador = new Computador();
		meucomputador.nome = "Pedro";
		meucomputador.clock = 1200;
		
		System.out.println("Nome: " + meucomputador.mostraNomeComputador() +
						   ", Clock: " + meucomputador.mostraClock() );
		
		float temp = 10;
		Float.toString(temp); 
	}
}
