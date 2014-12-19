package net.ausiasmarch.estadistica.modelo;

import java.util.Comparator;

/**
 *
 * @author Adrian Garcia
 */
public class HabitantesComparator implements Comparator<Ciudad> {

    @Override
    public int compare(Ciudad c1, Ciudad c2) {
        return c1.getHabitantes() - c2.getHabitantes();
    }
    
}
