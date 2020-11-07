package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class Particula extends ProyectilInfectado {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarParticula(this);
	}

}
