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
public class Ejercicio102 {
    public static int sumaRecursiva(int a,int aux){
        if(a>0){
           aux=aux+a;
           return sumaRecursiva((a-1),aux);
        }
        return aux;
    }
    public static void main (String[] args){
        System.out.println("Digite hasta que numero quiere sumar");
        Scanner sc=new Scanner(System.in);
        int a,aux=0;
        a=sc.nextInt();
        System.out.println(sumaRecursiva(a,aux));
    }
}
