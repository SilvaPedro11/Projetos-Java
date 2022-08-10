package soma2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
    Scanner grava = new Scanner (System.in);
    double valor, resultado;
    
    System.out.println("Digite um valor");
        valor = grava.nextDouble();
        
        resultado = (valor * 0.6 + 10) / 4;
        
    System.out.println("O resultado é " + resultado);


    }
    
}
