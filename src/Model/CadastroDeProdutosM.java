/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConexaoBancoDeDados;

/**
 *
 */
public class CadastroDeProdutosM extends ValidacaoEntradaTM {
    
    public String nome;
    public float preco;
    public int qtdEstoque;
    public ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();
    
    public CadastroDeProdutosM(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    
    @Override
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
    
    
    public void cadastraProduto(){
        c.cadastraProduto(this.nome, this.preco, this.qtdEstoque);
    }
    
    
    
    
    
    
    
}
