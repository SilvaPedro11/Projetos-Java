
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        double valor, resultado;
        
        System.out.println("Digite um valor");
        valor = grava.nextDouble();
        
        resultado = valor * 0.10;
        

        System.out.println("10% de " + valor + " é " + resultado);
    }
    
}
