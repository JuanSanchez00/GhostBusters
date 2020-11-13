package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class ArmaBasica extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarArmaBasica(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		int nuevaCargaViral = ep.cargaViral - this.getDanio();
		if(nuevaCargaViral <= 0) {
			ep.morir();
		}
		else {
			ep.setCargaViral(nuevaCargaViral);
		}
	}


}
