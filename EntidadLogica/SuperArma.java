package EntidadLogica;

import Visitor.Visitor;

public class SuperArma extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarSuperArma(this);
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
