package aula04;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.somar(5, 10);
		System.out.println("[5+10] Ultimo resultado: " + calc.ultimoResultado() +
						   ", Ultima operacao: " + calc.ultimaOperacao());
		calc.subtrair(10, 3);
		System.out.println("[10-3] Ultimo resultado: " + calc.ultimoResultado() +
				   ", Ultima operacao: " + calc.ultimaOperacao());
		

	}

}
