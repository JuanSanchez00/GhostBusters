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
		float nuevaCargaViral = (ep.getCargaViral() + this.getDanio()) > 100 ? 100 : ep.getCargaViral() + this.getDanio();
		ep.setCargaViral(nuevaCargaViral);
	}

}
