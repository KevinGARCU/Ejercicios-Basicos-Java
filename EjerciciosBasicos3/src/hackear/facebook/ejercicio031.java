/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackear.facebook;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class ejercicio031 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor de la factura");
        int factura, descuento;
        descuento=0;
        factura= sc.nextInt();
        if(factura>20000){
            descuento=(factura*20)/100;
            System.out.println("El descuento es de "+descuento);
        }
        else{
            System.out.println("No hay descuento");
        }
        System.out.println("El valor a ´pagar es "+(factura-descuento));
    }
    
}
