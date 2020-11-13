package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Juego.*;
import Visitor.*;

public class PortadorAlpha extends Enemigo{
	
	public PortadorAlpha(Juego juego){
		super(juego);
		visitor = new VisitorPortadorAlpha(this);
		entidadGrafica = new EntidadGraficaPortadorAlpha();
		velocidad = 1;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorAlpha(this);
	}

}
