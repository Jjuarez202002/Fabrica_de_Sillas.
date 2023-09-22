
package com.mycompany.fabrica_de_sillas;

public class Bodega {
    private String direccion;
    private int capacidad;

    // Constructor
    public Bodega(String direccion, int capacidad) {
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    // Métodos getter
    public String getDireccion() {
        return direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Métodos setter
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Dirección: " + direccion + "\n" +
               "Capacidad: " + capacidad + " unidades";
    }
}

