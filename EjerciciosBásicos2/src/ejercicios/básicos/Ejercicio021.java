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
import java.util.Scanner;
public class Ejercicio021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        int a;
        int b;
      
       Scanner sc =new Scanner (System.in); 
       
       System.out.println("Ingrese las coordenadas del rectangulo (x1,y1,x2,y2)");
       
       x1 = sc.nextInt();
       
       y1 = sc.nextInt();
         
       x2 = sc.nextInt();
       
       y2 = sc.nextInt(); 
       
       if(x2>x1){
           a=x2-x1;
       }
       else{
           a=x1-x2;
       }
       if(y2>y1){
           b=y2-y1;
       }
       else{
           b=y1-y2;
       }
       
       System.out.println("El area es de " +a*b);
    }
    
}
