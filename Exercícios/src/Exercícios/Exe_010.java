
//Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos d�lares ela pode comprar.

package Exerc�cios;

import java.util.Scanner;

public class Exe_010 {

	public static void main(String[] args) {
		
		System.out.println("Digite quanto dinheiro voc� tem na carteira: ");
		Scanner carteira = new Scanner(System.in);
		float Carteira = carteira.nextFloat();
		
		float dolar = (float) 4.67;
		float compras = Carteira / dolar;
		
		System.out.format("Voc� tem na carteira R$ " + Carteira + " Reais. " + "O valor do d�lar hoje est� R$ " + dolar + ".  Voc� vai poder comprar US$ %.2f " , compras);
		

	}

}
