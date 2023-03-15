package aula04;

public class ContaTeste {

	public static void main(String[] args) {
		Conta cc = new Conta();
		
		cc.setLimite(500);
		cc.setNumero(345678);
		cc.setTipo("conta corrente");
		
		cc.depositar(150);
		System.out.println("Saldo atual: R$" + cc.getSaldo());
		//cc.extrato();
		cc.sacar(50);
		System.out.println("Saldo atual: R$" + cc.getSaldo());
		//cc.extrato();
		cc.transferir(50, 1111);
		System.out.println("Saldo atual: R$" + cc.getSaldo());
		//cc.extrato();

	}

}
