package Juego;
import Fabrica.*;

import java.util.LinkedList;
import java.util.List;


public abstract class Nivel {
	
	protected List<FabricaEnemigo> listaFabricas;
	//protected List<Entidad> listaEntidades;
	protected int[] cantidad;
	protected Nivel siguiente;
	protected Juego juego;
	
	public Nivel(Juego juego){
		this.juego = juego;
		listaFabricas = new LinkedList<FabricaEnemigo>();
		listaFabricas.add(new FabricaPortadorAlpha(juego));
		listaFabricas.add(new FabricaPortadorBeta(juego));
	}
	
	/*public List<Entidad> getListaEntidades() {
		return listaEntidades;
	}*/
	
	public Nivel getNivelSiguiente() {
		return siguiente;
	}
	
	public void cargarEnemigos(){
		FabricaEnemigo fabricaActual;
		for(int i = 0; i < cantidad.length; i++){
			fabricaActual = listaFabricas.get(i);
			for(int j = 0; j < cantidad[i]; j++){
				juego.getListaEntidades().add(fabricaActual.devolverEnemigo());
			}
		}
	}

}
