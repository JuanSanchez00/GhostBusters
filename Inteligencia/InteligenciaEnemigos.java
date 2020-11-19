package Inteligencia;

import EntidadLogica.Entidad;

public class InteligenciaEnemigos extends Inteligencia {

	public InteligenciaEnemigos(Entidad entidad) {
		super(entidad);
	}
	
	public void accionar(){
		int y = entidad.getEntidadGrafica().getPosicionY();
		int alturaEntidad = entidad.getEntidadGrafica().getAltura();
		int alturaJuego = entidad.getJuego().getAltura();
		int velocidad = entidad.getVelocidad();
		//si supera la altura del juego, arranca en la parte superior en -alturaEntidad
		y = y + alturaEntidad + velocidad <= alturaJuego ? y + alturaEntidad + velocidad : -alturaEntidad;
		int x = entidad.getEntidadGrafica().getPosicionX();
		entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
	}
}
