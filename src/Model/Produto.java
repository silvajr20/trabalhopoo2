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
public class Produto {
    private String descrprod;
    private float vlrprod;
    private int qtdprod;

    public Produto(String descrprod, float vlrprod, int qtdprod) {
        this.descrprod = descrprod;
        this.vlrprod = vlrprod;
        this.qtdprod = qtdprod;
    }

    public String getDescrprod() {
        return descrprod;
    }

    public void setDescrprod(String descrprod) {
        this.descrprod = descrprod;
    }

    public float getVlrprod() {
        return vlrprod;
    }

    public void setVlrprod(float vlrprod) {
        this.vlrprod = vlrprod;
    }

    public int getQtdprod() {
        return qtdprod;
    }

    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }
    
    
    
}
