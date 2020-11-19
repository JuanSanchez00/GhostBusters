package Inteligencia;

import EntidadLogica.Entidad;

public class InteligenciaTiempoDetenido extends Inteligencia{
	private Inteligencia inteligenciaAnterior;
	
	public InteligenciaTiempoDetenido(Entidad entidad) {
		super(entidad);
		inteligenciaAnterior = entidad.getInteligencia();
	}
	
	public Inteligencia getInteligenciaAnterior() {
		return inteligenciaAnterior;
	}

}
