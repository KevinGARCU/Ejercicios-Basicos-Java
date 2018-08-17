/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackear.facebook;
import java.util.Scanner;
/**
 *
 * @author Nicolás
 */
public class Ejercicio101 {
    public static int multiplicacion(int a, int b, int aux){
        if(b>0){
            aux=aux+a;
            return multiplicacion(a,(b-1),aux);
        }
        else{
            return aux;
        }
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Que multiplicacion quiere hacer?");
        int a,b;
        int aux=0;
        System.out.println("_x_");
        a=sc.nextInt();
        System.out.println(a+"x_");
        b=sc.nextInt();
        System.out.println(a+"x"+b);
        System.out.println(multiplicacion(a,b,aux));
    }
}