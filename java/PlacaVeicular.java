package com.mycompany.placaveicular;
import java.util.Scanner;
/**
 *
 * @author CT Desenvolvimento
 * PLACA VEICULAR ANTIGA - ABC1234
 */
public class PlacaVeicular {

    public static void main(String[] args) {
        System.out.println("PLACA VEICULAR ANTIGA - ABC1234");
        Scanner entrada = new Scanner(System.in);
        String placa = entrada.next().toUpperCase();
        
        if(placa.length() == 7){
            if(placa.substring(0, 3).matches("[A-Z]*")){
                if(placa.substring(3, 6).matches("[0-9]*")){
                System.out.println("Placa OK");
                    System.out.println(placa);
                
                }else{
                    System.out.println("Placa Invalida (4 ultimos Digitos)!");
                }
            }else{
                System.out.println("Placa Invalida (3 primeiros Digitos)!");
            }
            
            
        }else{
            System.out.println("Placa Invalida!");
        }
            
    }
}
