/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import persistencia.Factura;

/**
 *
 * @author francoesteban
 */
public class FacturaModelTable extends AbstractTableModel {
    
    private ArrayList<Factura> listaFactura;

    public FacturaModelTable(ArrayList<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }
    
    

    @Override
    public int getRowCount() {
        return listaFactura.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object value = "??";
        Factura factura = listaFactura.get(rowIndex);
        
        switch (columnIndex) {
            
            case 0:
                value = factura.getIdFactura();
                break;
            case 1:
                value = factura.getNumero();
                break;
            case 2:
                value = factura.getOrdenCompra();
                break;
            case 3:
                value = factura.getFechaEmision();
                break;
            case 4:
                value = factura.getFechaPago();
                break;
            case 5:
                value = factura.getIdCliente();
                break;
            case 6:
                value = factura.getEstado();
                break;
            case 7:
                value = factura.getMonto();
                break;
        }

    return value;

    }
    
    @Override
    public String getColumnName(int index) {
        
        String column = "?";
        
        switch (index){
            case 0:
                column = "ID Factura";
                break;
            case 1:
                column = "Nº Factura";
                break;
            case 2:
                column = "Orden Compra";
                break;
            case 3:
                column = "Fecha Emisión";
                break;
            case 4:
                column = "Fecha Pago";
                break;
            case 5:
                column = "Cliente";
                break;
            case 6:
                column = "Situación";
                break;
            case 7:
                column = "Valor";
                break;      
        }            
        return column;            
    }
    
    
}
