package aula03;

import java.util.Scanner;

public class CalculaMedia2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		//System.out.println("Nota da media v1: " + SituacaoDoAluno(nota1, nota2, nota3);
		
		float media = CalculoDaMedia(nota1, nota2, nota3);
		String status = SituacaoDoAluno(media);
		System.out.println("Media: " + media + ", situação: " + status);
		
	}
	
	public static float CalculoDaMedia (float n1, float n2, float n3) {
		float media = (n1 + n2 + n3)/3;
		return media;
	}
	
	public static String SituacaoDoAluno (float m1) {
		if (m1 >= 7.0) { 
			return "Aluno aprovado";
		} else if (m1 >= 5.0) {
			return "Aluno em recuperação";
		} else {
			return "Aluno reprovado";
		}
	}

}
