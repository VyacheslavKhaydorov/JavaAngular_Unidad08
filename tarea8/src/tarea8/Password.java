/**
 * 
 */
package tarea8;

import java.util.concurrent.ThreadLocalRandom;	//Para generar un valor aleatorio

/**
 * @author viach
 * Clase Password
 */
public class Password {

	//Constantes
	private final int LONGITUD_DEFAULT = 8;
	
	//Atributos
	int longitud;
	String contrase�a;
	
	//Constructores
	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contrase�a = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContrase�a(longitud);
	}
	
	//Metodo para generar una contrase�a segun longitud
	public String generarContrase�a (int longitud) {
		
		//Variable
		String contrase�a = "";
		int valorUnitario;
		
		for (int i = 0; i < longitud; i++) {
			valorUnitario = ThreadLocalRandom.current().nextInt(0,10);
			contrase�a = contrase�a + Integer.toString(valorUnitario);
		}
		
		return contrase�a;
		
	}
	
	
	
	
}
