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
import persistencia.Conectar;
import persistencia.Factura;

/**
 *
 * @author francoesteban
 */
public class LogicaFactura {

    public LogicaFactura() {
    }
    
    public ArrayList<Factura> returnAllFactura() throws SQLException{
        ArrayList<Factura> listaFacturas = new ArrayList<>();
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
        
        String query ="SELECT * FROM Factura";
        
        try{     
            
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                
                Factura factura = new Factura();
                
                factura.setDescripcion(rs.getString("descripcion"));
                factura.setEstado(rs.getString("estado"));
                factura.setFechaEmision(rs.getString("fechaEmision"));
                factura.setFechaPago(rs.getString("fechaPago"));
                factura.setIdCliente(rs.getInt("Cliente_idCliente"));
                factura.setIdFactura(rs.getInt("idFactura"));
                factura.setIdServicio(rs.getInt("Servicio_idServicio"));
                factura.setMonto(rs.getInt("monto"));
                factura.setNumero(rs.getInt("numero"));
                factura.setOrdenCompra(rs.getString("ordenCompra"));
                
                listaFacturas.add(factura);
                                
            }
            
            conexion.close();
            return listaFacturas;
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return null;
        } 
       
    }
    
    public boolean ingresarFactura(Factura factura) throws SQLException{
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
        
        String query = "INSERT INTO Factura (Cliente_idCliente, Servicio_idServicio, ordenCompra, numero, fechaEmision, fechaPago, descripcion, monto, estado) "
                            +"VALUES ("+ factura.getIdCliente() +", "+factura.getIdServicio()+", '"+ factura.getOrdenCompra() + "', "+ factura.getNumero()+", '"+factura.getFechaEmision()+"', '"+factura.getFechaPago()+"', '"+factura.getDescripcion()+"', "+factura.getMonto()+", '"+factura.getEstado()+"')";
        
        try{       
            Statement st = conexion.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate(query);

            conexion.close();
            return true;
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return false;
        }
        
    }
    
}
