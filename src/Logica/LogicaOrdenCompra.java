/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import persistencia.Conectar;
import persistencia.OrdenCompra;

/**
 *
 * @author francoesteban
 */
public class LogicaOrdenCompra {


    public LogicaOrdenCompra() {
    }
    
    
    
    public ArrayList<OrdenCompra> returnAllOrdenCompra(){
        ArrayList<OrdenCompra> listaOrdenCompra = new ArrayList<>();
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
        
        String query = "SELECT * FROM OrdenCompra";
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                OrdenCompra ordenCompra = new OrdenCompra();
                ordenCompra.setIdOrdenCompra(rs.getInt("idOrdenCompra"));
                ordenCompra.setNumero(rs.getString("numero"));
                
                listaOrdenCompra.add(ordenCompra);
            }
            
            st.close();
            
        }catch(Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return null;
        }
        
        
        return listaOrdenCompra;
        
    }

    
    
    
    
    
}
