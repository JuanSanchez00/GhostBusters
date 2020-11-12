package Juego;
import Fabrica.*;
import java.util.List;

import EntidadLogica.Entidad;
import EntidadLogica.EntidadPersonaje;

public abstract class Nivel {
	
	protected List<FabricaEnemigo> listaFrabricas;
	protected List<Entidad> listaEntidades;
	protected int[] cantidad;
	protected Nivel siguiente;
	
	public List<Entidad> getListaEntidades() {
		return listaEntidades;
	}
	
	public Nivel getNivelSiguiente() {
		return siguiente;
	}
}
