package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Juego.*;
import Visitor.*;

public class ProyectilAlpha extends ProyectilInfectado {
	
	public ProyectilAlpha(Juego juego, int x, int y){
		super(juego);
		visitor = new VisitorProyectilAlpha(this);
		entidadGrafica = new EntidadGraficaProyectilAlpha(this,x,y);
		velocidad = 50;
		danio = 50;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarProyectilAlpha(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		int nuevaCargaViral = (ep.getCargaViral() + this.getDanio());
		if (nuevaCargaViral >= 100) {
			ep.morir();
		}
		else {
			ep.setCargaViral(nuevaCargaViral);
		}
	}

}
