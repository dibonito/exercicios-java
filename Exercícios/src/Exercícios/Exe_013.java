
//Fa�a um algoritmo que leia o sal�rio de um funcion�rio e mostre seu novo sal�rio, com 15% de aumento.

package Exerc�cios;

import java.util.Scanner;

public class Exe_013 {

	public static void main(String[] args) {
		
		System.out.println("Digite o salario atual: ");
		Scanner salario = new Scanner(System.in);
		float Salario = salario.nextFloat();
		
		float reajuste = Salario * 15/100;
		float salario_com_reajuste = Salario + reajuste;
		
		System.out.format("O sal�rio atual � de R$ %.2f. Com o aumento de 15%% ficar� R$ %.2f ", Salario, salario_com_reajuste);

	}

}
