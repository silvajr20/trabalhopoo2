/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;

/**
 *
 * @author fabio
 * Padrão Strategy
 */
public abstract class ConectaBanco {
    
    protected String usuarioBanco;
    protected String senhaBanco;
    
    public abstract Connection ConectarAoBanco() throws Exception;

    public ConectaBanco(String usuarioBanco, String senhaBanco) {
        this.usuarioBanco = usuarioBanco;
        this.senhaBanco = senhaBanco;
    }
}
