package cl.llanquihuetourapp.model;

/**
 * Esta clase se utiliza para la creacion de un paquete turistico.
 * Representa un paquete turistico.
 */

public class PaqueteTuristico {
    private String codigo;
    private String nombre;
    private String categoria;
    private int valor;

    /**
     * 
     * @param codigo representa el codigo del paquete turistico
     * @param nombre representa el nombre del paquete turistico
     * @param categoria representa la categoria a la que pertenece
     * @param valor representa el valor del paquete turistico
     */
    public PaqueteTuristico(String codigo, String nombre, String categoria, int valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.valor = valor;
    }
    
    //getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo toString
     * @return devuelve la informacion completa del paquete turistico
     * en formato de texto utilizando el metodo toString
     */
    @Override
    public String toString() {
        return "PaqueteTuristico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=$" + valor +
                '}';
    }
            
}
