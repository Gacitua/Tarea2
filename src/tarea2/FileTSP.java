/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import static tarea2.FileTSP.permutar;


/**
 * Esta clase guarda toda la información obtenida del archivo .tsp
 * @author JavierAros
 */
public class FileTSP {

    static int dimension;

    
    private String name;
    private String type;
    private String comment;
    
    private String edgeWeightType;
    private String edgeWeightFormat;
    private String displayDataType;
    static int[][] edgWeightSection;
    private ArrayList<Nodo> displayDataSelection;
    /**
     * Constructor para guardar la informacion
     * @param args
     */
    //public FileTSP(File archivo){
    public static void main(String args) {
    String[] archivo=new String[1000];
    String[] file2=new String[1000];
    int i=0;
    try {
        File tsp = new File(args);  //"C:\\Users\\Matías\\Documents\\NetBeansProjects\\Tarea2\\bays29.tsp"
        BufferedReader br = new BufferedReader(new FileReader(tsp));
        String line = "";
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line,"");

        while (st.hasMoreTokens()) {
            String str=st.nextToken();
            archivo[i]=String.valueOf(str);
            
            //System.out.print(archivo[i]);
            i=i+1;
        }
        //System.out.println();
        //System.out.print(archivo[3]);
      }
      
      br.close();

    } catch (FileNotFoundException e) {
    } catch (IOException e) {
    }
    String[] parts;
        parts = archivo[3].split(" ");
    //int dimension;
        dimension = Integer.parseInt(parts[1]);
        String[][] aux = new String[dimension][];
        //int[][] edgWeightSection;
        edgWeightSection = new int[dimension][dimension];
    
    for(int j=8; j<8+dimension;j++){
        aux[j-8]=archivo[j].split(" ");
    }
    int x=0;
    int y=0;
        
    for(int m=0; m<dimension;m++){
        for(int n=0; n<aux[m].length; n++){
            if (!"".equals(aux[m][n]) && aux[m][n]!=null) {
                edgWeightSection[x][y]=Integer.parseInt(aux[m][n]);
                y=y+1;
            }
        }
        //System.out.println(Arrays.toString(edgWeightSection[x]));
        x=x+1;
        y=0;
    }
    String[][] aux2 = new String[dimension][];
    for(int j=9+dimension; j<9+2*dimension;j++){
        aux2[j-(9+dimension)]=archivo[j].split(" ");
    }
    x=0;
    y=0;
    double[][] displayDataSelection;
    displayDataSelection = new double[dimension][3];
    
    for(int m=0; m<dimension;m++){
        for(int n=0; n<aux2[m].length; n++){
            if (!"".equals(aux2[m][n]) && aux2[m][n]!=null) {
                displayDataSelection[x][y]=Double.parseDouble(aux2[m][n]);
                y=y+1;
            }
        }
        //System.out.println(Arrays.toString(displayDataSelection[x]));
        x=x+1;
        y=0;
    }
    
 

    

  } //Final de main
    /***************************
     *Algorítmo de Fisher-Yates
     * @return 
     ***************************/
    
    public static String permutar(int eleccion){
    
    

    int[] a= new int[dimension];  
    for (int s=1; s<=dimension;s++){
        a[s-1]=s;
    }
    int az;
    int tmp;

    int tamaño=a.length;
    for (int k=tamaño-1;k>=1;k--){      
        az= (int) (Math.random()*k);
        tmp=a[az];
        a[az]=a[k];
        a[k]=tmp;
    }
    /***************************
     ***************************/
    int Costo=0;            //Almacena el costo total de viajar
    int City1;              //Posición de la ciudad de inicio
    int City2;              //Posición de la ciudad de destinto
    for (int s=0;s<dimension;s++){
        City1=a[s];
        if((s+1)<dimension){   //
            City2=a[s+1];}
        else{City2=a[0];}
        Costo=edgWeightSection[City1-1][City2-1]+Costo;
    }
    String [] per_cost= new String[2];
    per_cost[0]=Arrays.toString(a);
    per_cost[1]=Integer.toString(Costo);
    return per_cost[eleccion];
    }
    
    }


