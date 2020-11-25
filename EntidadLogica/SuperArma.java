package EntidadLogica;

import EntidadGrafica.*;
import Juego.*;
import Visitor.*;

public class SuperArma extends ProyectilSanitario {

	public SuperArma(Juego juego) {
		super(juego);
		visitor = new VisitorSuperArma(this);
		entidadGrafica = new EntidadGraficaSuperArma(this);
		velocidad = 1;
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarSuperArma(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		int nuevaCargaViral = ep.cargaViral - this.getDanio();
		if(nuevaCargaViral <= 0) {
			ep.morir();
		}
		else {
			ep.setCargaViral(nuevaCargaViral);
		}
	}
}
