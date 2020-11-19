package Inteligencia;

import java.awt.event.KeyListener;

import EntidadLogica.Entidad;

public abstract class Inteligencia implements KeyListener{
	protected Entidad entidad;
	
	
	public Inteligencia(Entidad entidad) {
		this.entidad = entidad;
	}
	
	public void accionar(){
		
	}
}
