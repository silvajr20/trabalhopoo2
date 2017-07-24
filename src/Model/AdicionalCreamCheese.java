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
public class AdicionalCreamCheese extends Adicional{

    
    public AdicionalCreamCheese(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + " com Cream Cheese";
    }

    @Override
    public float getPreco() {
        return sanduiche.getPreco() + 3.5f;
    }
    
}
