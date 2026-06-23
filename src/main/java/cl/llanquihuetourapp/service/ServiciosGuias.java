/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.llanquihuetourapp.service;

import cl.llanquihuetourapp.model.Guia;
import java.util.ArrayList;

/**
 * Clase los servicios de guias a los que el usuario puede acceder
 * Clase utilizada para interactuar con el Arraylist de guias
 */

public class ServiciosGuias {
    private ArrayList<Guia> guias; 
    
 /**
 * 
 * @param guias representa el nombre de la Arraylist 
 */

    public ServiciosGuias(ArrayList<Guia> guias) {
        this.guias = guias;
    }
    
    /**
     * Metodo para listar los contenidos de la ArrayList
     */
    
    public void listarGuias() {
        if (guias.isEmpty()) {
            System.out.println("No hay guias cargados.");
        } else {
            for (Guia guia : guias) {
                System.out.println(guia);
            }
        }
    }
    
}
