package aula01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		//String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		//JOptionPane.showMessageDialog(null, "Voce digitou: " + nome);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva seu nome: ");
		String nome = entrada.next();
		System.out.print("Escreva sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome: %s\n", nome);
		System.out.println("Idade: " + idade);
	}
}
