package EntidadLogica;

import EntidadGrafica.*;
import Juego.*;
import Visitor.*;

public class ProyectilBeta extends ProyectilInfectado {
	
	public ProyectilBeta(Juego juego) {
		super(juego);
		visitor = new VisitorProyectilBeta(this);
		entidadGrafica = new EntidadGraficaProyectilBeta();
		velocidad = 1;	
}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarProyectilBeta(this);
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
