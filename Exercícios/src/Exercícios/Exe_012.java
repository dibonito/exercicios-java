
//Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.

package Exercícios;

import java.util.Scanner;

public class Exe_012 {

	public static void main(String[] args) {
		
		System.out.println("Digite um produto: ");
		Scanner produto = new Scanner(System.in);
		String Produto = produto.next();
		
		System.out.println("Digite o valor atual do produto: ");
		Scanner valor = new Scanner(System.in);
		float Valor = valor.nextFloat();
		
		float desconto = Valor * 5/100;
		float valor_total = Valor - desconto;
		
		System.out.format("O produto %s que custava R$ %.2f está na promoção com 5%% de desconto e custará R$ %.2f " ,Produto, Valor, valor_total);
						
		
	}

}
