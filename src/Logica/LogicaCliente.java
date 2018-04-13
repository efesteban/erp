/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.util.ArrayList;
import persistencia.Cliente;
import persistencia.Conectar;

/**
 *
 * @author francoesteban
 */
public class LogicaCliente {

    public LogicaCliente() {
    }
    
    public ArrayList<Cliente> returnAllCustomer(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
       
        
        return listaClientes;
        
    }
    
}
