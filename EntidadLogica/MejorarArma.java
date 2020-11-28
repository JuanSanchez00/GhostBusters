package EntidadLogica;

import EntidadGrafica.*;
import Juego.Juego;
import Visitor.*;

public class MejorarArma extends EfectoTemporal {

	public MejorarArma(Juego juego, int x) {
		super(juego);
		visitor = new VisitorMejorarArma(this);
		entidadGrafica = new EntidadGraficaMejorarArma(this, x);
		velocidad = 1;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarMejorarArma(this);
	}

}
