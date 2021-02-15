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
	String contraseña;
	
	//Constructores
	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contraseña = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	//Metodo para generar una contraseña segun longitud
	public String generarContraseña (int longitud) {
		
		//Variable
		String contraseña = "";
		int valorUnitario;
		
		for (int i = 0; i < longitud; i++) {
			valorUnitario = ThreadLocalRandom.current().nextInt(0,10);
			contraseña = contraseña + Integer.toString(valorUnitario);
		}
		
		return contraseña;
		
	}
	
	
	
	
}
