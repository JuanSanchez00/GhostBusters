package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class ProyectilBeta extends ProyectilInfectado {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarProyectilBeta(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		float nuevaCargaViral = (ep.getCargaViral() + this.getDanio());
        if (nuevaCargaViral >= 100) {
            ep.morir();
        }
        else {
            ep.setCargaViral(nuevaCargaViral);
        }
		
	}

}
