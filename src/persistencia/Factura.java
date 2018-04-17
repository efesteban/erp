/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Date;

/**
 *
 * @author francoesteban
 */
public class Factura {

    private int idFactura;
    private int numero;
    private int idCliente;
    private int idServicio;
    private String ordenCompra;
    private String fechaEmision;
    private String fechaPago;
    private String descripcion;
    private int monto;
    private String estado;
    
    public Factura() {
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    public int getIdFactura() {
        return idFactura;
    }

    public int getNumero() {
        return numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
    
}
