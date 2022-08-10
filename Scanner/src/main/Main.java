
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        
        double a, b;
        
        System.out.println("Digite o valor de A");
        a = grava.nextDouble();
        
        System.out.println("Digite o valor de B");
        b = grava.nextDouble();
 
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " - " + b + " = " + (a-b));
        
        
        
    }
    
}
