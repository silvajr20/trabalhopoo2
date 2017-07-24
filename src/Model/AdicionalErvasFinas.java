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
public class AdicionalErvasFinas extends Adicional{
    
    
    public AdicionalErvasFinas(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + " com Ervas Finas";
    }

    @Override
    public float getPreco() {
        return sanduiche.getPreco() + 1.5f;
    }
    
}
