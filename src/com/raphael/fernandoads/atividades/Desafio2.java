package com.raphael.fernandoads.atividades;

public class Desafio2 {

	public void Estranho(Integer Num1) {
		System.out.println(Num1);
		if(Num1 %2 == 1) {
			System.out.println("Estranho");
		}else if(Num1 < 10 && Num1 %2 == 0) {
			System.out.println("Nao e estranho");
		}else if(Num1 %2 == 0 && Num1 > 10 && Num1 < 20) {
			System.out.println("Estranho");
		}else if(Num1 %2 == 0 && Num1 > 20) {
			System.out.println("Nao e estranho");
		}
		
	}

}
