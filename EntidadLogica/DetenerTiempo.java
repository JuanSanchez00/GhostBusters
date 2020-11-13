package EntidadLogica;

import EntidadGrafica.*;
import Juego.*;
import Visitor.*;

public class DetenerTiempo extends EfectoTemporal {
	
	public DetenerTiempo(Juego juego) {
		super(juego);
		visitor = new VisitorDetenerTiempo(this);
		entidadGrafica = new EntidadGraficaDetenerTiempo();
		velocidad = 1;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarDetenerTiempo(this);
	}

}
