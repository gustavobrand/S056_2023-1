package aula03;

public class Conta {
	int Numero;
	float Saldo;
	String Tipo;
	float Limite;

	void depositar(float valor) {
		Saldo = Saldo + valor; //Saldo += valor;
	}
	boolean sacar(float valor) {
		if (valor <= Saldo) {
			Saldo = Saldo - valor;
			return true;
		}
		return false;
	}
	boolean transferir(float valor, int NumeroContaDestino) {
		if (valor <= Saldo) {
			Saldo = Saldo - valor;
			return true;
		}
		return false;
	}
	void extrato() {
		System.out.println("Saldo atual: R$" + Saldo);
	}
}
