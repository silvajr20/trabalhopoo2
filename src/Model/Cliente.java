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
public class Cliente extends ValidacaoEntradaTM{
    private String codcli;
    private String nomecli;
    private String emailcli;
    private String telefone;
    private ConexaoBancoDeDados c = ConexaoBancoDeDados.getInstance();

    public Cliente(String codcli, String nomecli, String emailcli, String telefone) {
        this.codcli = codcli;
        this.nomecli = nomecli;
        this.emailcli = emailcli;
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return this.nomecli;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    public static ArrayList<Cliente> getClientes(){
        return ConexaoBancoDeDados.getInstance().getClientes();
    }
      
    
    @Override
    public boolean validaEntradaDeDados(){
        
        if(this.nomecli.equals("") ){
            System.out.println("Insira o nome para prosseguir");
        } else
        if(this.emailcli.equals(null) || this.emailcli.equals("")){
            System.out.println("Insira o email para prosseguir");
        }else
        if(this.codcli.equals(null) || this.codcli.equals("")){
            System.out.println("Insira o CPF para prosseguir");
        } else
        if(this.telefone.equals(null) || telefone.equals("")){
            System.out.println("Insira o telefone para prosseguir");
        }else{
            return true;
           
        }
        return false;
    }
    
    
    public void cadastraCliente(){
        c.cadastraCliente(this.codcli, this.emailcli, this.nomecli, this.telefone);
    }
}
