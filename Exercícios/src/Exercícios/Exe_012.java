
//Fa�a um algoritmo que leia o pre�o de um produto e mostre seu novo pre�o, com 5% de desconto.

package Exerc�cios;

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
		
		System.out.format("O produto %s que custava R$ %.2f est� na promo��o com 5%% de desconto e custar� R$ %.2f " ,Produto, Valor, valor_total);
						
		
	}

}
