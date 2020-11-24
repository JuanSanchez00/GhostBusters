package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Juego.Juego;
import Visitor.*;

public class PersonajePrincipal extends EntidadPersonaje{
	
	public PersonajePrincipal(Juego juego) {
		super(juego);
		inteligencia = new InteligenciaPersonajePrincipal(this);
		visitor = new VisitorPersonajePrincipal(this);
		entidadGrafica = new EntidadGraficaPersonajePrincipal();
		velocidad = 1;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPersonajePrincipal(this);
	}
	
	public void setInteligencia(Inteligencia inteligencia) {//no hace nada, para que al detener el tiempo pueda seguir moviendose

	}

	@Override
	public void setInteligenciaPropia() {

	}
}
