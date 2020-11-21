package Inteligencia;

import EntidadLogica.*;

public class InteligenciaProyectilInfectado extends Inteligencia{

	public InteligenciaProyectilInfectado(Entidad entidad) {
		super(entidad);
	}
	
	public void accionar() {
		int y = entidad.getEntidadGrafica().getPosicionY();
		int x = entidad.getEntidadGrafica().getPosicionX();
        int alturaJuego = entidad.getJuego().getAltura();
        int velocidad = entidad.getVelocidad();
        int rango = ((ProyectilInfectado) entidad).getRango();
        ProyectilInfectado proyectil = ((ProyectilInfectado) entidad);
        if(rango == 0){
			entidad.desaparecer();
			//entidad.eliminar();
		}else{
			if(rango > velocidad){
				proyectil.setRangoActual(rango-velocidad);
				y = y + velocidad;
				proyectil.getEntidadGrafica().setPosicionY(y);
			}else{
				proyectil.setRangoActual(0);
				y = y + rango;
				proyectil.getEntidadGrafica().setPosicionY(y);
			}
			entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
		}
        if(y >= alturaJuego){
        	entidad.desaparecer();
			entidad.eliminar();
        }
	}
}
