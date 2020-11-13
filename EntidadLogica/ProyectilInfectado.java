package EntidadLogica;

import Inteligencia.*;
import Juego.Juego;

public abstract class ProyectilInfectado extends EntidadProyectil{

	public ProyectilInfectado(Juego juego) {
		super(juego);
		inteligencia = new InteligenciaProyectilInfectado(this);
	}

}
