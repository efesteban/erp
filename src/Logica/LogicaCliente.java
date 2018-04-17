/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    
    public Cliente returnCustomer(String nombre) throws SQLException{
        Cliente cliente = new Cliente();
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
        
        String query = "SELECT * FROM Cliente WHERE nombre = '"+ nombre + "'";
        
         try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);

            rs.next();
            
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setNombre(rs.getString("nombre"));
            
            st.close();

            return cliente;
        
        }catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return null;
        } 
       
        
    }
    
}
