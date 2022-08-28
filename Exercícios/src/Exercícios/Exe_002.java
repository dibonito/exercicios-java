
//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

package Exercícios;

import java.util.Scanner;

public class Exe_002 {

	public static void main(String[] args) {
		System.out.println("Digite o seu nome: ");
		Scanner nome = new Scanner(System.in);
		String Nome = nome.next();
		System.out.println("Seja bem vindo(a), "+ Nome);

	}

}
