package EntidadLogica;

import Inteligencia.*;
import Juego.Juego;

public abstract class ProyectilInfectado extends EntidadProyectil{
	
	protected int rango;
	
	public ProyectilInfectado(Juego juego) {
		super(juego);
		rango = 100;
		inteligencia = new InteligenciaProyectilInfectado(this);
	}
	
	public int getRango(){
		return rango;
	}
	
	public void setRangoActual(int rangoNuevo){
		rango = rangoNuevo;
	}
}
