package Ahorcado;

import java.util.HashSet;
import java.util.Set;

public class Palabra {
	//Para almacenar la palabra que hay que adivinar
	private String p_oculta;
	//Para almacenar la parte que se ha adivinado de la palabra
	private char[] p_visible;
	/**
	 * Constructor que genera una palabra de forma aleatoria (p_oculta)
	 * tambien inicializa un Array (p_visible) con "_" en cada una de las letras
	 * estos subrayados se iran sustituyendo segun se vayan adividando las letras
	 */
	public Palabra() {
		String[] palabras = { "BATMAN", "SUPERMAN", "HULK", "CENICIENTA",
				"SPIDERMAN", "PINOCHO", "LOBEZNO" };
		int n = (int)Math.floor(Math.random()* palabras.length);
		p_oculta = palabras[n];
		p_visible = new char[p_oculta.length()];
		for (int i = 0; i < p_visible.length; i++) {
			p_visible[i] = '_';
		}
	}
	
	/**
	 * Metodo que sirve para saber si se ha adivinado la palabra
	 * @return devuelve true si la palabra oculta (p_oculta) tiene el mismo contenido que la parte visible (p_visible), false en caso contrario
	 */
	public boolean esta_adivinada(){
		//IMPLEMENTAR
		return false;
	}

	/**
	 * Metodo que sirve para mostrar la parte visible de la palabra (p_visible)
	 * Se imprimen las letras separadas por un espacio y un salto de linea al final
	 */
	public void mostrar_visible() {
		//IMPLEMENTAR
	}

	
	/**
	 * Metodo que busca las letras en la palabra (p_oculta) y ademas, en caso de encontrarla la pone en la parte visible (p_visible) en su posicion correcta
	 * de este modo cuando se imprime la parte visible  
	 * @param c El caracter a buscar en la palabra completa (p_oculta)
	 * @return Se devuelve el n�mero de aciertos, es decir, el numero de veces que aparece c en el palabra (p_oculta)
	 */
	public int buscar(char c) {
		//IMPLEMENTAR
		return 0;
	}
	
	/**
	 * Metodo que cuenta el n�mero de letras diferentes que tiene la palabra (p_oculta)
	 * @return numero de letras diferentes
	 */
    public int letras_diferentes(){
    	//IMPLEMENTAR
    	return 0;
    }
}