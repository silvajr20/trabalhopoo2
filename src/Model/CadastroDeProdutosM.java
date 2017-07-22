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
public class CadastroDeProdutosM extends ValidacaoEntradaTM {
    
    public String nome;
    public float preco;
    
    public CadastroDeProdutosM(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
  
    public boolean validaEntradaDeDados(){
        if(nome.equals("")){
            System.out.println("Insira corretamente o nome do produto.");
        }else
            if(preco == 0){
                System.out.println("Insira corretamente o preco do produto.");
            }
        else
                return true;
          
        return false;
    }
    
    
    
    
    
    
    
    
    
}
