
package com.mycompany.kelvin;
//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Kelvin {

    public static void main(String[] args) {
        System.out.println("Converte em Kilvin");
        //Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite a temperatura em Celsius: ");
        String c, op;
        double f, k;
        int num, c1;
        
        
        
        c = JOptionPane.showInputDialog("Temperatura em CELSIUS");
        c1 = Integer.parseInt(c);
        
        //System.out.println(" 1° Fahrenheit (F) \n 2° Kelvin (K)\n");
        //System.out.println("escolha a coversao:");
        op = JOptionPane.showInputDialog("1° Fahrenheit (F) \n 2° Kelvin (K)\n Selecione a Op");
        num = Integer.parseInt(op);
        
        if(num == 1 || num == 2){
                if( num  == 1){
                    f = (c1 * 1.8) +32;
                    //System.out.println("Fahrenheit " + f);
                    JOptionPane.showMessageDialog(null,"Fahrenheit: "+ f, "Conversão Fahrenheit",JOptionPane.PLAIN_MESSAGE);
                }else if(num  == 2){
                    k = c1 + 273.15;
                    //System.out.println("Kelvin " + k);
                    JOptionPane.showMessageDialog(null,"Kelvin: "+ k, "Conversão Kelvin",JOptionPane.PLAIN_MESSAGE);
                }
        }else{
                    //System.out.println("INVALIDA");
                    JOptionPane.showMessageDialog(null,"Invalida", "error",JOptionPane.ERROR_MESSAGE);
                }
        }
}
