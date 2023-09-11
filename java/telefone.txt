
package com.mycompany.telefone;
import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {
        System.out.println("Telefone");
        
        while(true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite uma Palavra: ");
            String p = entrada.next().toUpperCase();
            if(p.length()<16){
               p = p.replace("A", "2");
               p = p.replace("B", "2");
               p = p.replace("C", "2");
               
               p = p.replace("D", "3");
               p = p.replace("E", "3");
               p = p.replace("F", "3");
               
               p = p.replace("G", "4");
               p = p.replace("H", "4");
               p = p.replace("I", "4");
               
               p = p.replace("J", "5");
               p = p.replace("K", "5");
               p = p.replace("L", "5");
                
               p = p.replace("M", "6");
               p = p.replace("N", "6");
               p = p.replace("O", "6");
                
               p = p.replace("P", "7");
               p = p.replace("Q", "7");
               p = p.replace("R", "7");
               p = p.replace("S", "7");
                
               p = p.replace("T", "8");
               p = p.replace("U", "8");
               p = p.replace("L", "8");
                
               p = p.replace("W", "9");
               p = p.replace("X", "9");
               p = p.replace("Y", "9");
               p = p.replace("Z", "9");
                
                System.out.println("Telefone: "+ p);
            }else{
                System.out.println("Invalido");
            }
            
        }
    }
}
