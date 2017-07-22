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
public class CadastroDeClientesM extends ValidacaoEntradaTM{

    public String nome, email, cpf, telefone;
    
    public CadastroDeClientesM(String nome, String email, String cpf, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }
      
    
    @Override
    public boolean validaEntradaDeDados(){
        
        if(nome.equals("") ){
            System.out.println("Insira o nome para prosseguir");
        } else
        if(email.equals(null) || email.equals("")){
            System.out.println("Insira o email para prosseguir");
        }else
        if(cpf.equals(null) || cpf.equals("")){
            System.out.println("Insira o CPF para prosseguir");
        } else
        if(telefone.equals(null) || telefone.equals("")){
            System.out.println("Insira o telefone para prosseguir");
        }else{
            return true;
           
        }
        return false;
    }
    
    
    
    
}
