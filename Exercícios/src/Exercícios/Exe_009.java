
//Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.

package Exercícios;

import java.util.Scanner;

public class Exe_009 {

	public static void main(String[] args) {
	
		System.out.println("Digite um número para saber a tabuada: ");
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		System.out.println("A tabuada de " + Numero + " é: ");
		System.out.println(Numero + " x 0 = " + Numero*0);
		System.out.println(Numero + " x 1 = " + Numero*1);
		System.out.println(Numero + " x 2 = " + Numero*2);
		System.out.println(Numero + " x 3 = " + Numero*3);
		System.out.println(Numero + " x 4 = " + Numero*4);
		System.out.println(Numero + " x 5 = " + Numero*5);
		System.out.println(Numero + " x 6 = " + Numero*6);
		System.out.println(Numero + " x 7 = " + Numero*7);
		System.out.println(Numero + " x 8 = " + Numero*8);
		System.out.println(Numero + " x 9 = " + Numero*9);
		System.out.println(Numero + " x 10 = " + Numero*10);
		
	}

}