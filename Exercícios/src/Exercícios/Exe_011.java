
/*Fa�a um programa que leia a largura e a altura de uma parede em metros, 
calcule a sua �rea e a quantidade de tinta necess�ria para pint�-la, 
sabendo que cada litro de tinta pinta uma �rea de 2 metros quadrados.
*/

package Exerc�cios;

import java.util.Scanner;

public class Exe_011 {

	public static void main(String[] args) {
		
		System.out.println("Digite a largura da parede: ");
		Scanner largura = new Scanner(System.in);
		float Largura = largura.nextFloat();
		
		System.out.println("Digite a altura da parede: ");
		Scanner altura = new Scanner(System.in);
		float Altura = altura.nextFloat();
		
		float area = Largura*Altura;
		float litros_tinta = area / 2;
		
		System.out.format("Sua parede tem a dimens�o de %.2f mts Largura x %.2f mts Altura e sua �rea � de %.2f m�. \n" ,Largura,Altura,area);
		System.out.format("Para pintar essa parede, voc� precisar� de %.2f litros de tinta." ,litros_tinta);
		

	}

}
