package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class ProyectilAlpha extends ProyectilInfectado {

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
