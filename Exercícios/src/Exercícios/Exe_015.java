
/*Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.
*/

package Exercícios;

import java.util.Scanner;

public class Exe_015 {

	public static void main(String[] args) {
		
		System.out.println("Informe o km percorrido: ");
		Scanner km = new Scanner(System.in);
		float Km = km.nextFloat();
		
		System.out.println("Informe quantos dias foram utilizados: ");
		Scanner dia = new Scanner(System.in);
		int Dia = dia.nextInt();
		
		float valor_km = (float) (Km * 0.15);
		int diaria = Dia * 60;
		float total = valor_km + diaria;
		
		
		System.out.format("A distância percorrida foi %.0f Km e o valor total do Km foi R$ %.2f .\nForam utilizados %s dias e o valor total dos dias utilizados foram R$ %.2f " , Km, valor_km, Dia, total);	

	}

}
