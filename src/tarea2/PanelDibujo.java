
package tarea2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;



/**
 * Esta clase es el panel de dibujo, donde será pintada las ciudades y el camino recorrido
 * @author JavierAros
 */
public class PanelDibujo extends JPanel {

    public PanelDibujo(){
        //dimensiones del panel
        setPreferredSize( new Dimension( 600, 600 ) );
        //pinta de blanco el fondo
        setBackground(new java.awt.Color(255,255,255));
       
      
    }

    /**
    * Método que es llamado para pintar el Jpanel, puede ser llamado utilizando el metodo repaint()
    */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //g2.drawLine(10,10,20,20);
        //g2.fillOval(10,10,5,5);
       
        
    }

   
}
