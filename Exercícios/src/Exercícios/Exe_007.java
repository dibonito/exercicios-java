
//Desenvolva um programa que leia as três notas de um aluno, calcule e mostre a sua média.

package Exercícios;

import java.util.Scanner;

public class Exe_007 {

	public static void main(String[] args) {
		
		System.out.println("Digite a primeira nota: ");
		Scanner primeira_nota = new Scanner(System.in);
		float Primeira_nota = primeira_nota.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		Scanner segunda_nota = new Scanner(System.in);
		float Segunda_nota = segunda_nota.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		Scanner terceira_nota = new Scanner(System.in);
		float Terceira_nota = terceira_nota.nextFloat();
		
		float media = (Primeira_nota + Segunda_nota + Terceira_nota) / 3;
		
		System.out.println("A média final do aluno é: " + media);
		
		

	}

}
