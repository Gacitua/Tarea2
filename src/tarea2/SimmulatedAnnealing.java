
package tarea2;

import java.util.Random;

/**
 *
 * @author Matías



import java.util.Random;

/**
 * Implementacion de Simmulated annealing inspirado en
 * http://katrinaeg.com/simulated-annealing.html
 *
 * @author castudil
 */
public class SimmulatedAnnealing {

//    def anneal(solution):
//    old_cost = cost(solution)
//    T = 1.0
//    T_min = 0.00001
//    alpha = 0.9
//    while T > T_min:
//        i = 1
//        while i <= 100:
//            new_solution = neighbor(solution)
//            new_cost = cost(new_solution)
//            ap = acceptance_probability(old_cost, new_cost, T)
//            if ap > random():
//                solution = new_solution
//                old_cost = new_cost
//            i += 1
//        T = T*alpha
//    return solution, old_cost
    int solution[];
    double new_cost;
    double old_cost;
    private double temperature;
    private double tmin;
    private double alpha;
    private int[] new_solution;
    Random r = new Random();

    public double cost(int sol[]) {
    int Costo=0;            //Almacena el costo total de viajar
    int City1;              //Posición de la ciudad de inicio
    int City2;              //Posición de la ciudad de destinto
    for (int s=0;s<tarea2.FileTSP.dimension;s++){
        City1=sol[s];
        if((s+1)<tarea2.FileTSP.dimension){   //
            City2=sol[s+1];}
        else{City2=sol[0];}
        Costo=tarea2.FileTSP.edgWeightSection[City1-1][City2-1]+Costo;
    }

        return Costo;
    }

    public int[] neighbor(int sol[]) {
        int aux[];  //Será el arreglo que corresponde al parámetro recibido o la solución de las 8 reinas
        int auxN;   //Variable auxiliar que permite guardar el elemento que será intercambiado
        int azar1;  //Se genera esta variable para guardar la posición del elemento que se intercambiará
        int azar2;  //Se genera esta variable para guardar la posición del elemento que será intercambiado
        aux = sol;    //Se inicializa el arreglo igualandolo a la solución recibida por el método
        azar1=(int) (Math.random()*7);  //Se generan números aleatorios entre 1 y 8, corresponde a la posición del elemento que se intercambiará
        azar2=(int) (Math.random()*7);  //Se generan números aleatorios entre 1 y 8, corresponde a la posición del elemento que se intercambiará
        while (azar1==azar2){           //Mientras las variables sean iguales se repetirá el proceso de elegir otro número al azar, ya que al ser iguales no se pueden intercambar
            azar2=(int) (Math.random()*7);
        }
        auxN=aux[azar1];     //El elemento de la posición azar1 es guardado en la variable 
        aux[azar1]=aux[azar2];  //El elemento de la posición azar1 es intercambiado por el elemento de la posición azar2
        aux[azar2]=auxN;     //El elemento de la posición azar2 es intercambiado por el elemento de la posición azar1 (guardado en auxN)
        return aux;          //Se devuelve el arreglo con las variables ya intercambiadas

    }

    private double acceptance_probability(double old_cost, double new_cost, double temperature) {
        double a;
        a=Math.pow(Math.E,((old_cost-new_cost)/temperature));
        return a;
    }

    public int[] solve() {
        old_cost = cost(solution);
        temperature = 1.0;
        tmin = 0.00001;
        alpha = 0.9;
        int i;
        while (temperature > tmin) {
            i = 1;
            while (i <= 100) {
                new_solution = neighbor(solution);
                new_cost = cost(new_solution);
                double ap = acceptance_probability(old_cost, new_cost, temperature);
                if (ap > r.nextDouble()) {
                    solution = new_solution;
                    old_cost = new_cost;
                }
                i += 1;
            }
            temperature = temperature * alpha;
        }
        return solution;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }


    
}
