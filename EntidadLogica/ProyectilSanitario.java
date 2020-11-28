package EntidadLogica;

import Inteligencia.*;
import Juego.*;

public abstract class ProyectilSanitario extends EntidadProyectil {

	public ProyectilSanitario(Juego juego) {
		super(juego);
		inteligencia = new InteligenciaProyectilPersonajePrincipal(this);
	}
	
	@Override
	public void setInteligenciaPropia() {
		inteligencia = new InteligenciaProyectilPersonajePrincipal(this);
	}

}
