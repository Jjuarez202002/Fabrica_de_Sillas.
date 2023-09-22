
package com.mycompany.fabrica_de_sillas;


public class Proveedor {
    private String nombre;

    // Constructor
    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    // Método getter
    public String getNombre() {
        return nombre;
    }

    // Método setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Nombre del Proveedor: " + nombre;
    }
}