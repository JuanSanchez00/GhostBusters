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
		// TODO Auto-generated method stub
		
	}

}
