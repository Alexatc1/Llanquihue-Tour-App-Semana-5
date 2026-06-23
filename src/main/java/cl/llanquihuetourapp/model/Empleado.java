package cl.llanquihuetourapp.model;

/**
 * Representa un Empleado
 * Esta clase se utiliza para crear un Empleado
 * Esta clase Hereda de la clase Persona
 */
public class Empleado extends Persona{
    private String cargo;
    private String numempleado;
    
    /**
     * Constructor de la clase Empleado
     * 
     * @param cargo representa el cargo del empleado en la empresa
     * @param numempleado representa el numero de empleado
     * @param nombre representa el nombre del empleado
     * @param rut representa el rut del empleado
     * @param edad representa la edad del empleado
     * @param correo representa el correo del empleado
     * @param direccion representa la direccion del empleado
     */

    public Empleado(String cargo, String numempleado, String nombre, String rut, int edad, String correo, Direccion direccion) {
        super(nombre, rut, edad, correo, direccion);
        this.cargo = cargo;
        this.numempleado = numempleado;
    }
    
    /**
     * Metodo para mostrar lla informacion completa del empleado
     * @return devuelve el mensaje con toda la informacion del empleado en
     * formato de texto
     */
    
    public String mostrarInformacionEmpleado() {
        String mensaje = "[Cargo: " + cargo + ", Numero de empleado: " + numempleado + "]"; 
                return mensaje;
    }
    
    //Getters y Setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(String numempleado) {
        this.numempleado = numempleado;
    }
    
    /**
     * 
     * @return dedvuelve la infomracion del empleado usando el metodo toString
     */

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", numempleado=" + numempleado + '}';
    }
   
}
