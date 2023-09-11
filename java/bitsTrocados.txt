
package com.mycompany.bitstrocados;
import java.util.Scanner;

public class BitsTrocados {

    public static void main(String[] args) {
        System.out.println("Bits Trocados");
        int notas [] = {50, 10, 5, 1};
        int res [] = {0, 0, 0, 0};
        int cont = 1;
        while(true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o Valor que Deseja Sacar: ");
            int saque = entrada.nextInt();
            
            if(saque>0){
                for(int i=0;i<4;i++){
                res[i] = saque/(notas[i]);
                saque = saque%notas[i];
                }
            
            System.out.println("Notas de 50: " + res[0] );
            System.out.println("Notas de 10: " + res[1]);
            System.out.println("Notas de  5: " + res[2]);
            System.out.println("Notas de  1: " + res[3]);
            System.out.println("Teste = " + cont);
            }else{
                System.out.println("Sair");
                break;
                
                
            }
            cont++;
   
        }
    }
}
