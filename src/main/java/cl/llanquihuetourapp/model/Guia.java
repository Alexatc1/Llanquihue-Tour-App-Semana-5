package cl.llanquihuetourapp.model;

/**
 * Representa a un guia
 * Clase utilizada para crear un guia
 */

public class Guia {
    private String nombre;
    private String rut;
    private String numguia;
    private boolean disponible;
    private int valor;

    /**
     * 
     * @param nombre Representa el nombre del guia
     * @param rut Representa el rut del guia
     * @param numguia Representa el numero de empleado del guia
     * @param disponible Representa si el guia esta disponible o no
     * @param valor Representa el valor del guia
     */
    public Guia(String nombre, String rut, String numguia, boolean disponible, int valor) {
        this.nombre = nombre;
        this.rut = rut;
        this.numguia = numguia;
        this.disponible = disponible;
        this.valor = valor;
    }

    //Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumguia() {
        return numguia;
    }

    public void setNumguia(String numguia) {
        this.numguia = numguia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * 
     * @return devuelve la informacion completa del guia utilizando el 
     * metodo toString
     */

    @Override
    public String toString() {
        return "Guia{" + "nombre=" + nombre + ", rut=" + rut + ", numguia=" + numguia + ", disponible=" + disponible + ", valor=$" + valor + '}';
    }
    
    
    
    
}
