package aula02;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro nro: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o segundo nro: ");
		int n2 = entrada.nextInt();
		if (n1 > n2) {
			System.out.println("O maior nro é " + n1);
		} else if (n2 > n1){
			System.out.println("O maior nro é " + n2);
		} else {
			System.out.println("Os numeros são iguais");
		}
		

	}

}
