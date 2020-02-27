package com.raphael.fernandoads.atividades;

public class desafio4 {
	   
    public static void tabuada (Integer var1){
   
            int cont = 0, resul;
           
         
            while (var1 <= 10)
            {
                while (cont <= 10)
                {
                	resul = var1 * cont;
                    System.out.println(var1 + " x " + cont + " = " + resul);
                    cont = cont + 1;
                }

            }
   
    }

}