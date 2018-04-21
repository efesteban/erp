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
import persistencia.Conectar;
import persistencia.Usuario;

/**
 *
 * @author francoesteban
 */
public class LogicaUsuario {

    public LogicaUsuario() {
    }
    
    public Usuario login(String nombreUsuario, String contrasena) throws SQLException{
        Usuario usuario = new Usuario();
        
        Conectar c = new Conectar();
        Connection conexion = c.conexion();
        
        String query = "SELECT * FROM Usuario WHERE usuario ='"+nombreUsuario+"'";
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);

            rs.next();

            usuario.setIdUsuario(rs.getInt("idUsuario"));
            usuario.setNombre(rs.getString("usuario"));
            usuario.setContrasena(rs.getString("contrasena"));
            usuario.setPerfil(rs.getInt("Perfil_idPerfil"));
            
            usuario.setApellidoMaterno(rs.getString("apellidoMaterno"));
            usuario.setApellidoPaterno(rs.getString("apellidoPaterno"));
            usuario.setNombres(rs.getString("nombres"));
            usuario.setEmail(rs.getString("email"));

            st.close();

            if(usuario.getContrasena().equals(contrasena)){
                //Contraseña valida
                return usuario;
            }else{
                return null;
            }

        }catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            return null;
        }               
    }
    
    
    
}
