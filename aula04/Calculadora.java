package aula04;

public class Calculadora {
	int valor;
	String operacao;
	
	int somar(int a, int b) {
		valor = a + b;
		operacao = "soma";
		return valor;
	}
	int subtrair(int a, int b) {
		valor = a - b;
		operacao = "subtração";
		return valor;	
	}
	int ultimoResultado() {
		return valor;
	}
	String ultimaOperacao() {
		return operacao;
	}
}
