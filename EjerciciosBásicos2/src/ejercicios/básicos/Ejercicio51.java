/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.básicos;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio51 {
    
    public static void main(String[] args) {
       
        long aux;
        aux=0;
        
        for(int i=0; i<100; i++){
            aux=i*i+ aux;
        }
        
        System.out.println("El resultado de la suma de los 100 primeros cuadrados es: " +aux);
        
    }
}
