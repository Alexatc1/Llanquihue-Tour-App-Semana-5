package cl.llanquihuetourapp.service;

import cl.llanquihuetourapp.model.PaqueteTuristico;
import java.util.ArrayList;

/**
 * Clase representa los servicios a los que el usuario puede acceder.
 * Clase utilizada para interactuar con la arraylist de paquetes turisticos.
 */

public class Servicios {
    private ArrayList<PaqueteTuristico> paquetes;   
    
/**
 * 
 * @param paquetes representa el nombre de la Arraylist 
 */
    public Servicios(ArrayList<PaqueteTuristico> paquetes) {
        this.paquetes = paquetes;
    }
    
    /**
     * Metodo para listar los contenidos de la ArrayList
     */
    
    public void listarPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes cargados.");
        } else {
            for (PaqueteTuristico paqueteturistico : paquetes) {
                System.out.println(paqueteturistico);
            }
        }
    }
    
    /**
     * Metodo para buscar los paquetes turisticos por categoria.
     * @param categoriaBuscada Representa la categoria que se desea buscar
     */
    
    public void buscarPorCategoria(String categoriaBuscada) {
        boolean encontrado = false;

        for (PaqueteTuristico paqueteturistico : paquetes) {
            if (paqueteturistico.getCategoria().equalsIgnoreCase(categoriaBuscada)) {
                System.out.println(paqueteturistico);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron paquetes turisticos en la categoría: " + categoriaBuscada);
        }
    }
    
}
