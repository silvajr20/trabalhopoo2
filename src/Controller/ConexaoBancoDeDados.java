

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.PedidoItem;
import Model.Produto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


/**
 *
 */
public class ConexaoBancoDeDados {
    private static ConexaoBancoDeDados instancia;
    
    private Connection c = null;
    private ConectaBanco acaoConectar = null;
    
    private String usuarioBanco = "postgres";
    private String senhaBanco = "root";
    
    private ConexaoBancoDeDados(String banco){
        try{
            switch(banco){
                case "mysql":
                    acaoConectar = new ConectaMySQL(usuarioBanco, senhaBanco);
                    break;
                case "psql":
                    
                    acaoConectar = new ConectaPsql(usuarioBanco, senhaBanco);
                    break;
                case "oracle":
                    
                    acaoConectar = new ConectaOracle(usuarioBanco, senhaBanco);
                    break;
                    
                default:
                    acaoConectar = new ConectaMySQL(usuarioBanco, senhaBanco);
                    
                    break;
            }
            if(acaoConectar!=null)
                c = acaoConectar.ConectarAoBanco();
            
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public float getPrecoProduto(int codprod){
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select vlrprod from produto where codprod = '" + codprod + "'");
        
            if(resultado.next()){
                return resultado.getFloat("vlrprod");
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        return -1; // -1 significa que não achou o produto
    }
    
    public ArrayList<Produto> getProdutos(){
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from produto");
        
            while(resultado.next()){
                produtos.add(new Produto( resultado.getInt("codProd"),  resultado.getString("descprod"), resultado.getFloat("vlrprod"), resultado.getInt("qtdprod")));
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return produtos;
    }
    public ArrayList<Produto> getAdicionais(){
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from produto where codprod in (6,7,8)");
        
            while(resultado.next()){
                produtos.add(new Produto( resultado.getInt("codprod"),  resultado.getString("descprod"), resultado.getFloat("vlrprod"), resultado.getInt("qtdprod")));
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return produtos;
    }
    
    public ArrayList<Cliente> getClientes(){
        
        ArrayList<Cliente> clis = new ArrayList();
        
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from clientes");
        
            while(resultado.next()){
                clis.add(new Cliente(resultado.getString("cpfcnpj"),  resultado.getString("nomecli"),  resultado.getString("email"),  resultado.getString("telefone")));
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return clis;
    }
    
    /*
    public ArrayList<PedidoItem> getItensPedido(int nuped){
    
        ArrayList<PedidoItem> itens = new ArrayList();
        
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from itens_pedido where nuped = '" + nuped + "'");
        
            while(resultado.next()){
                itens.add(new PedidoItem( resultado.getInt("nuped") , resultado.getInt("codprod") , resultado.getInt("qtdprod") ));
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return itens;
    }
    
    public ResultSet getItensPedidoFormatado(int nuped){
    
        
        try{
            int count = 0;
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select pro.descprod, ite.qtdprod, pro.vlrprod, (ite.qtdprod*pro.vlrprod) as subtotal from itens_pedido ite inner join produto pro on pro.codprod = ite.codprod where nuped = '" + nuped + "'");
        
            if(resultado.next()){
                return resultado;
            }
            
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return null;
    } */

    
    // Valida usuário e senha no banco
    // retorna true se o usuário existe, false se não
    public boolean validaUsuario(String usuario, String senha){
    
        try{
            Statement stmt = c.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from users where nome = '" + usuario + "' and senha = '" + senha + "' ");
        
            if(resultado.next()){
                return true;
            }
        } catch(Exception e){
            e.getStackTrace();
        }
        
        return false;
    }
    
    public void cadastraUsuario(String usuario, String senha, char tipo){
        
        
        Statement stmt;
        try {
            stmt = c.createStatement();
            String query = "insert into users (nome, senha, tipo) values ('" + usuario + "' , '" + senha + "' , '" + tipo + "'"  + ")";
            stmt.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cadastraProduto(String descprod, float vlrprod, int qtdprod){
        
        
        Statement stmt;
        try {
            stmt = c.createStatement();
            String query = "insert into produto (descprod, vlrprod, qtdprod) values ('" + descprod + "' , '" + vlrprod + "', " + "'" + qtdprod + "'" + ")";
            stmt.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cadastraCliente(String cpfcnpj, String email, String nomecli, String telefone){
        
        
        Statement stmt;
        try {
            stmt = c.createStatement();
            String query = "insert into clientes values ('" + cpfcnpj + "' , '" + nomecli + "', '" + email + "' , '" + telefone + "')";
            stmt.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void cadastraPedido(int nuped, float vlrnota, String codcli) {
    
        Statement stmt;
        try {
            stmt = c.createStatement();
            String query = "insert into pedido values ('" + nuped + "' , '" + vlrnota + "', '" + codcli + "')";
            stmt.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cadastraItemPed(int nuped, int codprod, int qtdprod) {
    
        Statement stmt;
        try {
            stmt = c.createStatement();
            String query = "insert into itens_pedido values ('" + nuped + "' , '" + codprod + "', '" + qtdprod + "')";
            stmt.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ConexaoBancoDeDados getInstance(){
        if( instancia == null){
            instancia = new ConexaoBancoDeDados("psql");
        }
        return instancia;
    }

    
    

}
