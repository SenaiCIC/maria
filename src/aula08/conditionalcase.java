
package aula08;

import java.util.Scanner;


public class conditionalcase {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        System.out.println("Tecle um numero de 1 a 7:");
        int dia = sc.nextInt();
        String dsemana;
        swith (dia){
        case 1:
            dsemana = "Domingo";
            break;
        case 2:
            dsemana = "Segunda";
            break;
        case 3:
            dsemana = "Terça";
         
        case 4:
            dsemana = "Quarta";
            break;
        case 5:
            dsemana = "Quinta";
            break;
    }
        
    }

    private static void swith(int dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
