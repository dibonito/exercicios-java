/*
4Escreva um programa que faça o computador “pensar” em um número inteiro entre 0 e 5 e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador. 
O programa deverá escrever na tela se o usuário venceu ou perdeu.
*/

package Exercícios;

import java.util.Random;
import java.util.Scanner;


public class Exe_028 {

	public static void main(String[] args) {
		
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
		System.out.println("Vou pensar em um número entre 0 e 5. Tente adivinhar...");
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
		
		 //GERANDO NÚMERO ALEATÓRIAMENTE ENTRE 0 E 5
		Random pc = new Random();
		int Pc = pc.nextInt(5);
		
		
		System.out.println("Em que número pensei?");
		
		Scanner numero = new Scanner(System.in);
		int Numero = numero.nextInt();
		
		if (Pc == Numero)
		System.out.println("Parabens!! Você acertou!!");
		
		
	else 
		System.out.format("Que pena! Eu pensei no número %d ",Pc);

	}
}