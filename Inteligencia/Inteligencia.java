package Inteligencia;

import java.awt.event.KeyListener;

import EntidadLogica.Entidad;

public abstract class Inteligencia implements KeyListener{
	protected Entidad entidad;
	protected Inteligencia inteligenciaAnterior;
	
	public Inteligencia(Entidad entidad,Inteligencia anterior) {
		this.entidad = entidad;
		inteligenciaAnterior = anterior;
	}
	
	public void accionar(){
		
	}
	
	public Inteligencia getInteligenciaAnterior() {
		return this;
	}
}
