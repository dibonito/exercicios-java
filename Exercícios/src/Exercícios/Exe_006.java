
//Crie um algoritmo que leia um n�mero e mostre o seu dobro, triplo e raiz quadrada.

package Exerc�cios;

import java.util.Scanner;

public class Exe_006 {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero inteiro: ");
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		int dobro = Numero * 2;
		int triplo = Numero * 3;
		double raiz_quadrada = Math.sqrt(Numero);
		
		
		System.out.println("O n�mero digitado foi " + Numero);
		System.out.println("O dobro dele � " + dobro);
		System.out.println("O Triplo dele � " + triplo);
		System.out.println("A raiz quadrada de " + Numero + " �: " + raiz_quadrada);
		

	}

}
