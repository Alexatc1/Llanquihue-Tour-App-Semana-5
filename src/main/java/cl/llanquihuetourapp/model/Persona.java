package cl.llanquihuetourapp.model;

/**
 * Representa a una persona
 * Esta clase se utiliza para crear una Persona 
 * Clase utiliza composicion ya que una Persona tiene una Direccion
 */
public class Persona {
    private String nombre;
    private String rut;
    private int edad;
    private String correo;
    private Direccion direccion;
    
    /**
     * Constructor de la clase Persona
     * 
     * @param nombre representa el nombre de la persona
     * @param rut representa el rut de la persona
     * @param edad representa la edad de la persona
     * @param correo representa el correo de la persona
     * @param direccion representa la direccion de la persona
     */

    public Persona(String nombre, String rut, int edad, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    /**
     * Metodo para mostrar la informacion completa de la persona
     * @return devuelve la informacion completa de la persona en formato de
     * texto
     */
    
    public String mostrarInformacion() {
        String mensaje = "Nombre: " + nombre + ", Rut: " + rut + ", Edad: " + edad + ", Correo: " + correo + ", Direccion: " + direccion.mostrarDireccion();
        return mensaje;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return devuelve la informacion completa de la persona utilizando el 
     * metodo toString
     */
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", correo=" + correo + ", direccion=" + direccion + '}';
    }
    
}
