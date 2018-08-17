

package ejercicios.basicos;

/**
 *
 * @author Kevin Garcia
 */
import java.util.Scanner;
        
public class EjerciciosBasicos {

    public static void main(String[] args) {
        
        int minutos, segundos;
        
        minutos=0;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite una cantidad de segundos para convertirla en minutos");
        segundos = entrada.nextInt();
        
        while(segundos>=60){
            segundos = segundos-60;
            minutos++;
        }
        
        System.out.println("Hay "+minutos+" minutos y "+segundos+" segundos");
    }
    
}
