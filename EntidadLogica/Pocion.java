package EntidadLogica;

import EntidadGrafica.*;
import Juego.*;
import Visitor.*;

public class Pocion extends ObjetoPrecioso {

	public Pocion(Juego juego) {
		super(juego);
		visitor = new VisitorPocion(this);
		entidadGrafica = new EntidadGraficaPocion();
		velocidad = 1;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPocion(this);
	}

}
