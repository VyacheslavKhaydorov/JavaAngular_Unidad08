/**
 * 
 */
package tarea8;

/**
 * @author viach
 * Clase Electrodomestico
 */
public class Electrodomestico {

	//Constantes
	private final double PRECIO_BASE_DEFAULT = 100;
	private final String COLOR_DEFAULT = "blanco";
	private final char CONSUMO_DEFAULT = 'F';
	private final double PESO_DEFAULT = 5;
	
	//Atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	//Variables
	String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
	char[] tiposConsumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
		
	//Constructores
	//Contructor base con los atributos inicializados
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}
	
	//Constructor con precioBase y peso como parámetros
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = peso;	
	}
	
	//Constructor con precioBase, color, consumoEnergetico y peso (todos los atributos) como parámetros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;		
	}
	
}
