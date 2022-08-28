
//Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.

package Exercícios;

import java.util.Scanner;

public class Exe_013 {

	public static void main(String[] args) {
		
		System.out.println("Digite o salario atual: ");
		Scanner salario = new Scanner(System.in);
		float Salario = salario.nextFloat();
		
		float reajuste = Salario * 15/100;
		float salario_com_reajuste = Salario + reajuste;
		
		System.out.format("O salário atual é de R$ %.2f. Com o aumento de 15%% ficará R$ %.2f ", Salario, salario_com_reajuste);

	}

}
