package EntidadLogica;

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
	
}
