

package com.mycompany.login;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author CT Desenvolvimento
 */
public class Login {

    public static void main(String[] args) {
        System.out.println("Login");
        //Scanner entrada = new Scanner(System.in);
        
        String login = "use123";
        String senha = "senha123";
        String novoLogin, novaSenha;
        
        boolean verdadeiro = true;
        while(verdadeiro){
            //System.out.println("Digite seu Usuario: ");
            novoLogin = JOptionPane.showInputDialog("Digite o Usuario: ");
            
            
            if(novoLogin.equals(login)){
                //System.out.println("Usuario Correto");
                //System.out.println("Digite sua Senha: ");
                //String novaSenha = entrada.next();
                while(verdadeiro){
                    //System.out.println("Digite sua Senha: ");
                    novaSenha = JOptionPane.showInputDialog("Digite sua Senha: ");
                    if(novaSenha.equals(senha)){
                        //System.out.println("Senha Correta");
                        //System.out.println("Logado com Sucesso");
                        JOptionPane.showMessageDialog(null,"Logado Com Sucesso ", "LOGIN",JOptionPane.PLAIN_MESSAGE);
                        verdadeiro = false;
                    }else{
                        JOptionPane.showMessageDialog(null,"Senha Incorreta ", "error",JOptionPane.ERROR_MESSAGE);
                }
            }
            }else{
                JOptionPane.showMessageDialog(null,"Usuario Incorreto", "error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
