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
	String contraseņa;
	
	//Constructores
	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contraseņa = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseņa = generarContraseņa(longitud);
	}
	
	//Metodo para generar una contraseņa segun longitud
	public String generarContraseņa (int longitud) {
		
		//Variable
		String contraseņa = "";
		int valorUnitario;
		
		for (int i = 0; i < longitud; i++) {
			valorUnitario = ThreadLocalRandom.current().nextInt(0,10);
			contraseņa = contraseņa + Integer.toString(valorUnitario);
		}
		
		return contraseņa;
		
	}
	
	
	
	
}
