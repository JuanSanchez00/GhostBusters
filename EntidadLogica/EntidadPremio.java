package EntidadLogica;

import Inteligencia.*;
import Juego.Juego;

public abstract class EntidadPremio extends Entidad {

	public EntidadPremio(Juego juego) {
		super(juego);
		inteligencia = new InteligenciaPremio(this);
		inteligenciaAux = new InteligenciaPremio(this);
	}

}
