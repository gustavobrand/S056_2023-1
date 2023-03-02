package aula02;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Lado do quadrado em cm: ");
		int lado = entrada.nextInt();
		//int area = lado*lado;
		int area = calculoAreaQuadrado(lado);
		System.out.println("Area do quadrado: " + area);

	}
	
	public static int calculoAreaQuadrado(int ladoQuadrado) {
		int areaQuadrado = ladoQuadrado * ladoQuadrado;
		return areaQuadrado;
	}

}
