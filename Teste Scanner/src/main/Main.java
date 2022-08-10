package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        double valor1, valor2, resultado;
                
        System.out.println("Digite o primeiro valor");
        valor1 = grava.nextDouble();
        
        System.out.println("Digite o segundo valor");
        valor2 = grava.nextDouble();
        
        resultado = valor1 + valor2;
        
        System.out.println ("O resultado é \n " + resultado);
                
    
    }
    
}
