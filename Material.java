
package com.mycompany.fabrica_de_sillas;


public class Material {
    private int clavos;
    private String barniz;
    private String madera;
    private String pintura;
    private int tornillos;

    // Constructor
    public Material(int clavos, String barniz, String madera, String pintura, int tornillos) {
        this.clavos = clavos;
        this.barniz = barniz;
        this.madera = madera;
        this.pintura = pintura;
        this.tornillos = tornillos;
    }

    // Métodos getter para cada material
    public int getClavos() {
        return clavos;
    }

    public String getBarniz() {
        return barniz;
    }

    public String getMadera() {
        return madera;
    }

    public String getPintura() {
        return pintura;
    }

    public int getTornillos() {
        return tornillos;
    }

    // Métodos setter para cada material
    public void setClavos(int clavos) {
        this.clavos = clavos;
    }

    public void setBarniz(String barniz) {
        this.barniz = barniz;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public void setTornillos(int tornillos) {
        this.tornillos = tornillos;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Materiales:\n" +
               "Clavos: " + clavos + "\n" +
               "Barniz: " + barniz + "\n" +
               "Madera: " + madera + "\n" +
               "Pintura: " + pintura + "\n" +
               "Tornillos: " + tornillos;
    }
}