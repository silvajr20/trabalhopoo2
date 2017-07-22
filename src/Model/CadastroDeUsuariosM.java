/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fabio
 */
public class CadastroDeUsuariosM extends ValidacaoEntradaTM{
    
    
    public String login, senha;
    
    public CadastroDeUsuariosM(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    @Override
    public boolean validaEntradaDeDados(){
        if(login.equals("")){
            System.out.println("Insira o login do usuario para prosseguir");
        }else
            if(senha.equals("")){
                System.out.println("Insira a senha do usuario para prossegui");
            }
        else
                return true;
                
        
        return false;
    }
   
    
    
    
    
    
}
