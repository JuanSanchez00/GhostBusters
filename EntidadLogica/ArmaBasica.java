package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class ArmaBasica extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarArmaBasica(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		if(ep.cargaViral-this.getDanio()<=0) {
			//ep.morir;
		}
		else {
			ep.setCargaViral(ep.cargaViral-this.getDanio());
		}
		
	}


}
