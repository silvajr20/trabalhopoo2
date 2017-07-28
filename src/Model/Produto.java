/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ConexaoBancoDeDados;
import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Produto {
    private int codprod;
    private String descrprod;
    private float vlrprod;
    private int qtdprod;

    public Produto(int codprod, String descrprod, float vlrprod, int qtdprod) {
        this.codprod = codprod;
        this.descrprod = descrprod;
        this.vlrprod = vlrprod;
        this.qtdprod = qtdprod;
    }

    @Override
    public String toString(){
        return this.descrprod;
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

    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }
    
    
    
    public static ArrayList<Produto> getProdutos(){
        return ConexaoBancoDeDados.getInstance().getProdutos();
    }
    
}
