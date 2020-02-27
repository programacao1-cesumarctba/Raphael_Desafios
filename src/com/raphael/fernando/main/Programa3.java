package com.raphael.fernando.main;

import java.util.Scanner;

import com.raphael.fernandoads.atividades.desafio3;

public class Programa3 {

	private static Scanner fatorial;

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		fatorial = new Scanner(System.in);
		Integer var1;
		var1 = fatorial.nextInt();
		new desafio3();
		desafio3.fatorial(var1);

	}

}