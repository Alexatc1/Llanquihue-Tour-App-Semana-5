package cl.llanquihuetourapp.model;

/**
 * Representa una direccion
 * Esta clase se utiliza para crear Direcciones
 */
public class Direccion {
    
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    /**
     * Constructor de la clase Direccion.
     * 
     * @param calle nombre de la calle
     * @param numero número de la dirección
     * @param ciudad ciudad donde vive el cliente
     * @param region región donde vive el cliente
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Muestra la dirección completa del cliente.
     * 
     * @return dirección formateada como texto
     */
    public String mostrarDireccion() {
        return calle + " numero " + numero + ", " + ciudad + ", Region de " + region + " ";
    }

    //getters y setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", region=" + region + ", numero=" + numero + '}';
    }
        
}
