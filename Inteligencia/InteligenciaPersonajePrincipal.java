package Inteligencia;

import EntidadLogica.Entidad;

public class InteligenciaPersonajePrincipal extends Inteligencia {
	
	public InteligenciaPersonajePrincipal(Entidad entidad) {
		super(entidad);
	}
	
	public void moverDerecha() {
		int x = entidad.getEntidadGrafica().getPosicionX();
		int anchoEntidad = entidad.getEntidadGrafica().getAncho();
		int anchoJuego = entidad.getJuego().getAncho();
		int velocidad = entidad.getVelocidad();
		x = x + anchoEntidad + velocidad <= anchoJuego ? x + anchoEntidad + velocidad : anchoJuego - anchoEntidad;
		int y = entidad.getEntidadGrafica().getPosicionY();
		entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
	}
	
	public void moverIzquierda() {
		int x = entidad.getEntidadGrafica().getPosicionX();
		int velocidad = entidad.getVelocidad();
		x = x  - velocidad >= 0 ? /*x +-*/ x  - velocidad : 0;
		int y = entidad.getEntidadGrafica().getPosicionY();
		entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
	}
	
}
