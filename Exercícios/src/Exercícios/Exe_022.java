/*
Crie um programa que leia o nome completo de uma pessoa e mostre:
– O nome com todas as letras maiúsculas e minúsculas.
– Quantas letras ao todo (sem considerar espaços).
– Quantas letras tem o primeiro nome.
*/

package Exercícios;

import java.util.Scanner;

public class Exe_022 {

	public static void main(String[] args) {
	
		System.out.println("Digite seu nome completo: ");
		Scanner nome = new Scanner(System.in);
		String Nome = nome.nextLine();
		
		System.out.format("Nome em maiúsculo: %s \n", Nome.toUpperCase());
		System.out.format("Nome em minusculo: %s \n" , Nome.toLowerCase());
		System.out.format("O nome %s tem ao todo %s letras \n", Nome, Nome.replace(" ", "").length());
		System.out.format("Seu primeiro nome %s tem ao todo %s letras", Nome.substring(0, 6),Nome.replace(" ", "").codePointCount(0, 6));
		
	

	}

}
