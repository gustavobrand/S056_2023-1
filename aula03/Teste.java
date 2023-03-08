package aula03;

public class Teste {

	public static void main(String[] args) {
		Conta cc = new Conta();
		Conta cc2 = new Conta();
		
		
		cc.Saldo = 0;
		cc.Limite = 500;
		cc.Numero = 345678;
		cc.Tipo = "conta corrente";
		
		cc.depositar(150);
		cc.extrato();
		cc.sacar(50);
		cc.extrato();
		cc.transferir(50, 1111);
		cc.extrato();

	}

}
