package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class DetenerTiempo extends EfectoTemporal {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarDetenerTiempo(this);
	}

}
