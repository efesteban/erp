/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author francoesteban
 */
public class Conectar {
    
    Connection con = null;
    
    public Connection conexion(){
        try{
            //cargar nuestro driver
            Class.forName("com.mysql.jdbc.Driver");     
            con = DriverManager.getConnection("jdbc:mysql://201.148.105.87:3306/aramayot_corp","aramayot_admin","xD181831995");
            System.out.println("conexion establecida");
        }catch(Exception e){
            System.out.println("ERROR DE CONEXION" + e);
        }
        return con;
    }
    
}
