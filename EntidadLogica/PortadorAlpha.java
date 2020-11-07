package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class PortadorAlpha extends Enemigo{

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorAlpha(this);
	}

}
