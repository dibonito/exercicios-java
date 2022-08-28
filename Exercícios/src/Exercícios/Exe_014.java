
//Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.

package Exercícios;

import java.util.Scanner;

public class Exe_014 {

	public static void main(String[] args) {
		

		System.out.println("Informe a temperatura em °C: ");
		Scanner celsius = new Scanner(System.in);
		float Celsius = celsius.nextFloat();
		
		float fahrenheit  = (Celsius * 9) /5 + 32;
		
		
		System.out.format("A temperatura de %.1f °C corresponde a %.1f °F ", Celsius, fahrenheit);
		
	}

}
