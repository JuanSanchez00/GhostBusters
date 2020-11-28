package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Juego.*;
import Visitor.*;

public class PortadorAlpha extends Enemigo{
	
	public PortadorAlpha(Juego juego){
		super(juego);
		visitor = new VisitorPortadorAlpha(this);
		entidadGrafica = new EntidadGraficaPortadorAlpha(this);
		velocidad = 30;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorAlpha(this);
	}

	@Override
	public EntidadProyectil getNuevoProyectil() {
		return new ProyectilAlpha(juego,entidadGrafica.getPosicionX()+(entidadGrafica.getAncho()/2),entidadGrafica.getPosicionY()+entidadGrafica.getAltura());
	}
	

}
