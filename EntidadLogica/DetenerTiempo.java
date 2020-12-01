package EntidadLogica;

import EntidadGrafica.*;
import Juego.*;
import Visitor.*;

public class DetenerTiempo extends EfectoTemporal {
	
	public DetenerTiempo(Juego juego, int x) {
		super(juego);
		visitor = new VisitorDetenerTiempo(this);
		entidadGrafica = new EntidadGraficaDetenerTiempo(this, x);
		velocidad = 50;
		tiempo = 3000;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarDetenerTiempo(this);
	}

}
