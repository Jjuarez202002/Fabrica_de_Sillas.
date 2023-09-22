package com.mycompany.fabrica_de_sillas;
import java.util.Date;


public class Inventario {
     private int codigoProducto;
    private String nombreProducto;
    private int cantidad;
    private Date fechaIngreso;

    // Constructor
    public Inventario(int codigoProducto, String nombreProducto, int cantidad, Date fechaIngreso) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
    }

    // Métodos getter
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    // Métodos setter
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Código de Producto: " + codigoProducto + "\n" +
               "Nombre de Producto: " + nombreProducto + "\n" +
               "Cantidad: " + cantidad + "\n" +
               "Fecha de Ingreso: " + fechaIngreso;
    }
 }