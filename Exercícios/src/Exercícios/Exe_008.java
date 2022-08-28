
 //Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.

package Exercícios;

import java.util.Scanner;

public class Exe_008 {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor em metros a serem convertidos: ");
		Scanner metros = new Scanner(System.in);
		int Metros = metros.nextInt();
		
		int centimetros = Metros*100;
		int milimetros = Metros*1000;
		
		System.out.println( Metros + " metros convertido em centímetros é " + centimetros + " centimetros e convertido em milímetros é " + milimetros + " milimetros " );
		

	}

}
