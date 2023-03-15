package aula04;

public class Conta {
	private int Numero;
	private float Saldo;
	private String Tipo;
	private float Limite;
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public float getLimite() {
		return Limite;
	}
	public void setLimite(float limite) {
		Limite = limite;
	}
	public float getSaldo() {
		return Saldo;
	}
	public void depositar(float valor) {
		Saldo = Saldo + valor; //Saldo += valor;
	}
	public boolean sacar(float valor) {
		if (valor <= Saldo) {
			Saldo = Saldo - valor;
			return true;
		}
		return false;
	}
	public boolean transferir(float valor, int NumeroContaDestino) {
		if (valor <= Saldo) {
			Saldo = Saldo - valor;
			return true;
		}
		return false;
	}
	public void extrato() {
		System.out.println("Saldo atual: R$" + Saldo);
	}
}
