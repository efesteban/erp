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
    private String email;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    
    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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
