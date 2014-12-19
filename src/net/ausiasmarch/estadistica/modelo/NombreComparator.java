package net.ausiasmarch.estadistica.modelo;

import java.util.Comparator;

/**
 *
 * @author Adrian Garcia
 */
public class NombreComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Ciudad ciudad = (Ciudad) o1;
        String nombre = o2.toString();
        return ciudad.getNombre().toUpperCase().compareTo(nombre.toUpperCase());
    }
}
