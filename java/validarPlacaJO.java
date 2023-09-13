package com.mycompany.placaveicular;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author CT Desenvolvimento
 * PLACA VEICULAR ANTIGA - ABC1234
 */
public class PlacaVeicular {

    public static void main(String[] args) {
        String placa;
        System.out.println("PLACA VEICULAR ANTIGA - ABC1234");
        //Scanner entrada = new Scanner(System.in);
        placa = JOptionPane.showInputDialog("Digite a Placa").toUpperCase();
       
        if(placa.length() == 7){
            if(placa.substring(0, 3).matches("[A-Z]*")){
                if(placa.substring(3, 6).matches("[0-9]*")){
                    //System.out.println("Placa OK");
                    //System.out.println(placa);
                    JOptionPane.showMessageDialog(null,"Placa Valida \n" + placa, "Validação da Placa",JOptionPane.PLAIN_MESSAGE);
                
                }else{
                    //System.out.println("Placa Invalida (4 ultimos Digitos)!");
                    JOptionPane.showMessageDialog(null," Placa Invalida \n 4 ultimos Digitos Dnvalidos", "error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                //System.out.println("Placa Invalida (3 primeiros Digitos)!");
                JOptionPane.showMessageDialog(null,"Placa Invalida \n 3 primeiros Digitos Invalidos", "error",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }else{
            //System.out.println("Placa Invalida!");
            JOptionPane.showMessageDialog(null,"Placa Invalida", "error",JOptionPane.ERROR_MESSAGE);
        }
            
    }
}
