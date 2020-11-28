package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Juego.*;
import Visitor.*;

public class PortadorBeta extends Enemigo {

	public PortadorBeta(Juego juego) {
		super(juego);
		visitor = new VisitorPortadorBeta(this);
		entidadGrafica = new EntidadGraficaPortadorBeta(this);
		velocidad = 10;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorBeta(this);
	}

	@Override
	public EntidadProyectil getNuevoProyectil() {
		return new ProyectilBeta(juego,entidadGrafica.getPosicionX()+(entidadGrafica.getAncho()/2),entidadGrafica.getPosicionY()+entidadGrafica.getAltura());
	}
	

}
