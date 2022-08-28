
//Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.

package Exercícios;

import java.util.Scanner;

public class Exe_006 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número inteiro: ");
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		int dobro = Numero * 2;
		int triplo = Numero * 3;
		double raiz_quadrada = Math.sqrt(Numero);
		
		
		System.out.println("O número digitado foi " + Numero);
		System.out.println("O dobro dele é " + dobro);
		System.out.println("O Triplo dele é " + triplo);
		System.out.println("A raiz quadrada de " + Numero + " é: " + raiz_quadrada);
		

	}

}
