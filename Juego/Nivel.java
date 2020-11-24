package Juego;
import Fabrica.*;

import java.util.LinkedList;
import java.util.List;

import EntidadLogica.Entidad;


public abstract class Nivel {
	
	protected List<FabricaEnemigo> listaFabricas;
	protected List<Entidad> listaEntidades;
	protected int[] cantidad;
	protected Nivel siguiente;
	protected Juego juego;
	protected int oleadaActual, cantOleadas;
	
	public Nivel(Juego juego){
		this.juego = juego;
		listaFabricas = new LinkedList<FabricaEnemigo>();
		oleadaActual = 0;
	}
	
	public List<Entidad> getListaEntidades() {
		return listaEntidades;
	}
	
	public Nivel getNivelSiguiente() {
		return siguiente;
	}
	
	public void cargarEnemigos(){
		FabricaEnemigo fabricaActual;
		oleadaActual++;
		for(int i = 0; i < cantidad.length; i++){
			fabricaActual = listaFabricas.get(i);
			for(int j = 0; j < cantidad[i]; j++){
				juego.getListaEntidades().add(fabricaActual.devolverEnemigo());
				listaEntidades.add(fabricaActual.devolverEnemigo());
			}
		}
	}
	
	public boolean enemigosMuertos() {
		return listaEntidades.isEmpty();
	}
	
	public int getOleadaActual() {
		return oleadaActual;
	}
	
	public int getCantOleadas() {
		return cantOleadas;
	}
}
