/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author francoesteban
 */
public class OrdenCompra {
    
        
    int idOrdenCompra;
    String numero;

    public OrdenCompra() {
    }

    public OrdenCompra(int idOrdenCompra, String numero) {
        this.idOrdenCompra = idOrdenCompra;
        this.numero = numero;
    }
    
    
    
    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public String getNumero() {
        return numero;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String toString()
    {
     return this.numero;
    }
    
    
    
}
