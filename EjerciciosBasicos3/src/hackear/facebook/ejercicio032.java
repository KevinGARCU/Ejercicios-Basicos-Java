package hackear.facebook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Nicolás
 */
public class ejercicio032 {
    public static void main (String[] args) throws InterruptedException, IOException{
        System.out.println("Ingrese las horas, minutos y segundos");
        int h,m,s;
        int h1=0,m1=0,s1=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Horas:");
        h=sc.nextInt();
        System.out.println("Minutos: ");
        m=sc.nextInt();
        System.out.println("Segundos: ");
        s=sc.nextInt();
        while(h>=h1 && m>=m1 && s>=s1){
            System.out.println(h1+m1+s1);
            s1++;
            if(s1==60){
              s1=0;
              m1++;
              if(m1==60){
               m1=0;
               h1++;
              }
            }
        Thread.sleep(1000);
        Runtime.getRuntime().exec("cls");
        }
    }
}
