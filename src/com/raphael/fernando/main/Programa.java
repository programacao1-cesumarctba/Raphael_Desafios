package com.raphael.fernando.main;

import java.util.Scanner;

import com.raphael.fernandoads.atividades.Desafio1;

public class Programa {

	private static Scanner parouimpar;

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		parouimpar = new Scanner(System.in);
		Integer var1;
		var1 = parouimpar.nextInt();
		new Desafio1().ParouImpar(var1);

	}

}