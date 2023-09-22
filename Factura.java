
package com.mycompany.fabrica_de_sillas;


public class Factura {
    private String numeroFactura;
    private int codigoProducto;
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private String fecha;
    private double total;

    // Constructor
    public Factura(String numeroFactura, int codigoProducto, String nombreProducto, double precio, int cantidad, String fecha, double total) {
        this.numeroFactura = numeroFactura;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    // Métodos getter para cada atributo
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    // Métodos setter para cada atributo
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Número de Factura: " + numeroFactura + "\n" +
               "Código de Producto: " + codigoProducto + "\n" +
               "Nombre de Producto: " + nombreProducto + "\n" +
               "Precio: " + precio + "\n" +
               "Cantidad: " + cantidad + "\n" +
               "Fecha: " + fecha + "\n" +
               "Total: " + total;
    }
}