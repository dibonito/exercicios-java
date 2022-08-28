
//Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.

package Exercícios;

import java.util.Scanner;

public class Exe_010 {

	public static void main(String[] args) {
		
		System.out.println("Digite quanto dinheiro você tem na carteira: ");
		Scanner carteira = new Scanner(System.in);
		float Carteira = carteira.nextFloat();
		
		float dolar = (float) 4.67;
		float compras = Carteira / dolar;
		
		System.out.format("Você tem na carteira R$ " + Carteira + " Reais. " + "O valor do dólar hoje está R$ " + dolar + ".  Você vai poder comprar US$ %.2f " , compras);
		

	}

}
