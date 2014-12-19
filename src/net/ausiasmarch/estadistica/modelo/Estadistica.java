package net.ausiasmarch.estadistica.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adrian Garcia
 */
public class Estadistica {

private List<Ciudad> ciudades;          //  Lista de ciudades

    /**
     * Constructor
     *
     * @param ciudades C
     */
    public Estadistica(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * Constructor
     */
    public Estadistica() {
        ciudades = new ArrayList<>();
    }

    /**
     * Obtiene la lista de ciudades
     *
     * @return List<Ciudad>
     */
    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    /**
     * Establece la lista de ciudades
     *
     * @param ciudades
     */
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * Obtiene la suma de habitantes
     *
     * @return int
     */
    public int getSumaHabitantes() {
        int suma = 0;
        for (Ciudad ciudad : ciudades) {
            suma += ciudad.getHabitantes();
        }
        return suma;
    }

    /**
     * Obtien el numero de ciudades de la lista
     *
     * @return int
     */
    public int getNumCiudades() {
        return ciudades.size();
    }

    /**
     * Obtiene la media de habitantes de las ciudades
     *
     * @return double
     */
    public double getMediaHabitantes() {
        return getSumaHabitantes() / getNumCiudades();
    }
 
    /**
        *  Obtiene la ciudad con menor numero de habitantes
        * 
        *  @return List<Ciudad>
        */
    public Ciudad getCiudadMenorHabitantes() {
        return Collections.min(ciudades,new HabitantesComparator());        
        
    }
    /**
        *  Obtiene la ciudad con mayor numero de habitantes
        * 
        *  @return List<Ciudad>
         */
    public Ciudad getCiudadMayorHabitantes() {
        return Collections.max(ciudades,new HabitantesComparator());       
    }
    
    /**
         * Metodo para ordenar las ciudades de menor a mayor nombre (ASCENDENTE)
        * @return List
        */
    public void ordenarPorNombreAsc() {
        Collections.sort(ciudades, new NombreComparator());
    }
    
   /**
        *Metodo para desordenar las ciudades
        * 
        */    
    public void desordenar (){
        Collections.shuffle(ciudades);
    }
    
    /**
        *  Busca la ciudad con el nombre indicado
        * @param String nombre
        * @return List <Ciudad>
        */
    public int buscarCiudad(String nombre) {
        ordenarPorNombreAsc();
        return Collections.binarySearch(ciudades, nombre, new NombreComparator());
    }    
    
    /**
         * Borra la ciudad con el nombre indicado
         * 
         * @param nombre
         * @return List
         */
    public boolean borrarCiudad (String nombre) {
        Ciudad ciudad = ciudades.get(buscarCiudad(nombre));
        return ciudades.remove(ciudad);
    }
        
    /**
         *  Metodo para ordenar por HABITANTE ASCENDENTE
         * 
         */
    public void ordenarPorHabitanteAsc(){
        Collections.sort(ciudades, new HabitantesComparator());
    }
    
    /**
        *  Metodo para ordenar por HABITANTE DESCENDENTE
        * 
        */
    public void ordenarPorHabitanteDesc() {
        ordenarPorHabitanteAsc();
        Collections.reverse(ciudades);
    }
    
    /**
        * Metodo para calcular el numero de ciudades a partir de una cantidad de habitantes que le pase como parametro
        * 
        */    
    public int ciudadesConHabitantes(int valor) {
        
        int total = 0;
        
        for ( Ciudad ciudad : ciudades ) {
            if (ciudad.getHabitantes() >= valor) {
                total ++;                
            }
        }
        return total;
    }
    
    /**
        * Metodo que devuelve lista de ciudades con unos habitantes especificado 
        * @param Habitantes
        * @return List
        */
    public List<Ciudad> getListaCiudadesMayorIgualHab(int valor) {
        List<Ciudad> ciudadesHab = new ArrayList<>();
        
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getHabitantes() >= valor) {
                ciudadesHab.add(ciudad);
            }
        }
        return ciudadesHab;
    }
}
