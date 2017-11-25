/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 */
// codprod = 3
public class SanduicheArabe extends Sanduiche{
    
    public float getPreco(){
        return c.getPrecoProduto(3);
    }
    
    public String getDescricao(){
        return "Sanduiche Árabe (Kebab): Pão Sírio, carne assada, molho de Kefir, rúcula";
    }
}
