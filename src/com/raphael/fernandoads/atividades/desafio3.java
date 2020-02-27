package com.raphael.fernandoads.atividades;

public class desafio3 {

	public static void fatorial(Integer var1) {
		int fat = 1;
		int cal = var1;
		String s = "";
		while(cal > 1) {
			fat *= cal;
			s += cal + " x ";
			cal = cal - 1;
		}
		s += cal;
		System.out.println(s + " = " + fat);
	}

}
