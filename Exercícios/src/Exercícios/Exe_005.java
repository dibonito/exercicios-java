
//Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.

package Exercícios;

import java.util.Scanner;

public class Exe_005 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número inteiro: ");
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		int sucessor = Numero + 1;
		int antecessor = Numero - 1;
		
		System.out.println("O número digitado é " + Numero);
		System.out.println("Seu Sucessor é " + sucessor);
		System.out.println("Seu Antecessor é " + antecessor);

	}

}
