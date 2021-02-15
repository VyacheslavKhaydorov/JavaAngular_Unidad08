/**
 * 
 */
package tarea8;

/**
 * @author viach
 * Clase Persona
 */
public class Persona {
	
	//Constantes
	private final char SEXO_DEFAULT = 'H';
	
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXO_DEFAULT;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.sexo = SEXO_DEFAULT;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}
