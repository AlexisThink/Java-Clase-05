package mx.com.cetech.Clase05.TemaMetodos;

public class TemaMetodosDOS {
	// MODIFICADOR DE ACCESO (PUBLIC, PRIVATE, PROTECTED, DEFAULT | 
	// TIPO - RETORNO (TIPO DE DATO) | 
	// NOMBRE METODO | 
	// ARGUMENTO
	public static void main(String[] args) 
	{
		TemaMetodosDOS instancia=new TemaMetodosDOS ();
		instancia.suma(5, 10);
	}
public void suma(int numeroUno, int numeroDos){
	int resultado = numeroUno+numeroDos;
	System.out.println(resultado);
}
}
