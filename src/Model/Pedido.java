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
public class Pedido {
    private int nuped;
    private float vlrnota;
    private String codcli;
    public ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public Pedido(int nuped, float vlrnota, String codcli) {
        this.nuped = nuped;
        this.vlrnota = vlrnota;
        this.codcli = codcli;
    }

    public int getNuped() {
        return nuped;
    }

    public void setNuped(int nuped) {
        this.nuped = nuped;
    }

    public float getVlrnota() {
        return vlrnota;
    }

    public void setVlrnota(float vlrnota) {
        this.vlrnota = vlrnota;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }
    
    public void gravaPedido(){
        c.cadastraPedido(this.nuped, this.vlrnota, this.codcli);
    }
    /*
    public ArrayList<PedidoItem> getItensPedido(){
        return c.getItensPedido(this.nuped);
    }*/
}
