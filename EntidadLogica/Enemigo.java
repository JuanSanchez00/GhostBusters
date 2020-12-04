package EntidadLogica;

import java.util.Random;

import Inteligencia.*;
import Juego.Juego;

public abstract class Enemigo extends EntidadPersonaje {

	public Enemigo(Juego juego) {
		super(juego);
		inteligencia = new InteligenciaEnemigos(this);
	}
	
	public void setInteligenciaPropia() {
		inteligencia = new InteligenciaEnemigos(this);
	}
	
	public void morir() {
		Random rnd = new Random();
		int crearPremio = rnd.nextInt(10)+1;//entre 1 y 10
		if (crearPremio == 1) {
			juego.crearPremio(entidadGrafica.getPosicionX());
		}
		this.juego.EliminarEntidades(this);

	}
	
	public EntidadProyectil getNuevoProyectil() {
		return proyectil.devolverProyectil(entidadGrafica.getPosicionX()+(entidadGrafica.getAncho()/2),entidadGrafica.getPosicionY()+entidadGrafica.getAltura());
	}	
}
