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
// codprod = 4
public class SanduicheVegetariano extends Sanduiche{
    
    public float getPreco(){
        return c.getPrecoProduto(4);
    }
    
    public String getDescricao(){
        return "Sanduiche Vegetariano: Pão Francês, alface, rúcula, mussarela, tomate seco, milho, ovo frito";
    }
}
