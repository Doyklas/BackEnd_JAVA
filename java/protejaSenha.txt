
package com.mycompany.protejasenha;
import java.util.Scanner;

public class ProtejaSenha {

    public static void main(String[] args) {
        System.out.println("Proteja Senha");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma Senha com 6 Numeros: ");
        int senha = entrada.nextInt();
        String s = Integer.toString(senha);
        
        System.out.println("Tamanho da Senha: " + s.length());
        
        if(s.length()==6){
            for(int i = 1; i <=6; i++ ){
               s = s.replace("1", "A");
               s = s.replace("7", "A");
               
               s = s.replace("3", "B");
               s = s.replace("9", "B"); 
               
               s = s.replace("0", "C");
               s = s.replace("8", "C"); 
               
               s = s.replace("5", "D");
               s = s.replace("6", "D");
               
               s = s.replace("2", "E");
               s = s.replace("4", "E"); 
               
                
                
            }
            System.out.println("Senha: "+ s);
        }else{
            System.out.println("Senha Invalida");
        }
        
    
    }
}
