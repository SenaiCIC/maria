
package aula06;

import java.util.Scanner;


public class Exercico04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    int nota3 = sc.nextInt();
    int nota4 = sc.nextInt();
    double media = 4/(nota1+nota2+nota3+nota4);
    System.out.println("Sua media é "+media);
    if (media<5){
    System.out.println("Reprovado");
    }
    if (media>=5&&media<6){
    System.out.println("Recuperação");
    }
    if (media>6&&media<9){
    System.out.println("Aprovado");
    }
    if (media>=9){
        System.out.println("Aprovado, PARABÉNS !!!");
    }
    sc.close();
    }
    
}
