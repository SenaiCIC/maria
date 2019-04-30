
package aula07;


public class OperaçôescomString {
    public static void main(String[] args) {
         String n = "Adailton";               
        String nM = n.toUpperCase();
        System.out.println("maiuscula ="+nM);
        String nm = n.toLowerCase();
        System.out.println("minusculo="+nm);
        String rec = " Senai CIC é o melhor do Brasil";
        String sub = rec.substring(6,9);
        System.out.println("Sub "+sub);
        String rep = rec.replace("Brasil","Mundo");
        System.out.println("Replace="+rep);
        int loc = rec.indexOf("ai");
        System.out.println("localizado="+loc);
        loc = rec.indexOf("si");
        System.out.println("localizado="+loc);
        String sp= "laranja maçã banana";
        String [] vect = sp.split(" ");
        String word1 = vect [0];
        String word2 = vect [1];
        String word3 = vect [2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
