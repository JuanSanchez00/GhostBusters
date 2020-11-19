package Inteligencia;

import EntidadLogica.Entidad;

public abstract class Inteligencia {
	protected Entidad entidad;
	
	
	public Inteligencia(Entidad entidad) {
		this.entidad = entidad;
	}
	
	public void accionar(){
		
	}
	
	public Inteligencia getInteligenciaAnterior() {
		return this;
	}
}
