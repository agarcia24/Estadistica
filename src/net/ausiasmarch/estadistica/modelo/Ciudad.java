package net.ausiasmarch.estadistica.modelo;

/**
 *
 * @author Adrian Garcia
 */
public class Ciudad {

    private String nombre;  // nombre de la ciudad
    private int habitantes; // numero de habitantes

    public Ciudad(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + " (" + habitantes + ")";
    }
    
  
    
}
    
