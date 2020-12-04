package EntidadLogica;

import EntidadGrafica.*;
import Fabrica.FabricaProyectilAlpha;
import Juego.*;
import Visitor.*;

public class PortadorAlpha extends Enemigo{
	
	public PortadorAlpha(Juego juego){
		super(juego);
		visitor = new VisitorPortadorAlpha(this);
		entidadGrafica = new EntidadGraficaPortadorAlpha(this);
		velocidad = 3;
		proyectil = new FabricaProyectilAlpha(juego);
		cargaViral = 100;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPortadorAlpha(this);
	}
}
