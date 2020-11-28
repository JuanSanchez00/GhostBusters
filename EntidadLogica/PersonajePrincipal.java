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
		entidadGrafica = new EntidadGraficaPersonajePrincipal(this);
		velocidad = 5;
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

	@Override
	public EntidadProyectil getNuevoProyectil() {
		System.out.println("C");
		return new ProyectilPersonajePrincipal(juego,entidadGrafica.getPosicionX()+entidadGrafica.getAncho()/2,entidadGrafica.getPosicionY());
	}
}
