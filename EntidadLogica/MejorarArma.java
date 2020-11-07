package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class MejorarArma extends EfectoTemporal {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarMejorarArma(this);
	}

}
