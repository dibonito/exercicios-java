/*
Um professor quer sortear um dos seus quatro alunos para apagar o quadro. 
Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
*/

package Exercícios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exe_019 {

	public static void main(String[] args) {
		
		//INSERINDO OS NOMES DOS ALUNOS PELO TECLADO
		System.out.println("Digite o nome do primeiro aluno: ");
		Scanner primeiro_aluno = new Scanner(System.in);
		String Primeiro_aluno = primeiro_aluno.next();
		
		System.out.println("Digite o nome do segundo aluno: ");
		Scanner segundo_aluno = new Scanner(System.in);
		String Segundo_aluno = segundo_aluno.next();
		
		System.out.println("Digite o nome do terceiro aluno: ");
		Scanner terceiro_aluno = new Scanner(System.in);
		String Terceiro_aluno = terceiro_aluno.next();
		
		System.out.println("Digite o nome do quarto aluno: ");
		Scanner quarto_aluno = new Scanner(System.in);
		String Quarto_aluno = quarto_aluno.next();
		
		// INCLUINDO OS NOMES DOS ALUNOS EM UMA LISTA
		List<String> lista_alunos = new ArrayList<>();
		lista_alunos.add(Primeiro_aluno);
		lista_alunos.add(Segundo_aluno);
		lista_alunos.add(Terceiro_aluno);
		lista_alunos.add(Quarto_aluno);
		System.out.format("Alunos : %s ", lista_alunos);
		
		//EMBARALHANDO OS NOMES DOS ALUNOS 
		Collections.shuffle(lista_alunos);
		System.out.format(" Embaralhando os nomes dos alunos: %s ." , lista_alunos);
		
		// ESCOLHENDO UM ALUNO ALEATÓRIAMENTE
		Random aluno_escolhido = new Random();
		String Aluno_escolhido = lista_alunos.get(aluno_escolhido.nextInt(lista_alunos.size()));
		System.out.format(" O aluno escolhido foi: %s ." , Aluno_escolhido);

	}

}
