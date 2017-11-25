/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 */
public class ConectaOracle extends ConectaBanco{

    public ConectaOracle(String usuarioBanco, String senhaBanco) {
        super(usuarioBanco, senhaBanco);
    }

    
    
    @Override
    public Connection ConectarAoBanco() throws Exception {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sanduiche_iche", usuarioBanco, senhaBanco);
        
    
    }
    
}
