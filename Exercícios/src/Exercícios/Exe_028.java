/*
4Escreva um programa que fa�a o computador �pensar� em um n�mero inteiro entre 0 e 5 e pe�a para o usu�rio tentar descobrir qual foi o n�mero escolhido pelo computador. 
O programa dever� escrever na tela se o usu�rio venceu ou perdeu.
*/

package Exerc�cios;

import java.util.Random;
import java.util.Scanner;


public class Exe_028 {

	public static void main(String[] args) {
		
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
		System.out.println("Vou pensar em um n�mero entre 0 e 5. Tente adivinhar...");
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
		
		//PAUSA COM TEMPO DE 3 SEGUNDOS
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		System.out.println("Pensando......");
		
		//PAUSA COM TEMPO DE 3 SEGUNDOS
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		 //GERANDO N�MERO ALEAT�RIAMENTE ENTRE 0 E 5
		Random pc = new Random();
		int Pc = pc.nextInt(5);
		
		
		System.out.println("Em que n�mero pensei?");
		
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		if (Pc == Numero)
		System.out.println("Parabens!! Voc� acertou!!");
		
		
	else 
		System.out.format("Que pena! Eu pensei no n�mero %d ",Pc);

	}
}