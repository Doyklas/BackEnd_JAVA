package com.mycompany.cadidados;
import java.util.Scanner;
/**
 *
 * @author CT Desenvolvimento
 */
public class Cadidados {

    public static void main(String[] args) {
        System.out.println("Candidatos");
        Scanner entrada = new Scanner(System.in);
        int votosTotal = 0;
        int contNulo = 0;
        float nulosP = 0;
        int contBranco = 0;
        float brancoP = 0;
        
        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;
        
        
        
        for(int candidatos = 0; candidatos < 20; candidatos++){
            System.out.println("Opcões de Candidatos: \n 1 - Candidato A \n 2 - Candidato B \n 3 - Candidato C \n 4 - Candidato D \n 5 - Branco \n");
            System.out.println("Digite A Opcão Desejada: ");
            int op = entrada.nextInt();
            
            if(op == 0){
                System.out.println("Voto Nulo");
                contNulo++;
            }
            else if(op == 1){
                System.out.println("Voto Candidato A");
                contA++;
            }
            else if(op == 2){
                System.out.println("Voto Candidato B");
                contB++;
            }
            else if(op == 3){
                System.out.println("Voto Candidato C");
                contC++;
            }
            else if(op == 4){
                System.out.println("Voto Candidato D");
                contD++;
            }
            else if(op == 5){
                System.out.println("Voto em Branco");
                contBranco++;
            }
            else{
                System.out.println("Voto Nulo");
                contNulo++;
            }
            
            
        }
        votosTotal = contA + contB + contC + contNulo + contBranco;
        brancoP = (contBranco*100) /votosTotal;
        nulosP = (contNulo*100) /votosTotal;
                
        
        System.out.println("Porcentagem de votos Brancos = " + brancoP);
        System.out.println("Prcentagem de votos Nulos = " + nulosP);
       
        // A 
        //abcd
        if(contA>contB && contB>contC && contC > contD){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado B" );
            System.out.println("Cantidado 3° lugar Candidato C \n 4°Lugar Cantidado D" );
        }
        //abdc
        else if(contA>contB && contB>contD && contD > contC){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado B" );
            System.out.println("Cantidado 3° lugar Candidato D \n 4°Lugar Cantidado D" );
        }
        //acbd
        else if(contA>contC && contC>contB && contB > contD){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado C" );
            System.out.println("Cantidado 3° lugar Candidato B \n 4°Lugar Cantidado D" );
        }
        //acdb
        else if(contA>contC && contC>contD && contD > contB){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado C" );
            System.out.println("Cantidado 3° lugar Candidato D \n 4°Lugar Cantidado B" );
        }

        //adcb
        else if(contA>contD && contD>contC && contC > contB){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado D" );
            System.out.println("Cantidado 3° lugar Candidato C \n 4°Lugar Cantidado B" );
        }
        //adbc
        else if(contA>contD && contD>contB && contB > contC){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado D" );
            System.out.println("Cantidado 3° lugar Candidato B \n 4°Lugar Cantidado C" );
        }
        
        // B 
        //bacd
        if(contB>contA && contA>contC && contC > contD){
            System.out.println("Cantidado 1° lugar Candidato B \n 2°Lugar Cantidado A" );
            System.out.println("Cantidado 3° lugar Candidato C \n 4°Lugar Cantidado D" );
        }
        //badc
        else if(contB>contA && contA>contD && contD > contC){
            System.out.println("Cantidado 1° lugar Candidato B \n 2°Lugar Cantidado A" );
            System.out.println("Cantidado 3° lugar Candidato D \n 4°Lugar Cantidado C" );
        }
        //bcad
        else if(contB>contC && contC>contA && contA > contD){
            System.out.println("Cantidado 1° lugar Candidato B \n 2°Lugar Cantidado C" );
            System.out.println("Cantidado 3° lugar Candidato A \n 4°Lugar Cantidado D" );
        }
        //bacd
        else if(contB>contC && contC>contD && contD > contB){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado C" );
            System.out.println("Cantidado 3° lugar Candidato D \n 4°Lugar Cantidado B" );
        }

        //adcb
        else if(contA>contD && contD>contC && contC > contB){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado D" );
            System.out.println("Cantidado 3° lugar Candidato C \n 4°Lugar Cantidado B" );
        }
        //adbc
        else if(contA>contD && contD>contB && contB > contC){
            System.out.println("Cantidado 1° lugar Candidato A \n 2°Lugar Cantidado D" );
            System.out.println("Cantidado 3° lugar Candidato B \n 4°Lugar Cantidado C" );
        }
        
           //imcompleto
    }
}
