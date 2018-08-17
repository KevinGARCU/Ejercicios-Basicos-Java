package ejercicios.basicos;

/**
 *
 * @author Kevin Garcia
 */

import java.util.Scanner;

public class Ejercicio052 {
    
    public static void main(String[] args){
        
        int total, aux;
        int numeros;
        
        aux=0;
        
        Scanner num = new Scanner(System.in);
       
        for(int i=0; i<10; i++){
            
            System.out.println("Ingrese el valor #"+(i+1)+" para sumar");
            numeros= num.nextInt();
            
            if(numeros<0){
                aux=numeros+aux;
            }
            
        }
        
        System.out.println("La suma de los numeros negativos es "+aux);
        
    }
}
