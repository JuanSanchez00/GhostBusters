package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.InteligenciaProyectilInfectado;
import Juego.*;
import Visitor.*;

public class ProyectilBeta extends ProyectilInfectado {
	
	public ProyectilBeta(Juego juego, int x, int y) {
		super(juego);
		visitor = new VisitorProyectilBeta(this);
		entidadGrafica = new EntidadGraficaProyectilBeta(this,x,y);
		velocidad =50;	
		danio = 50;
}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarProyectilBeta(this);
	}

}
