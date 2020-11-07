package Juego;
import Fabrica.*;
import java.util.List;

import EntidadLogica.EntidadPersonaje;

public abstract class Nivel {
	protected List<FabricaEnemigo> listaFrabricas;
	protected List<EntidadPersonaje> listaEntidades;
	protected int[] cantidad;
	protected Nivel siguiente;
	
	public List<EntidadPersonaje> getListaEntidades() {
		return listaEntidades;
	}
	
	public Nivel getNivelSiguiente() {
		return siguiente;
	}
}
