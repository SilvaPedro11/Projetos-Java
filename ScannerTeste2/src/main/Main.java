package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        double nota1, nota2, nota3, media;
        String nome;
        
        
        System.out.println("Digite o nome do aluno");
        nome = grava.next();
        
        System.out.println("Digite a primeira nota");
        nota1 = grava.nextDouble();
        
        System.out.println("Digite a segunda nota");
        nota2 = grava.nextDouble();
        
        System.out.println("Digite a terceira nota");
        nota3 = grava.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("O aluno " + nome + " teve como média a nota " + media);
        
    }
    
}
