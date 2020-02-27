package com.raphael.fernando.main;

import java.util.Scanner;

import com.raphael.fernandoads.atividades.desafio4;

public class Programa4 {

	private static Scanner tabuada;

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		tabuada = new Scanner(System.in);
		Integer var1;
		var1 = tabuada.nextInt();
		new desafio4();
		desafio4.tabuada(var1);

	}

}