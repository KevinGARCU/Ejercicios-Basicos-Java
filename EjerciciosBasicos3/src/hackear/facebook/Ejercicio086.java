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
public class Ejercicio086 {
    public static boolean Palindromo(String palabra){
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i)!=palabra.charAt(palabra.length()-i-1)){
                return false;
            }
            else{
                i++;
            }
        }
        return true;
    }
   public static void main (String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese una frase (sin espacios) para determinar si es palindroma");
       String palabra= sc.nextLine();
       if(Palindromo(palabra)==true){
           System.out.println("La frase es palindroma");
       }
       else{
           System.out.println("No es palindroma");
       }
   } 
}
