package tarea2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;

/**
 * Esta clase es el JFrame que contiene la parte visual
 * @author JavierAros
 */
public class Grafico extends javax.swing.JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public Grafico(){
     initUI();
    }
    /**
    * Método que inicializa la clase
    */
    private void initUI() {
        //evita el cambio de dimenciones
        setResizable(false);
        jPanel1 = new PanelDibujo();
        jLabel1 = new javax.swing.JLabel();
        jButtonGenerarPermutacion = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jLabelCosto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //titulo del Jframe
        setTitle("TSP");
        setMinimumSize(new java.awt.Dimension(WIDTH, HEIGHT));
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Costo de la solución:");
        //inicialización del botón que permite generar permutaciones
        jButtonGenerarPermutacion.setText("Generar permutacion");
        jButtonGenerarPermutacion.setToolTipText("");
        jButtonGenerarPermutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGenerarPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarPermutacionActionPerformed(evt);
            }
        });

        //inicialización del botón que permite cargar archivos
        jButtonCargar.setText("Cargar archivo");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jLabelCosto.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButtonGenerarPermutacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonCargar)
                .addGap(18, 18, 18)
                .addComponent(jButtonGenerarPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCosto)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();      
    }        

    /**
    * Método que utiliza la información cargada en la clase FileTSP para actualizar el panel de dibujo (JPanel)
    * @param evt El parámetro es el evento generado al apretar el botón
    */
    private void jButtonGenerarPermutacionActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    /**
    * Método que llama a un fileChooser, para seleccionar un archivo .tsp, para luego inicializar la clase FileTSP
    * @param evt El parámetro es el evento generado al apretar el botón
    */
    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }  
        
        
    private javax.swing.JButton jButtonGenerarPermutacion;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCosto;
    private PanelDibujo jPanel1;
    }

