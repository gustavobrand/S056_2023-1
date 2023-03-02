package aula02;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		SituacaoDoAluno(nota1, nota2, nota3);
		
//		float media = (nota1 + nota2 + nota3)/3;
//		if (media >= 7.0) { 
//		//if (media >= 7.0 && media <= 10) {
//			System.out.println("Aluno aprovado");
//		} else if (media >= 5.0) {
//		//} else if (media >= 5.0 && media < 7.0) {
//			System.out.println("Aluno em recuperação");
//		} else {
//			System.out.println("Aluno reprovado");
//		}
		
	}
	
	public static void SituacaoDoAluno (float n1, float n2, float n3) {
		float media = (n1 + n2 + n3)/3;
		if (media >= 7.0) { 
			System.out.println("Aluno aprovado");
		} else if (media >= 5.0) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		
	}

}
