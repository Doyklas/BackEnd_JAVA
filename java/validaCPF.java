package com.mycompany.validandocpf;
import java.util.Scanner;

public class Main {

    public static  String numerosDobrados(int num){
        String resultado = "";

        for (int index = 0; index < 11 ; index++){
            resultado += num;
        }
        return resultado;
    }

    public static int validacao(int num){

        int resto = num%11;
        int digito = 0;

        if (resto > 2){
            digito = 11 - resto;
        }
        return digito;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String digitos_validacao = "";

        System.out.println("Insira seu cpf: ");

        String cpf = input.nextLine();
        if (cpf.compareTo(numerosDobrados(0)) == 0 || cpf.compareTo(numerosDobrados(1)) == 0 || cpf.compareTo(numerosDobrados(2)) == 0 
        || cpf.compareTo(numerosDobrados(3)) == 0 || cpf.compareTo(numerosDobrados(4)) == 0 || cpf.compareTo(numerosDobrados(5)) == 0
        || cpf.compareTo(numerosDobrados(6)) == 0 || cpf.compareTo(numerosDobrados(7)) == 0 || cpf.compareTo(numerosDobrados(8)) == 0
        || cpf.compareTo(numerosDobrados(9)) == 0){
            
            System.out.println("Cpf inválido, números dobrados.");
        
        }else{

        char[] cpf_validacao =  String.valueOf(cpf).toCharArray(); // array com os digitos do cpf
        int soma_validacao = 0; // Variavel que vai guardar o valor da operação

        // Verifica o primeiro digito
        for (int index = 0 ; index < 9 ; index++){
        int num = cpf_validacao[index] -48 ;  
        soma_validacao += num * (10 - index);
        }
        digitos_validacao += validacao(soma_validacao);

        // Zera a soma para verificar a segunda parte
        soma_validacao = 0;
        for (int index = 0 ; index < 10 ; index++){
        
        int num = cpf_validacao[index] - 48 ;  
        soma_validacao += num * (11 - index);
        }
        digitos_validacao += validacao(soma_validacao);

        //Verifica se a operação é o mesmo valor que os ultimos 2 digitos

        String cpf_digitosFinais = "";
        cpf_digitosFinais += String.valueOf(cpf_validacao[9]);
        cpf_digitosFinais += String.valueOf(cpf_validacao[10]);


        if(digitos_validacao.compareTo(cpf_digitosFinais ) == 0){
            System.out.println("Cpf valido.");
        }else{
            System.out.println("Cpf inválido");
        }
    }
    }
}
