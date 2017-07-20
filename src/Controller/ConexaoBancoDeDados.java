

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
/**
 *
 * @author fabio
 */
public class ConexaoBancoDeDados {
    private static ConexaoBancoDeDados instancia;
    
    private Connection c = null;
    
    private String usuarioBanco = "sanduser";
    private String senhaBanco = "12345678";
    
    private ConexaoBancoDeDados(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanduiche_iche", usuarioBanco, senhaBanco);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
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
    
    
    public static ConexaoBancoDeDados getInstance(){
        if( instancia == null){
            instancia = new ConexaoBancoDeDados();
        }
        return instancia;
    }
    
    

}
