package cl.llanquihuetourapp.app;

import cl.llanquihuetourapp.model.Guia;
import cl.llanquihuetourapp.model.PaqueteTuristico;
import cl.llanquihuetourapp.service.Servicios;
import cl.llanquihuetourapp.service.ServiciosGuias;
import cl.llanquihuetourapp.util.Lector;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        /**
         * Creacion de los objetos necesarios: Scanner, Lector, Arraylists, Servicios,
         * ServiciosGuias
         */
        Scanner sc = new Scanner(System.in);
        
        Lector lector = new Lector();
        ArrayList<PaqueteTuristico> paquetes = lector.cargarProductos("paquetes.txt");
        ArrayList<Guia> guias = lector.cargarGuias("guias.txt");
        
        
        Servicios servicios = new Servicios (paquetes);
        ServiciosGuias serviciosGuias = new ServiciosGuias (guias);
        
        /**
         * Switch que maneja cada caso en base a la variable opcion, esto es lo
         * que ve el cliente/usuario por pantalla y al ejecutar el programa
         */
        int opcion = 0;

        do {
            System.out.println("\n=== Sistema Llanquihue Tour ===");
            System.out.println("1. Listar todos los paquetes turisticos");
            System.out.println("2. Buscar paquete turistico por categoría");
            System.out.println("3. Listar todos los guias");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Cargando la lista de paquetes turisticos...");
                        servicios.listarPaquetes();
                        break;

                    case 2:
                        System.out.print("Ingrese categoría a buscar: ");
                        String categoria = sc.nextLine();
                        servicios.buscarPorCategoria(categoria);
                        break;

                    case 3:
                        System.out.println("Cargando la lista de guias...");
                        serviciosGuias.listarGuias();
                        break;
                        
                    case 4:                       
                        System.out.println("Cerrando el programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }

        } while (opcion != 4);

        sc.close();
    }
          
}
