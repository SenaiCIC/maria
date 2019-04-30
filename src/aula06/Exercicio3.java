
package aula06;

import java.io.PrintStream;
import java.util.Scanner;


public class Exercicio3  {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Que horas vem o bonde?");
     int hora = sc.nextInt();
     if (hora<12){
     System.out.println("Então, bomdia!");
     }
     if (hora>=12 && hora<18){
     System.out.println("Então, boatarde!");
    }
     if (hora>=18){   
     System.out.println("Então, boanoite!");
    }
    sc.close();
    
}
