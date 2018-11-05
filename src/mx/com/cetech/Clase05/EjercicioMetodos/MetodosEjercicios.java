package mx.com.cetech.Clase05.EjercicioMetodos;

import java.util.Scanner;

public class MetodosEjercicios 
{
 void alexis (){
	System.out.println("Hola señor!!!!!!!!");
}
 void paty (int x, int y){
	int resultado = x+y;
	System.out.println(resultado);
}
 boolean mario (int edad){
	 boolean isMayorcito;
	 
	 if (edad >= 18){
		 isMayorcito=true;
	 } else {
		 isMayorcito=false;
	 } 
	 
	 return isMayorcito;
}
 String pablo (){
	//String mensaje = "Hola Mundo"
	 return "Hola Mundo"; 
}
 void miguel (){
	
	 Scanner teclado = new Scanner (System.in);
	 Operaciones instanciar = new Operaciones();
	 
	 float valor;
	 float valor2;
	 
	 System.out.println("Ingrese el numero Uno");
	 valor = teclado.nextFloat();
	 
	 System.out.println("Ingrese el numero Dos");
	 valor2 = teclado.nextFloat();
	 
	 float prom = instanciar.suma(valor, valor2);
	 
	if(prom>=7){
		System.out.println("Aprobaste");
	} else{
		System.out.println("Reprobaste");
	}
	 
}

}
