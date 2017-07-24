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
public abstract class Adicional extends Sanduiche{
    protected Sanduiche sanduiche;
        
    public Adicional(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    
}
