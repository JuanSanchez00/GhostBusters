package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Visitor.*;
import Juego.*;

public class ArmaBasica extends ProyectilSanitario {
	
	public ArmaBasica(Juego juego){
		super(juego);
		visitor = new VisitorArmaBasica(this);
		entidadGrafica = new EntidadGraficaArmaBasica();
		velocidad = 1;
	}
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarArmaBasica(this);
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
