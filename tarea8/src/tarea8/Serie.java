/**
 * 
 */
package tarea8;

/**
 * @author viach
 * Clase Serie
 */
public class Serie {

	//Constantes
	private final int NUM_TEMPORADAS_DEFAULT = 3;
	private final boolean ENTREGADO = false;
	
	//Atributos
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructores
	public Serie() {
		this.titulo = "";
		this.creador = "";
		this.numTemporadas = NUM_TEMPORADAS_DEFAULT;
		this.genero = "";
		this.entregado = ENTREGADO;
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = NUM_TEMPORADAS_DEFAULT;
		this.genero = "";
		this.entregado = ENTREGADO;
	}


	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO;
	}
	
	
	
}
