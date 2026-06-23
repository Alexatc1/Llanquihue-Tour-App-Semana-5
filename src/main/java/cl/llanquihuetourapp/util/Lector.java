package cl.llanquihuetourapp.util;

import cl.llanquihuetourapp.model.Guia;
import cl.llanquihuetourapp.model.PaqueteTuristico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * Clase encargada de leer la informacion de los archivos de texto
 * 
 */


public class Lector {
    
 /**
 * Metodo cargarProducto se encarga de leer el archivo de texto y dividir la
 * informacion por cada ; que este presente, verifica que hayan 4 datos los cuales
 * corresponden a un paquete turistico y los almacena en un ArrayList
 * @param rutaArchivo representa el nombre del archivo de texto
 * @return devuelve la lista de paquetes turisticos
 */
    
    public ArrayList<PaqueteTuristico> cargarProductos(String rutaArchivo) {
        ArrayList<PaqueteTuristico> paquetes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 4) {
                    String codigo = datos[0];
                    String nombre = datos[1];
                    String categoria = datos[2];
                    int valor = Integer.parseInt(datos[3]);

                    PaqueteTuristico paquete = new PaqueteTuristico(codigo, nombre, categoria, valor);
                    paquetes.add(paquete);
                } else {
                    System.out.println("Línea con formato incorrecto: " + linea);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return paquetes;
    }
    
 /**
 * Metodo cargarGuias se encarga de leer el archivo de texto y dividir la
 * informacion por cada ; que este presente, verifica que hayan 5 datos los cuales
 * corresponden a un guia y los almacena en un ArrayList
 * @param rutaArchivo representa el nombre del archivo de texto
 * @return devuelve la lista de guias
 */
    
    public ArrayList<Guia> cargarGuias(String rutaArchivo) {
        ArrayList<Guia> guias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 5) {
                    String nombre = datos[0];
                    String rut = datos[1];
                    String numguia = datos[2];
                    boolean disponible = Boolean.parseBoolean(datos[3]);
                    int valor = Integer.parseInt(datos[4]);

                    Guia guia = new Guia(nombre, rut, numguia, disponible, valor);
                    guias.add(guia);
                } else {
                    System.out.println("Línea con formato incorrecto: " + linea);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return guias;
    }
}
