package EntidadLogica;

import EntidadGrafica.*;
import Juego.Juego;
import Visitor.*;

public class MejorarArma extends EfectoTemporal {

	public MejorarArma(Juego juego, int x) {
		super(juego);
		System.out.println("CREO MEJORAR ARMA");
		visitor = new VisitorMejorarArma(this);
		entidadGrafica = new EntidadGraficaMejorarArma(this, x);
		velocidad = 100;
		tiempo = 5000;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarMejorarArma(this);
	}

}
