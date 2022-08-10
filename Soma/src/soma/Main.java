package soma;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        double num1, num2, num3, resultado;
        
        System.out.println("Digite o primeiro valor");
        num1 = grava.nextDouble();
        
        System.out.println("Digite o segundo valor");
        num2 = grava.nextDouble();
        
        System.out.println("Digite o terceiro valor");
        num3 = grava.nextDouble();
        
        resultado = (num1 + num2 + num3) * 10 / 2;
        
        System.out.println("O resultado é " + resultado);
        
        
    }
    
}
