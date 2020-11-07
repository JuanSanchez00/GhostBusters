package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class Pocion extends ObjetoPrecioso {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPocion(this);
	}

}
