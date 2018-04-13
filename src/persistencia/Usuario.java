/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author francoesteban
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String contrasena;
    private int perfil;
    
    

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    

}
