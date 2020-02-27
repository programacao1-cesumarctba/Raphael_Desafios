package com.raphael.fernando.main;

import java.util.Scanner;

import com.raphael.fernandoads.atividades.Desafio2;

public class Programa2 {
	
	private static Scanner Estranho;

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		
		Estranho = new Scanner(System.in);
		
		Integer Num1;
		Num1 = Estranho.nextInt();
		new Desafio2().Estranho(Num1);
	}

}
