import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) 
	{
		
		//Recursos
		Scanner teclado = new Scanner (System.in);
		int i=0;
		int calificacionesRegistrar = 0;
		//****************************************
		
		//Pregunta al usuario
		System.out.println("Cuantas calificaciones desea registrar");
		
		//Calificaciones que se van a registrar
		
		calificacionesRegistrar = teclado.nextInt();
		int [] tablaCalificaciones  = new int [calificacionesRegistrar];
		
		//Colocacion de datos en el Array	
		for(i=0; i<tablaCalificaciones.length; i++){
			System.out.println("Calificacion "+(i+1));
			tablaCalificaciones [i] = teclado.nextInt();}
		
		//Promedio
		float resultado; 
		}
	}


