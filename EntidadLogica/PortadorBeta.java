package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class PortadorBeta extends Enemigo {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorBeta(this);
	}

}
