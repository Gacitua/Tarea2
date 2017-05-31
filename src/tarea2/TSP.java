package tarea2;

/**
 * Clase que contiene el Main genera un nuevo Threads para la interfaz grafica
 * @author JavierAros
 */
public class TSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }
    
}
