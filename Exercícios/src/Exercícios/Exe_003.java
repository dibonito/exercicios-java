
//Crie um programa que leia dois n�meros e mostre a soma entre eles.

package Exerc�cios;

import java.util.Scanner;

public class Exe_003 {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero: ");
		Scanner primeiro_numero = new Scanner(System.in);
		int Primeiro_numero = primeiro_numero.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		Scanner segundo_numero = new Scanner(System.in);
		int Segundo_numero = segundo_numero.nextInt();
		
		int Soma_numero = Primeiro_numero + Segundo_numero;
		
		System.out.println("A soma entre os dois num�ros s�o: "+ Soma_numero);
		

	}

}
