package com.mycompany.cpf1;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * CT Desenvolvimento
 */
public class Cpf1 {

      public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Integer i, j;   
        char dig10, dig11;                                    //  Variávies 
        
        boolean c = true;
        while(c){                                          //Looping
        System.out.println("\n Digite seu CPF: ");
        String cpf = dado.next();                            //input  
        
        if((cpf.equals("00000000000") ||cpf.equals("11111111111") ||
        cpf.equals("22222222222") || cpf.equals("33333333333") ||
        cpf.equals("44444444444") || cpf.equals("55555555555") ||
        cpf.equals("66666666666") || cpf.equals("77777777777") ||
        cpf.equals("88888888888") || cpf.equals("99999999999"))){ 
            System.out.printf("O é inválido");
        }else if (cpf.length() != 11){
            System.out.printf("O CPF tem um tamanho inválido");
           break;
        }

        for(i = 0; i < 2; i++){
            Integer soma = 0;
        float confirma = soma % 11;
            
        for(j = 0; j < cpf.length() - 2 + i; j++){    
            Integer peso =  10 - j + i;
            switch(cpf.charAt(j)){
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> { soma += Character.getNumericValue(cpf.charAt(j)) * peso;}
                
                default -> {System.out.println("O CPF aceita apenas números. ");
                break;
                }
            
            }
          }
            System.out.println("\n"+ soma);
            dig10 = '0';
            dig11 = '0';
            if(confirma < 2 || cpf.charAt(9) == dig10){
                System.out.printf("\nO CPF é válido! "+ cpf);
            }else if (confirma > 2 || cpf.charAt(10) == dig11){
                System.out.println("O CPF é válido!"+ cpf);
            }else{
                System.out.println("Este CPF não é válido!");
                break;
            }
        }
    }
   }
}
