package ejercicios.basicos;

import java.util.Scanner;

public class principal{
	public static void main (String[] args) {
		
		int i;
		char a;
		String fecha1 = "", hora1 = "", lugar1 = "", descripcion1 ="";
		
		list actividad[] = new list[10];
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println( "Esta es nuestra lista de actividades. " );
		
		for ( i = 0; i < actividad.length; i++ ) {
			
			System.out.println( "Ingrese la fecha de la actividad: " );
			fecha1 = teclado.nextLine();
			
			System.out.println( "A que hora inicio?: " );
			hora1 = teclado.nextLine();
			
			System.out.println( "Cual fue el lugar?: " );
			lugar1 = teclado.nextLine();
			
			System.out.println( "Anexe una descripcion del evento (maximo 50 caracteres): " );
			descripcion1 = teclado.nextLine();
			
			actividad[i] = new list ( fecha1, hora1, lugar1, descripcion1 );
			
			System.out.println( "Quiere: \nA. Ver la lista;\nB. Continuar agregando actividades;\nC. Salir. " );
			a = teclado.next().charAt(0);
			
			switch(a){
				case 'a': 	System.out.printf( "Fecha: %s\n", actividad[i].getFecha() );
							System.out.printf( "Hora: %s\n", actividad[i].getHora() );
							System.out.printf( "Lugar: %s\n", actividad[i].getLugar() );
							System.out.printf( "Descripcion: %s\n", actividad[i].getDescripcion() );
							break;
				case 'b': break;
				case 'c': break;
				}
			
			teclado.nextLine();
			}
			
	}
}