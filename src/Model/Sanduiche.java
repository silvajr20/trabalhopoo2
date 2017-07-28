/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConexaoBancoDeDados;

/**
 *
 * @author fabio
 */
public abstract class Sanduiche {
    
    protected ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();
    
    public abstract float getPreco();
    
    public abstract String getDescricao();
    
}
