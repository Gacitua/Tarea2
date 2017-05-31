
package tarea2;

import java.awt.Point;

/**
 * * Esta clase contiene la representación de las ciudades, guardando la id y su ubicación
 */

public class Nodo {
    private Point posicion;
    private int id;
     /**
     * Constructor del nodo
     * @param id El parámetro id es el identificador del nodo
     * @param x El parámetro x la posición x dentro del espacio
     * @param y El parámetro y la posición y dentro del espacio
     */
    public Nodo(int id, int x, int y){
        this.posicion = new Point(x, y);
        this.id = id;          
    }

    public Point getPosicion() {
        return posicion;
    }

    public int getId() {
        return id;
    }
    
    
}
