
//Fa�a um programa que leia um n�mero Inteiro e mostre na tela o seu sucessor e seu antecessor.

package Exerc�cios;

import java.util.Scanner;

public class Exe_005 {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero inteiro: ");
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		int sucessor = Numero + 1;
		int antecessor = Numero - 1;
		
		System.out.println("O n�mero digitado � " + Numero);
		System.out.println("Seu Sucessor � " + sucessor);
		System.out.println("Seu Antecessor � " + antecessor);

	}

}
